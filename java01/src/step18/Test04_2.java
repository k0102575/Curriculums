/* 소켓 프로그래밍: 파일 전송 클라이언트 프로그램 */

package step18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataOutputStream;

public class Test04_2 {
  public static void main(String[] args) throws IOException {

    System.out.println("step18 Test04_2 클라이언트 실행중");
    System.out.println();

    if (args.length < 1) {
      System.out.println("[사용법] > java -cp bin step18.Test04_2 서버주소 포트번호 파일명");
      return;
    }
    
    File file = new File(args[2]); 
    // 오토클로저블규칙에 따라 만든 클래스만 넣을수 있다.
    
    try (
    BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream("temp/" + file));
    
    Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
    Scanner in = new Scanner(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(
                           new BufferedOutputStream(socket.getOutputStream()));) {
      
      // Dataoutput스트림인데 중간에 buffered를 끼워넣는다.
      // 데코레이터 
      
      // 서버로 데이터 보내기
      
      // 1) 파일명 보내기
      out.writeUTF(file.getName());
      
      // 2) 파일크기 보내기
      out.writeLong(file.length());
      
      // 3) 파일 보내기
      
      for (long i = 0; i < file.length(); i++) {
        out.writeByte(fileIn.read());
      }
      
      out.flush();
      
      // 4) 서버가 보낸 데이터 읽기
      
      System.out.println(in.nextLine());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }  // main
}
