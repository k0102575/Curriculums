/* 스프링 사용법: 팩토리 메서드 호출하기 */

package step27.ex3;

import java.util.ArrayList;

public class Test01 {
  public static void main(String[] args) {

    // 1) 일반적인 객체 생성

    Engine e1 = new Engine(8, 4);

    Tire[] tireList = {
        new Tire("비트타이어", 13),
        new Tire("비트타이어", 13),
        new Tire("비트타이어", 13),
        new Tire("비트타이어", 13)
    };

    Car c1 = new Car();
    c1.setModel("람보르기니");
    c1.setCc(5000);
    c1.setEngine(e1);
    c1.setTires(tireList);
    
    Engine e2 = new Engine(16, 8);

    Tire[] tireList2 = {
        new Tire("비트타이어", 15),
        new Tire("비트타이어", 15),
        new Tire("비트타이어", 15),
        new Tire("비트타이어", 15)
    };

    Car c2 = new Car();
    c2.setModel("롤스로이스");
    c2.setCc(7000);
    c2.setEngine(e2);
    c2.setTires(tireList2);
    
    System.out.println(c1);
    System.out.println(c2);
    
  }
}
