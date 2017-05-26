/* 소켓 프로그래밍: connectionless 서버 만들기 */

package step18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;

public class Test07_2 {

  class Value {
    int v1;
    int v2;
    String op;
  }

  class CalculatorJob implements Runnable {
    Socket socket ;

    public CalculatorJob(Socket socket) {
      this.socket = socket;
      System.out.println("=> 클라이언트와 연결되었음!");
    }// CalculatorJob()

    public void run() {
      int count = 0;
      try 
      (
          Socket socket = this.socket;
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());
          ) {
        String json = in.readLine();
        if (json == null)
          return;

        Gson gson = new Gson();
        Value value = gson.fromJson(json, Value.class);

        float result = 0f;

        switch (value.op) {
        case "+" : result = (float) value.v1 + value.v2; break;
        case "-" : result = (float) value.v1 - value.v2; break;
        case "*" : result = (float) value.v1 * value.v2; break;
        case "/" : result = (float) value.v1 / value.v2; break;
        case "%" : result = (float) value.v1 % value.v2; break;
        }

        if(++count > 5) {
          out.println("무료 사용 끝!");
        } else {
          out.println(result);
        }

        out.flush();
        System.out.println("=> 클라이언트와 연결 끊김!");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } // run()

  } // class CalculatorJob

  public void Listen(int port) throws Exception {
    ServerSocket serverSocket = new ServerSocket(port);
    System.out.println("step18 Test07_2 서버 실행중");

    while (true) {
      //      CalculatorJob job = new CalculatorJob(serverSocket.accept());
      //      new Thread(job).start();
      new Thread(new CalculatorJob(serverSocket.accept())).start();

    } // while

  } // class Listen()

  public static void main(String[] args) throws Exception {

    Test07_2 server = new Test07_2();

    server.Listen(8888);

  }  // main
}
