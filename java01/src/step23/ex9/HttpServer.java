/* 웹 애플리케이션 실행하기 - HttpProcessor 클래스를 패키지 멤버 클래스로 분리한다. */

package step23.ex9;

import java.net.ServerSocket;

public class HttpServer {
  int port;
  
  public HttpServer(int port) {
    this.port = port;
  } // 생성자

  public void listen() throws Exception{
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행중...");

    while (true) {
      new HttpProcessor(serverSocket.accept()).start();
    } // while

  } // listen()

  public static void main(String[] args) throws Exception {
    System.out.println("step23 ex9");System.out.println();

    HttpServer server = new HttpServer(8888);
    server.listen();

  }

}
