/* 스프링 사용법: 커스텀 프로퍼티 에디터 만들고 사용하기 */

package step27.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex6/application-context-01.xml");
    
    System.out.println("-------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    
    for (String name : names) {
      System.out.println(ctx.getBean(name));
    }
    
  }
}
