/* 웹 애플리케이션 구성 요소 */

package step09;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class Listener01 implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
//    System.out.println("================================>Listener01.contextInitialized()");
  }
  
  
  @Override
  public void contextDestroyed(ServletContextEvent sce) {
//    System.out.println("================================>Listener01.contextDestroyed()");    
  }
  
  
  
  
  
  
}
