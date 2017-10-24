/* 웹 애플리케이션 컴포넌트  - 서블릿 만들기 I 
 * 
 * 기본 서블릿 인터페이스를 implements 하는 클래스
 * 
 * */

package step25;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

// 1) 정확하게 URL 패턴을 지정하기
//@WebServlet(urlPatterns="/step01/Servlet01")

// 2) urlPatterns는 배열이기 때문에 정확하게 배열의 형태로 값 지정하기
//@WebServlet(urlPatterns={"/step01/Servlet01"})

// 3) 여러 개의 URL을 지정하기
//@WebServlet(urlPatterns={"/step01/Servlet01", "/step01/Servlet01_a, "/step01/Servlet01_b})

// 4) urlPatterns 대신 value 속성에 지정해도 된다. 두 개의 속성은 같은 역활을 한다.
//@WebServlet(value="/step01/Servlet01")

// 5) value 속성으로 URL을 지정할 경우, value 이름을 생략할 수 있따.
@WebServlet("/step01/Servlet01")

//@WebServlet("/step01/Servlet01", loadOnStartup=1)
//@WebServlet(value="/step01/Servlet01", loadOnStartup=1)

public class Servlet01 implements Servlet {
  
  public Servlet01() {
    System.out.println("/step01/HelloServlet01()");
  } // 생성자

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("/step01/Servlet01.init()");
  } // init()

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("/step01/Servlet01.getServletConfig()");    return null;
  } // getServletConfig

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("/step01/Servlet01.service()");    
  } // service()

  @Override
  public String getServletInfo() {
    System.out.println("/step01/Servlet01.getServletInfo()");    return null;
  } // getServletInfo()

  @Override
  public void destroy() {
    System.out.println("/step01/Servlet01.destroy()");    
  } // destroy()
}
