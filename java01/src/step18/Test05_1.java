/* 소켓 프로그래밍: HTTP 클라이언트 만들기 */

package step18;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Test05_1 {
  public static void main(String[] args) throws IOException {
//
//    System.out.println("step18 Test05_1 클라이언트 실행중");
//    System.out.println();

    if (args.length < 1) {
      System.out.println("[사용법] > java -cp bin step18.Test05_1 URL");
      return;
    }
    
    //  http:// 를 빈문자열로 만들어라
    String url = args[0].replace("http://", "");
    String host = null;
    
    int port = 80;
    int colonIndex = url.indexOf(":");
    int firstSlashIndex = url.indexOf("/");
    String path = url.substring(firstSlashIndex);  // 슬레쉬 포함 
    
    if (colonIndex >= 0) {
      host = url.substring(0, colonIndex);
      port = Integer.parseInt(url.substring(colonIndex + 1, firstSlashIndex));
    } else {
      host = url.substring(0, firstSlashIndex);
    }
    
    try 
    (
    
    Socket socket = new Socket(host, port);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    // BufferedReader 사이트에서 보내주는 캐릭터 스트림을 받기 위해 버퍼드 리더를 쓴다.
    // 바이트 스트림을 캐릭터 스트림에 꼿는다.
    PrintStream out = new PrintStream(
                           new BufferedOutputStream(socket.getOutputStream()));
    ) 
    {
      // HTTP 서버에게 요청 데이터를 보낸다.
      // 1) request line - 예) GET /test/ok/index.hjtml HTTP/1.1 CRLF
      out.printf("GET %s HTTP/1.1\n", path);
      
      // 2) header (general + request + entity)
      out.printf("Host: %s\n", host);
      
      // 3) 요청 데이터의 끝을 의미하는 줄 바꿈 코드를 보낸다.
      out.println();
      out.flush();
      
      String str = null;
      while (true) {
        str = in.readLine();
        System.out.println(str);
        if (str.length() == 0) {
          break;
        }
      } // while
      
      int ch = 0;
      while ((ch = in.read()) != -1) {
        System.out.print((char)ch);
       
      } // while
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }  // main
}
