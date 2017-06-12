package step12;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step12/Servlet04")
public class Servlet04 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
//    Cookie cookie = new Cookie("c4", "ABC가각간");
    
    Cookie cookie = new Cookie("c4", URLEncoder.encode("ABC가각간", "UTF-8"));
    
    res.addCookie(cookie);
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("Servelt04: 쿠키 보냈음");
  }

}
