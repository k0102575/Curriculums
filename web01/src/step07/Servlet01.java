/* 서브릿 끼리 값을 공유하는 방법 */
package step07;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step07/Servlet01")
public class Servlet01 extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    req.setAttribute("v1", "hello");
    
//    ServletContext sc = req.getServletContext();
    ServletContext sc = this.getServletContext();
    // 웹어플리케이션 ServletContext는 1개다 
    // 웹어플리케이션에서 어떤 서블릿에서 호출해도 같은 ServletContext다
    
    sc.setAttribute("v2", "hi");
    
    res.setHeader("Refresh", "1;url=Servlet02");
    
    } // service()
    

}
