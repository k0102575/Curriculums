/*주제: 변수 선언 - 부동소수점 변수 */
package step02;

public class Test03 {

  public static void main(String[] args) {
    float f; // 4 byte 크기의 메모리
    double d; // 8 byte 크기의 메모리
    
    f = 9.999999f;
    System.out.println(f);
    
    f = 999999.9f;
    System.out.println(f);
    
    f = 9.999999999997f;
    System.out.println(f);
    
    f = 3.141592344567f;
    System.out.println(f);
    
    d = 3.141592344567f;
    System.out.println(d);
    
    d = 3.141592344567;
    System.out.println(d);
    
  }
}
