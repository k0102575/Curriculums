/* 웹 애플리케이션 실행하기 - Command 패턴 적용 
 * - 메서드를 객체화 시켜는 설계 기법
 * - 한개의 메서드를 한개의 클래스로 정의하는 방식을 말한다.
 * - 기능을 추가할 떄 마다 메서드를 추가 할때 마다ㅣ 메서드를 추가해야 하는 경우에 사용한다 
 * - 메서드를 추가하는 것 보다 클래스를 추가 하는 것이 유지보수를 더 쉽게 해주기 때문이다.
 * */

package step23.ex10;

import java.net.ServerSocket;
import java.util.HashMap;

public class HttpServer {
  int port;
  HashMap<String,Command> servletMap = new HashMap<>();

  
  public HttpServer(int port) {
    this.port = port;
    
    servletMap.put("/hello", new HelloServlet());
    servletMap.put("/ok", new OkServlet());
    servletMap.put("error", new ErrorServlet());
  } // 생성자

  public void listen() throws Exception{
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행중...");

    while (true) {
      new HttpProcessor(serverSocket.accept(), servletMap).start();
      // 클라이언트 
    } // while

  } // listen()

  public static void main(String[] args) throws Exception {
    System.out.println("step23 ex10");System.out.println();

    HttpServer server = new HttpServer(8888);
    server.listen();

  }

}
