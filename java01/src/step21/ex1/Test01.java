// 상속을 적용 하기 전

package step21.ex1;

public class Test01 {

  public static void main(String[] args) {
    System.out.println("step21 Test01 실행중");System.out.println();
    
    Sedan car1 = new Sedan("에쿠스", "현대자동차", 1997, true);
    
    car1.load(20);
    
  }

}
