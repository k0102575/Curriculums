package bitcamp.java93.servlet;
/* 회원 관리 만들기 : 회원 목록 출력 */


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java93.domain.Teacher;
import bitcamp.java93.service.TeacherService;

@WebServlet(urlPatterns="/teacher/list")
public class TeacherListServlet extends HttpServlet {

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

    try {
      TeacherService teacherService = (TeacherService) this.getServletContext().getAttribute("teacherService");

      List<Teacher> list = teacherService.list(pageNo, pageSize);
      
      req.setAttribute("list", list);
      
      RequestDispatcher rd = req.getRequestDispatcher("/teacher/list.jsp");
      rd.include(req, res);

    } catch (Exception e){
      req.setAttribute("error", e);

      RequestDispatcher rd = req.getRequestDispatcher("/error");
      rd.forward(req, res);
      return;
    }


  } // service()

}
