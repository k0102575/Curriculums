/* 소켓 프로그래밍: 파일 전송 서버 프로그램 - 서버 */

package step18;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04_v1 {
  public static void main(String[] args) throws IOException {

    System.out.println("step18 Test04_1 서버 실행중");
    System.out.println();


    ServerSocket serverSocket = new ServerSocket(8888);

    while (true) {
//      Socket socket = serverSocket.accept();
//      InputStream in0 = socket.getInputStream();
//      OutputStream out0 = socket.getOutputStream();
//      BufferedInputStream in1 = new BufferedInputStream(in0);
//      DataInputStream in = new DataInputStream(in1);
//      PrintStream out = new PrintStream(out0);
      
      try {
      Socket socket = serverSocket.accept();
      DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
      PrintStream out = new PrintStream(socket.getOutputStream());
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        
        in.close();
        out.close();
        socket.close();
      }
    } // while

  }  // main
}
