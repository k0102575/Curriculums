/* 메서드 : 메서드를 정의하는 문법 */
package step05;

public class Test02 {
  
  // 1) 값을 리턴하지 않고, 파라미터를 받지 않는다.
  
  public static void m1(){
    System.out.println("m1() 호출됨");
  }
  
  // 2) 값을 리턴하지 않고, 아규먼트는 받는다.
  
  public static void m2(int a, String str, boolean b){
    System.out.printf("%d, %s, %b\n", a , str, b);
  }
  
  // 3) 값을 리턴하고, 아규먼트를 받지 않는다.
  
  public static String m3() {
    return "Hello";
    // System.out.println("안된다!"); 리턴한 뒤에는 컴파일오류!
  }
  
  // 4) 값을 리턴하고, 아규먼트도 받는다.
  public static int m4(int a) {
    return a * a;
  }
  
  public static void main(String[] args) {
    m1();
    
    m2(10, "홍길동", false);
    
    String value = m3();
    System.out.println(value);
    
    int result = m4(16);
    System.out.println(result);

  }
}
