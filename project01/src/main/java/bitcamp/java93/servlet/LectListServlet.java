/* 회원 관리 만들기 : 게시물 목록 출력하기 페이지 번호 및 사이즈 */

package bitcamp.java93.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java93.dao.LectDao;
import bitcamp.java93.domain.Lect;

@WebServlet(urlPatterns="/lect/list")
public class LectListServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

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
    out.println("<title>강의관리</title>");

    RequestDispatcher rd = req.getRequestDispatcher("/style/core");
    rd.include(req, res);


    out.println("</head>");
    out.println("<body>");
    
    rd = req.getRequestDispatcher("/header");
    rd.include(req, res);
    
    out.println("<h1>강의 목록</h1>");


    try {
      LectDao lectDao = (LectDao) this.getServletContext().getAttribute("lectDao");

      List<Lect> list = lectDao.selectList(pageNo, pageSize);

      out.println("<a href='form'>새강의</a><br>");
      out.println("<table border='1'>");
      out.println("<thead>");
      out.println("<tr><th>번호</th><th>타이틀</th><th>설명</th><th>시작일</th><th>종료일</th><th>수강가능인원</th><th>가격</th><th>총시간</th></tr>");
      out.println("<tbody>");

      for (Lect l : list) {
        out.println("<tr>");
        out.printf("<td>%d</td>", l.getNo());
        out.printf("<td><a href='detail?no=%d'>%s</a></td>" ,l.getNo(), l.getTitl());
        out.printf("<td>%s</td>", l.getDscp());
        out.printf("<td>%s</td>", l.getSdt());;
        out.printf("<td>%s</td>", l.getEdt());;
        out.printf("<td>%d</td>", l.getQty());;
        out.printf("<td>%d</td>", l.getPric());;
        out.printf("<td>%d</td>", l.getThrs());;
        out.println("</tr>");

      }
      out.println("</tbody>");
      out.println("</table>");

    } catch (Exception e){
      req.setAttribute("error", e);
      rd = req.getRequestDispatcher("/error");
      rd.forward(req, res);
      return;
    }

    rd = req.getRequestDispatcher("/footer");
    rd.include(req, res);

    out.println("</body>");
    out.println("</html>");


  } // service()

}