/* 소켓 프로그래밍 : 채팅 서버 만들기 - v2
 */
package step18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Test08_v2 {
  
  ArrayList<ChatJob> chatJobs = new ArrayList<> ();
  
  class ChatJob implements Runnable {
    Socket socket ;
    PrintStream out;
    
    public ChatJob(Socket socket) {
      this.socket = socket;
      chatJobs.add(this);
    } // ChatJob
    
    public void run() {
      try (
        Socket socket = this.socket;
        BufferedReader in = new BufferedReader(
                              new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());
      ) {
        this.out = out;
        String alias = in.readLine();
        sendAll(String.format("[%s]님이 입장하였습니다.\n", alias));
        
        while (true) {
          String message = in.readLine();
          if (message == null) // 클라이언트에서 종료 신호를 보낸다면 
            break; // 입출력을 끝낸다.
          
          sendAll(message + '\n');
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } // run()
    
    public void send(String message) throws Exception {  // 자기 클라이언트에게 보내는것 메시지
        out.println(message);
        out.flush();
       
    } // send()
  } // class chatJob
  
  public void listen(int port) throws Exception {
    ServerSocket serverSocket = new ServerSocket(port);
    System.out.println("Test 08_2 서버 실행 중...");
    
    while (true) {
      new Thread(new ChatJob(serverSocket.accept())).start();
    }
  } // listen()
  
  synchronized public void sendAll(String message) {
      for (int i = chatJobs.size() -1; i >=0; i--) {
        try {
          chatJobs.get(i).send(message);
          } catch (Exception e) {
            chatJobs.remove(i);
          } // try ~ catch
        // 뒤에서 부터 연락처를 보낸다. 무효한 것은 지운다.
        // 프로그램 실행중 예외가 발생했을떄 실행을 멈추지 않고 적당히 처리하는것
        // 모든 연락처를 가지고 있다.
      } // for 
  } // send()
  
  public static void main(String[] args) throws Exception {
    Test08_v2 server = new Test08_v2();
    server.listen(8888);
  }
}



