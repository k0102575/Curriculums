package step21.ex7;

public class Test02 {

  public static void main(String[] args) {
    System.out.println("step21 ex7 Test01 실행중");System.out.println();
    
    B obj ;
    
//    ojb = new C(); // C는 추상클래스이다. 인스턴스 생성 불가!
    obj = new D();
    
    obj.m2();
  }

}
