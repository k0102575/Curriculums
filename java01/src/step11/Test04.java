/* 캡슐화 (encapsulation): modifier 종류 */

package step11;

import step11.ex1.A;

public class Test04 extends A{
  
  public void test() {
//    this.v1 = 1; // private 안된다 같은 클래스가 아니다.
//    this.v2 = 2; // default 안된다.
    this.v3 = 3; // 자식클래스 이기 떄문에 가능하다
    this.v4 = 4;
    // 상속 받아 만든변수
  }
  
  public static void main(String[] args) {
    A obj = new A();
    
//    obj.v1 = 1; // private 같은 클래스가 아니다.
//    obj.v2 = 2; // default 같은 패키지가 아니다.
//    obj.v3 = 3; // 같은 패키지도 아니고 남의 것은 안된다.
    obj.v4 = 4; // public 만 된다.
    // 여기서 만든 변수
    
  }

}
