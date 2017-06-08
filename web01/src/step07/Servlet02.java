/* 서브릿 끼리 값을 공유하는 방법 */
package step07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step07/Servlet02")
public class Servlet02 extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String value = (String) req.getAttribute("v1");
    
    ServletContext sc = req.getServletContext();
    String value2 = (String) sc.getAttribute("v2");
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.printf("v1=%s\n", value);
    out.printf("v2=%s\n", value2);
    
    } // service()
    
}
