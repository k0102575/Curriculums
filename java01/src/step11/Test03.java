/* 캡슐화 (encapsulation): modifier 종류 */

package step11;

import step11.ex1.A;

public class Test03 {

  public static void main(String[] args) {
    A obj = new A();
    
//    obj.v1 = 1; // private 같은 클래스가 아니다.
//    obj.v2 = 2; // default 같은 패키지가 아니다.
//    obj.v3 = 3; // 같은 패키지도 아니고 sub클래스도 아니다.
    obj.v4 = 4; // public 만 된다.
  }

}
