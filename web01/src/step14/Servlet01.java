package step14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step14/Servlet01")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    req.setCharacterEncoding("UTF-8");
    
    String name = req.getParameter("name");
    String file1 = req.getParameter("file1");
    String file2 = req.getParameter("file2");
    
    resp.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = resp.getWriter();
    out.printf("name=%s\n", name);
    out.printf("file1=%s\n", file1);
    out.printf("file2=%s\n", file2);
    
    // 숫자를 8비트가 아닌 7비트 ASCII 숫자화 시킨다.
  }
  
  
}
