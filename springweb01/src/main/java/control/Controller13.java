/* Spring MVC : Request Handler(요청을 처리하는 메서드)의 파라미터들 III - 커스텀 프로퍼티 에디터 */
package control;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller13/")

public class Controller13 {

  // 스프링 버전마다 다르다 확인해라
  // 1)
  @RequestMapping("ok1")
  public void ok1(java.sql.Date date, HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("ok1()");

    out.printf("date: %s\n", date.toString());
  }

  // 2)
  @RequestMapping("ok2")
  public void ok2(
      String name,
      java.util.Date date, 
      HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("ok2()");

    out.printf("date: %s\n", date.toString());
  }

  // 3)
  @InitBinder
  protected void initBinder(WebDataBinder binder) {
    System.out.println("initBinder()...");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    binder.registerCustomEditor(
        java.util.Date.class,
        new CustomDateEditor(  // 바꿔주는 역활
            dateFormat,  // 일은 이놈이 한다.
            false));
  }

}