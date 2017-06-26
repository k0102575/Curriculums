/* Spring MVC : 요청 URL 계산하기 II */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller04/ok")

public class Controller04 {
  
  @RequestMapping
  public void a(HttpServletRequest req, HttpServletResponse res) throws Exception {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("okok");
  }
  
}
