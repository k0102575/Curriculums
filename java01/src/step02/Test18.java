/*주제: 변수 선언 - 블록과 변수 선언 */
package step02;

public class Test18 {
  
  static int a = 10; // 클래스 변수
  
  public static void main(String[] args) {
    System.out.println(a);
    m1(30);
    System.out.println(a);
    
    int b = 20; // 로컬 변수
  }

  public static void m1(int c){
    // int c 는 로컬변수
    // d = 50; 자바는 호이스팅을 지원하지 않는다. 컴파일 오류!
    int d = 40;
    a = 200;
  }
}
