/* 서블릿 만들기 */

package step24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {
  
  public HelloServlet() {
    System.out.println("HelloServlet()");
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init()");
  } // init()

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("servletConfig()");    
    return null;
  } // ServletConfig()

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("service()");
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("안녕 친구들!");
  } //service()

  @Override
  public String getServletInfo() {
    System.out.println("getServletInfo()");
    return null;
  } // getServletInfo()

  @Override
  public void destroy() {
    System.out.println("destory()");
    
  } // destroy()
  
/*  Eclipse 와 톰켓 실행 환경
 * -> 톰캣서버에 직접 배치하여 개발하는 동안 관리가 불편하다
 *    이유?
 * 1) 톰캣서버 실행 -> Webapps/ 에 이쓴 모든 웹 어플리케이션이 실행된다
 * -> 개발자는 자신이 개발하는 한 두개의 웹 어플리케이션만 실행하여 테스트 하길 원한다.
 * 
 * 2) 웹애플리 케이션 마다 운영 환경이 다를수 있다.
 * -> 테스트 할때 마다 설정 파일을 변경해야 하는 불편함
 * 
 * 해결방안
 * -> 웹 애플리케이션을 테스트할 별도의 실행 환경 구축
 * 1) 톰캣 서버의 설정 파일을 복제하여 별도의 폴더를 생성
 * 2) 웹 애플리케이션을 그 임시 폴더에 배치하여 테스트 한다.
 * */ 

}