package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step04/Servlet01")
public class Servlet01 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    HttpServletRequest httpReq = (HttpServletRequest) req;
    HttpServletResponse httpRes = (HttpServletResponse) res;
    // 웹만을 위한 기술이 아니었다.
    // 웹이 붐이 일어나고 웹을 다룰수있는 기술을 추가하다가 이렇게됬다.
    // 확신하고 타입 캐스팅 해라
    
    if (req.getParameter("page") == null) {
      httpRes.setHeader("Refresh", "1;url=Servlet01/a");
      
    } else if (req.getParameter("page").equals("b")) {
        httpRes.setHeader("Refresh", "1;url=Servlet01/b");
    }
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>리프레시</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>화면1</h1>");

    out.println("</body>");
    out.println("</html>");
  } // service()

}
