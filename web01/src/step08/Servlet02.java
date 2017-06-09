/* 웹 애플리케이션에서 자원을 준비하는 방법 : 서블릿을 이용하기 */

package step08;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//@WebServlet(urlPatterns="/step08/Servlet02", loadOnStartup=1)
public class Servlet02 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void init() throws ServletException {
    System.out.println("=====================> step08.Servlet02.init()...");
    ServletContext sc = this.getServletContext(); 
    sc.setAttribute("v2", "hi");
  }
  
}
