package bitcamp.java93.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import bitcamp.java93.dao.CroomDao;
import bitcamp.java93.dao.LectDao;
import bitcamp.java93.dao.ManagerDao;
import bitcamp.java93.dao.MemberDao;
import bitcamp.java93.dao.TeacherDao;
import bitcamp.java93.service.CroomService;
import bitcamp.java93.service.MemberService;
import bitcamp.java93.service.TeacherService;
import bitcamp.java93.util.DBConnectionPool;


@WebListener
public class ContextLoaderListener implements ServletContextListener{

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    MemberDao memberDao = new MemberDao(conPool);
    LectDao lectDao = new LectDao(conPool);
    ManagerDao managerDao = new ManagerDao(conPool);
    CroomDao croomDao = new CroomDao(conPool);
    TeacherDao teacherDao = new TeacherDao(conPool);
    
    MemberService memberService = new MemberService();
    memberService.setMemberDao(memberDao);
    
    CroomService croomService = new CroomService();
    croomService.setCroomDao(croomDao);
    
    TeacherService teacherService = new TeacherService();
    teacherService.setMemberDao(memberDao);
    teacherService.setTeacherDao(teacherDao);
    
    
    ServletContext sc = sce.getServletContext();
    
    sc.setAttribute("teacherService", teacherService);
    sc.setAttribute("memberService", memberService);
    
    sc.setAttribute("lectDao", lectDao);
    sc.setAttribute("croomDao", croomDao);
    sc.setAttribute("managerDao", managerDao);
    
    } catch (Exception e) {
      e.printStackTrace();
    } 
    
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    
  }

}
