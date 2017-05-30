package step21.ex5;

public class CarTester {
  
  public static void test(Car car) { 
    // 변수에 추상클래스를 적었다고 해서 car나 loader가 오는게 아니라 세단이나 트럭이나 불도저가온다.
    
    System.out.println("자동차 테스트 시작!");
    // 변수로 넘어온 객체 의 run을 실행한다.
    // 오버라이딩 된 run이다 car클래스의 run이 아니다.
    car.run();
    System.out.println("자동차 테스트 끝!");
    
    // 인스턴스 변수를 사용하지 않기 때문에 스태틱 메서드로 선언했다.
    // 개별적인 값을 다룰필요가없다.
  }
  
}
