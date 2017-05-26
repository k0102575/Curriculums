/* 소켓 프로그래밍: Echo 클라이언트 만들기 */

package step18;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test06_2 {
  public static void main(String[] args) throws IOException {

//    System.out.println("step18 Test06_2 클라이언트 실행중");
//    System.out.println();

    if (args.length < 3) {
      System.out.println("[사용법] > java -cp bin step18.Test06_2 서버주소 포트번호 메시지");
      return;
    }
    
    try 
    (
    Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    ) 
    {
      out.println(args[2]);
      System.out.println(in.nextLine());
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }  // main
}
