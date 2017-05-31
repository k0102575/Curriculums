/* 웹 애플리케이션 실행하기 - 서블릿 객체 생성 자동화 */

package step23.ex11;

import java.io.FileReader;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class HttpServer {
  int port;
  HashMap<String,Command> servletMap = new HashMap<>();
  
  public HttpServer(int port) throws Exception {
    this.port = port;
    
    Properties props = new Properties();
    props.load(new FileReader("src/step23/ex11/web.properties"));
    Set<String> urlSet = props.stringPropertyNames();
    
    // props에서 키 값을 받아오는 함수는 많다.
    // stringPropertyNames는 set<string>으로 리턴하기 때문에 이걸 사용했다.
    // 다른걸 하면은 또 타입캐스팅해야되기 때문에 이메서드를 사용한다.
    
    for (String url : urlSet) {
      String classFullName = props.getProperty(url);
      Class clazz = Class.forName(classFullName);
      servletMap.put(url, (Command) clazz.newInstance());
      // 1은 string이고 2는 command다 그래서 형변환 해야 한다.
      // 형변환은 컴파일러를 속이는거다.
    }
    
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
    System.out.println("step23 ex11");System.out.println();

    HttpServer server = new HttpServer(8888);
    server.listen();

  }

}
