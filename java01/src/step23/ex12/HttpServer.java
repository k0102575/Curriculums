/* 웹 애플리케이션 실행하기 - 서블릿 객체 생성 자동화 */

package step23.ex12;

import java.io.File;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;


public class HttpServer {
  
  int port;
  HashMap<String,Command> servletMap = new HashMap<>();
  
  String currBinDirPath;
  
  ArrayList<Class> classes = new ArrayList <>();
  
  public HttpServer(int port) throws Exception {
    this.port = port;
    
    currBinDirPath = new File("./bin/").getCanonicalPath().replaceAll("\\\\", "/") + "/";
    findClassFile(new File("./bin/"), "step23.ex12");
    
    for (Class clazz : classes) {
      WebServlet anno = (WebServlet) clazz.getAnnotation(WebServlet.class);
      if (anno == null) continue;
      servletMap.put(anno.url(), (Command) clazz.newInstance());
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
  
  private void findClassFile(File path,String packageName) throws Exception {
    File [] files = path.listFiles((File pathname) -> {
        if (pathname.isDirectory())
          return true;
        if (pathname.getName().endsWith(".class") && pathname.getName().indexOf('$') <0)
          // 디렉토리랑 . 클래스 파일만 저장된다.
          return true;
        return false;
      // 오브젝트 기본생성자를 사용 
      // 람다문법 사용 인터페이스나 메서드 중에서 딱 하나만 구현하는 경우
    }); // file[] files
    
    for (File file : files) {
      if(file.isDirectory()){
        findClassFile(file, packageName);
      } else{
        String classFullName = file.getCanonicalPath()
                                                  .replaceAll("\\\\", "/")
                                                  .replaceAll(this.currBinDirPath, "")
                                                  .replaceAll("/", ".")
                                                  .replaceAll(".class", "");
        if (classFullName.startsWith(packageName)) {
          classes.add(Class.forName(classFullName));
        }
        
      }
    } // for
    
  } // findClassFile

  public static void main(String[] args) throws Exception {
    System.out.println("step23 ex12");System.out.println();

    HttpServer server = new HttpServer(8888);
    server.listen();

  }

}
