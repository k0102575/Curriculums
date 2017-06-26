/* Spring MVC : 파라미터의 존재 유무로 요청을 구분한다. */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller07/")

public class Controller07 {

  @RequestMapping(path="ok", params="name")

  public void get(HttpServletRequest req, HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("name 있다");
  }

  @RequestMapping(path="ok", params={"age", "tel"})

  public void porst(HttpServletRequest req, HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("age 와 tel 있다");
  }

}
