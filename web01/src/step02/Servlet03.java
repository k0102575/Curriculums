/* service() 파라미터 - ServletRequest III - 한글 파라미터 값 꺠지는 현상 */

package step02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step02/Servlet03")
public class Servlet03 extends GenericServlet {
  
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    System.out.printf("RemoteAddress: %s\n", req.getRemoteAddr());
    System.out.printf("Parameter(name): %s\n", req.getParameter("name"));
    System.out.printf("Parameter(age): %s\n", req.getParameter("age"));
    
  } // service()
  
}
