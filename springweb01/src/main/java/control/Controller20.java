/* Spring MVC : 세션에 보관된 데이터 꺼내기 증명! */
package control;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/control/controller20/")

public class Controller20 {
  @Autowired ServletContext servletContext;

  @RequestMapping("ok1")
  public String ok1() throws Exception {
    
    return "controller20_ok1";
  }
  
  @RequestMapping("reset")
  public String reset(SessionStatus status) throws Exception {
    status.setComplete();
    return "controller20_ok1";
  }
  
  
  
}
