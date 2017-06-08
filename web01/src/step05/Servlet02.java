/* 작업을 처리하기 : 인클루딩 */
package step05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step05/Servlet02")
public class Servlet02 extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>인클루딩</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Servlet02에서 출력함!</h1>");
    
    RequestDispatcher rd = req.getRequestDispatcher("/step05/Servlet02/a");
    rd.include(req, res);
    
    rd = req.getRequestDispatcher("/step05/Servlet02/b");
    rd.include(req,  res);
    
    out.println("</body>");
    out.println("</html>");
  } // service()

}
