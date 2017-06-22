/* 스프링 사용법: 팩토리 메서드 호출하기 II */

package step27.ex3;

public class Test02 {
  public static void main(String[] args) {

    // 1) 팩토리 메서드를 이용하여 객체 생성
    
    Car c1 = CarFactory.createCar("페라리");
    Car c2 = CarFactory.createCar("람보르기니");
    
    System.out.println(c1);
    System.out.println(c2);
    
  }
}
