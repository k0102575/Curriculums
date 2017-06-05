/* 웹 애플리케이션 컴포넌트  - 서블릿 만들기 III - HttpServlet 추상 클래스 상속 받기 
 * 
 * 오리지날 service를 오버라이딩 하지 않는다
 * httpservlet과 genericservlet을 구분해서 사용해라
 * 
 * */

package servlets.step01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/servlets/step01/Servlet03")
public class Servlet03 extends HttpServlet {

  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doGet(req, resp);
    System.out.println("doGet03()");
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
    System.out.println("doPost03()");
  }
  
}
