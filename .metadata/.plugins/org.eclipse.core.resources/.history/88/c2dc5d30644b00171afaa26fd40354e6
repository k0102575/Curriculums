/* 회원 관리 만들기 : 게시물 목록 출력하기 페이지 번호 및 사이즈 */

package croom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/croom/Servlet02")
public class Servlet02 extends GenericServlet {
  
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    
    int pageNo = 1;
    int pageSize = 100;
    
    try {
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}
    
    try {
      pageSize = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>교실관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>교실 목록</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    CroomDao croomDao = new CroomDao(conPool);
    
    List<Croom> list = croomDao.selectList(pageNo, pageSize);
    
    out.println("<a href='form.html'>새교실</a><br>");
    
    out.println("<table border='1'>");
    out.println("<thead>");
    out.println("<tr><th>번호</th><th>이름</th></tr>");
    out.println("<tbody>");
    
    for (Croom c : list) {
      out.println("<tr>");
      out.printf("<td>%d</td>", c.getNo());
      out.printf("<td><a href='Servlet04?no=%d'>%s</a></td>" ,c.getNo(), c.getName());
      out.println("</tr>");
      
    }
    out.println("</tbody>");
    out.println("</table>");
    
    } catch (Exception e){
      out.print("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
    }
    
    out.println("</body>");
    out.println("</html>");
    
    System.out.printf("RemoteAddress: %s\n", req.getRemoteAddr());
    
  } // service()
  
}
