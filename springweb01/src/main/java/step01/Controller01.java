/* Sping MVC : 페이지 컨트롤러 만들기 */
package step01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {
  
  @RequestMapping("/step01/controller01")
  public String service(HttpServletRequest req, HttpServletResponse res) {
    
    return "Hello, World";
  }
}