/* 소켓 프로그래밍: 서버 프로그램 만들기 */

package step18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_1 {
  public static void main(String[] args) throws IOException {
    
    System.out.println("step18 Test01_1 서버 실행중");
    System.out.println();
    
    // 1) 서버 소켓 만들기
    ServerSocket serverSocket = new ServerSocket(8888);
    
    // 2) 대기열에 첫 번째 클라이언트의 접속을 승인한다.
    
    Socket socket = serverSocket.accept();
    
    // 3) 소켓을 통해 입출력을 할 수 있도록 스트림 객체를 만든다.
    
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    // 4) 소켓으로 클라이언트와 연결되면 데이터를 주고 받는 순서는 상관없다.
    
    int b = in.read();
    System.out.printf("%s\n", b);
    
    out.write(0x01);
    
    // 5) 클라이언트와 데이터 입출력이 끝났으면 연결을 끊는다.
    
    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    
  }  // main
}
