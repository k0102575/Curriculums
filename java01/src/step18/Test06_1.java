/* 소켓 프로그래밍: Echo 서버 만들기 */

package step18;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test06_1 {
  
  static class EchoThread extends Thread {
    Socket socket;
    
    public EchoThread(Socket socket) {
      this.socket = socket;
    } // EchoThread
    
    public void run() {
      try 
      (
      Socket socket = this.socket;
      // try 블럭을 벗어기전에 클로즈 된다.
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream());
      ) 
      {
        String message = in.nextLine();
        out.println("[KIM]  " + message);
      } catch (Exception e) {}
    } // run()
    
  } // class EchoThread
  
  public static void main(String[] args) throws IOException {
    
    ServerSocket serverSocket = new ServerSocket(8888);
    
    System.out.println("step18 Test06_1 서버 실행중");
    System.out.println();
    
    while (true) {
      new EchoThread(serverSocket.accept()).start();
      // 바로 시작해라 변수 선언을 줄여라
      // 생성자 메서드.start가 아니다
      // 에코쓰레드 객체가 만들어지면 start해라
      // 서버소켓accept가 리턴되면 그떄 생성자를 호출한다.
    }
    
  }  // main
}
