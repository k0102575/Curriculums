/* Spring MVC : 클라이언트로부터 JSP를 감추기 */
package control;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller18/")

public class Controller18 {
  @Autowired ServletContext servletContext;

  // 1)
  @RequestMapping("ok1")
  public String ok1(Model model) throws Exception {
    Member member = new Member();
    
    member.setName("홍길동");
    member.setAge(20);
    member.setWorking(true);
    
    model.addAttribute("member", member);
    
    return "controller18_ok1";
  }
  
}
