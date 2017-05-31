package step23.ex10;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Map;

  class HttpProcessor extends Thread {
    Socket socket;
    Map<String,Command> servletMap;

    public HttpProcessor(Socket socket, Map<String, Command> servletMap) {
      this.socket = socket;
      this.servletMap = servletMap;
    } // 생성자

    public void run() {
      try(
          Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
          ) {

        String line = null;
        boolean requestLine = true;
        String url = null;
        while (true) {
          line = in.readLine();
          if (line.isEmpty())
            break;
          if (requestLine) {
            requestLine = false;
            url = extractUrl(line);
          }
        } // while
          
        Command servlet = servletMap.get(url);
        
        if(servlet != null) {
          servlet.service(out);
        } else {
          servletMap.get("error").service(out);
        } 
        
        out.flush();
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } // try ~ catch

    } // run()

    private String extractUrl(String requestLine) {
      return requestLine.substring(requestLine.indexOf(" ") + 1, requestLine.lastIndexOf(" "));
    } // extractUrl()

  } // class HttpProcessor
