/* Spring MVC : 요청 프로토콜에 헤더 이름을 요청 조건으로 지정 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller08/")

public class Controller08 {

  @RequestMapping(path="ok", headers="aaaa")

  public void get(HttpServletRequest req, HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("aaaa 있다");
  }

  @RequestMapping(path="ok", headers={"bbbb", "cccc"})

  public void porst(HttpServletRequest req, HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("bbbb 와 cccc 있다");
  }

}