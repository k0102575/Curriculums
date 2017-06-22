/* 스프링 사용법: 팩토리 메서드 호출하기 VI */

package step27.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
  public static void main(String[] args) {
    
    // 6) 스프링 IOC 컨테이너를 이용하여 팩토리 메서드를 사용하기
    // => 스프링에서 제공하는 규칙에 따라 팩토리 메서드를 만들 때
    // 보통 그 클래스의 이름은 "FactoryBean"으로 만든다.

    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex3/application-context-06.xml");
    
    System.out.println(ctx.getBean("c1"));
    System.out.println(ctx.getBean("c2"));
    System.out.println(ctx.getBean("c3"));
    
  }
}
