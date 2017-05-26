/* 소켓 프로그래밍: 파일 전송 서버 프로그램 */

package step18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04_1 {
  public static void main(String[] args) throws IOException {

    System.out.println("step18 Test04_1 서버 실행중");
    System.out.println();

    ServerSocket serverSocket = new ServerSocket(8888);

    while (true) {

      try 
      (
      Socket socket = serverSocket.accept();
      DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
      PrintStream out = new PrintStream(socket.getOutputStream());
      )
        // 클라이언트 보낸 데이터 읽기
        // 1) 파일명 읽기
      {
      String filename = in.readUTF();
      // 2) 파일크기 읽기
      long length = in.readLong();
        // 3) 파일 읽기
        // => 파일 출력 스트림을 준비
        try 
        (
        BufferedOutputStream fileout = new BufferedOutputStream(new FileOutputStream("temp/" + filename));
        )
        {
        for (int i =0; i < length; i++){
          fileout.write(in.read());
        }
        fileout.flush();
        } catch (Exception e) {
          System.out.println("파일 저장 중 오류 발생!");
        }
        // 4) 응답하기
        out.println("ok" );
      } catch (Exception e) {
        e.printStackTrace();
      }

    } // while

  }  // main
}
