/* 웹 서버 만들기
 * 1) 기본 클래스 골격 준비
 * 2) 클라이언트 연결을 받기
 * 3) 소켓을 통해 입출력을 할 수 있게 스트림 객체를 준비
 * 
 */
package project.ex4;

import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
  int port;
  
  public HttpServer(int port) {
    this.port = port;
  } // 생성자
  
  public void listen() throws Exception {
    ServerSocket serverSocket = new ServerSocket(this.port) ;
    System.out.println("서버 실행중 ...");
    
    while (true) {
      Socket socket = serverSocket.accept();
      
      
      System.out.println("클라이언트가 연결되었습니다.");
    } // while
    
  } // listen()
  
  public static void main(String[] args) throws Exception {
    HttpServer server = new HttpServer(8888);
    server.listen();
    
  } // main

}
