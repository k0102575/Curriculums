/* 웹 애플리케이션 구성 요소 */

package step09;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class Listener03 implements ServletRequestAttributeListener {
  
  @Override
  public void attributeAdded(ServletRequestAttributeEvent srae) {
//    System.out.printf("======>Listener03.attributeAdded(): %s=%s\n", srae.getName(), srae.getValue());

  }

  @Override
  public void attributeRemoved(ServletRequestAttributeEvent srae) {
//    System.out.println("======>Listener03.attributeRemoved()");
    
  }

  @Override
  public void attributeReplaced(ServletRequestAttributeEvent srae) {
//    System.out.println("======>Listener03.attributeReplaced()");
    
  }
  
  
  
  
  
  
}
