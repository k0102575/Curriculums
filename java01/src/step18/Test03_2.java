/* 소켓 프로그래밍: 여러 클라이언트의 요청을 처리하기(서버) - Thread 적용 */

package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test03_2 {
  
  // 클라이언트 요청을 처리할 작업자를 정의한다.
  
  static class MyThread extends Thread {
    Socket socket;
    
    public MyThread(Socket socket) {
      this.socket = socket;
    }
    
    public void run () {
      try (
        InputStream in0 = socket.getInputStream();
        OutputStream out0 = socket.getOutputStream();
        Scanner in = new Scanner(in0);
        PrintStream out = new PrintStream(out0);
        ) {
        System.out.println("=> 클라이언트 연결 승인!");
        String str = in.nextLine();
        out.println(str);
        } catch (Exception e) {}
    }
    
    
  }
  public static void main(String[] args) throws Exception {
    
    System.out.println("step18 Test03_1 서버 실행중");
    System.out.println();
    
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("=> 서버 소켓 생성 완료!");
    
    Socket socket = null;
    
    while (true) {
      MyThread t = new MyThread(serverSocket.accept());
      
      t.start();
      
    } // while
    
//    serverSocket.close(); 무한 루프기 때문에 언제 끝날지 모른다 
    
  }  // main
}
