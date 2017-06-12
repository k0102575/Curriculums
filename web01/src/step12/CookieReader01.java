package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step12/CookieReader01")
public class CookieReader01 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    // 1) 요청 헤더에서 쿠키 정보를 추출하기
    
    Cookie[] cookies = req.getCookies();
    
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
      }
      
    } else {
      out.println("쿠기가 한 개도 없습니다.");
    }
    
  } // doGet()

}
