/* 웹 서버 만들기 - 5) 멀티쓰레드 적용 */

package step23.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
  int port;

  public HttpServer(int port) {
    this.port = port;
  } // 생성자

  public void listen() throws Exception{
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행중...");

    while (true) {
      new HttpProcessor(serverSocket.accept()).start();
    } // while

  } // listen()

  public static void main(String[] args) throws Exception {
    System.out.println("step23 ex6");System.out.println();

    HttpServer server = new HttpServer(8888);
    server.listen();

  }
  
  class HttpProcessor extends Thread {
    Socket socket;
    
    public HttpProcessor(Socket socket) {
      this.socket = socket;
    } // 생성자
    
    public void run() {
      try(
          Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
          ) {

        String line = null;
        boolean requestLine = true;
        while (true) {
          line = in.readLine();
          if (line.isEmpty())
            break;
          
          if (requestLine) {
            System.out.println(line);
            requestLine = false;
          }
          // 리퀘스트 라인일떄만 딱 한줄 출력한다!
        } // while

        out.println("HTTP/1.1 200 OK");
        out.println("Server: BIT Server");
        out.println();
        out.println("<html>");
        out.println("<head>");
        out.println(" <meta charset='UTF-8'>");
        out.println(" <title>hello</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>안녕 하세요!</h1>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } // try ~ catch
      
    } // run()
    
  } // class HttpProcessor
  
}
