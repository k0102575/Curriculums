/* 소켓 프로그래밍: 서버 프로그램 만들기 */

package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test02_1 {
  public static void main(String[] args) throws Exception {
    
    System.out.println("step18 Test02_1 서버 실행중");
    System.out.println();
    
    ServerSocket serverSocket = new ServerSocket(8888, 3);
    System.out.println("=> 서버 소켓 생성 완료!");
    
    Socket socket = serverSocket.accept();
    System.out.println("=> 클라이언트 연결 승인!");
    
    InputStream in0 = socket.getInputStream();
    OutputStream out0 = socket.getOutputStream();
    
    Scanner in = new Scanner(in0);
    PrintStream out = new PrintStream(out0);
    
    String str = in.nextLine();
    out.println(str);
    
    in.close();
    in0.close();
    out.close();
    out0.close();
    socket.close();
    serverSocket.close();
    
  }  // main
}
