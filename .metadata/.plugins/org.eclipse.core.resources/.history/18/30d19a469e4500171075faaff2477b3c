/* 웹 서버 만들기 - 3) 소켓을 통해 입출력을 할 수 있게 스트림 객체를 준비 */

package step23.ex4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
  int port;

  public HttpServer(int port) {
    this.port = port;
  } // 생성자

  public void listen() throws Exception{
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행중... ");

    while (true) {

      try(
          Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
          // 소켓의 인풋스트림을 한줄씩 읽는 버퍼드 리더를 쓰고싶은데 그 중간 어탭터로 인풋스트림 리더를 쓴다.
          // 브라우저는 라인 단위로 데이터를 보낸다. 스캐너도 라인 단위로 읽는다.
          // output스트림의 기본클래스 프린트스트림
          // 출력 할떄 가운데 버퍼를 넣었다 버퍼가 꽉차면 출력하기 위해서 중간에 출력하려면 flush를 써라! 
          ) {
        System.out.println("클라이언트가 연결되었습니다! ");
      } // try
    
    } // while

  } // listen()

  public static void main(String[] args) throws Exception {
    System.out.println("step23 ex4");System.out.println();

    HttpServer server = new HttpServer(8888);
    server.listen();

  }
}
