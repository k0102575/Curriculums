package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/CookieReader02")
public class CookieReader02 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    Cookie[] cookies = req.getCookies();
    
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
      }
      
    } else {
      out.println("쿠기가 한 개도 업습니다.");
    }
    
  } // doGet()

}
