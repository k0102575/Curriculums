package step21.ex6;

public class CarTester {
  
  public static void test(Vehicle car) { 
    // Vehicle 인터페이스 맞게 만든 클래스의 객체라면 변수로 선언할수있다. 클래스 객체
    
    System.out.println("자동차 테스트 시작!");
    car.run();
    System.out.println("자동차 테스트 끝!");
    
  }
  
}
