/* 웹 서버 만들기 - 2) 클라이언트 연결을 받기 */

package step23.ex3.copy;

import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
  int port;
  
  public HttpServer(int port) {
    this.port = port;
  }
  
  public void listen() throws Exception{
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행중... ");
    
    while (true) {
      Socket socket = serverSocket.accept();
      System.out.println("클라이언트가 연결되었습니다! ");
    }
    
  }
  
  public static void main(String[] args) throws Exception {
    System.out.println("step23 ex3");System.out.println();
    
    HttpServer server = new HttpServer(8888);
    server.listen();
    
  }
}
