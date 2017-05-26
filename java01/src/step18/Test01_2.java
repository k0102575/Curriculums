/* 소켓 프로그래밍: 클라이언트 프로그램 만들기 */

package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test01_2 {
  public static void main(String[] args) throws Exception {
    
    System.out.println("step18 Test01_1 클라이언트 실행중");
    System.out.println();
    
    // 1) 클라이언트 소켓 만들기
    
    Socket socket = new Socket("localhost", 8888);
    
    // 2) 소켓을 통해 입출력을 할 수 있또록 스트림 객체를 만든다.
    
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    // 3) 서버에서 먼저 읽는다면, 클라이언트는 먼저 데이터를 보내야한다
    
    out.write(0x77);
    
    int b = in.read();
    System.out.printf("%x\n", b);
    
    // 4) 서버와의 데이터 입출력이 끝났으면 연결을 끊는다.
    in.close();
    out.close();
    socket.close();
    
  }  // main
}
