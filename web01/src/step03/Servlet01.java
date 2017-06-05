/* 회원 관리 만들기 : 게시물 목록 출력하기 */

package step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step03/Servlet01")
public class Servlet01 extends GenericServlet {
  
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    
    int pageNo = 1;
    int pageSize = 5;
    
    try {
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}
    
    try {
      pageSize = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    MemberDao memberDao = new MemberDao(conPool);
    
    List<Member> list = memberDao.selectList(pageNo, pageSize);
    
    for (Member m : list) {
      out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    
    } catch (Exception e){
      out.print("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
    } 
    
    System.out.printf("RemoteAddress: %s\n", req.getRemoteAddr());
    
  } // service()
  
}
