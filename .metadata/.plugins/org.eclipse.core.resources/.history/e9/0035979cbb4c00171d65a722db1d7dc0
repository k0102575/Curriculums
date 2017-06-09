package bitcamp.java93.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java93.dao.LectDao;
import bitcamp.java93.domain.Lect;

@WebServlet(urlPatterns="/lect/add")
public class LectAddServlet extends HttpServlet {
  
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    Lect l = new Lect();
    
    l.setTitl(req.getParameter("titl"));
    l.setDscp(req.getParameter("dscp"));
    l.setSdt(req.getParameter("sdt"));
    l.setEdt(req.getParameter("edt"));
    l.setQty(Integer.parseInt(req.getParameter("qty")));
    l.setPric(Integer.parseInt(req.getParameter("pric")));
    l.setThrs(Integer.parseInt(req.getParameter("thrs")));
    l.setCrmno(Integer.parseInt(req.getParameter("crmno")));
    l.setMrno(Integer.parseInt(req.getParameter("mrno")));
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>강의관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 등록</h1>");
    
    
    try {
      LectDao lectDao = (LectDao) this.getServletContext().getAttribute("lectDao");
    
    lectDao.insert(l);
    out.println("<p>등록 성공 입니다.</p>");
    
    res.sendRedirect("list");
    
    } catch (Exception e) {
      out.print("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
    }
    
    out.println("<a href='list'>목록</a>");
    out.println("</body>");
    out.println("</html>");
    
    System.out.printf("RemoteAddress: %s\n", req.getRemoteAddr());
    
  } // service()
  
}
