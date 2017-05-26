/* 예외처리: 예외 발생 시 그 정보를 전달하고 전달 받는 방법 
 * 
 * java.lang.Throwable 타입의 객체
 * 이밑에 있는 서브클래스도 포함한다.
 * 
 * */

package step17;

public class Test03 {
  public static float divide(float a, float b) throws Throwable {
    if (b == 0){
      throw new Throwable("0으로 나누지 마세요!");
    }
    return a / b;
  }
  
  public static void main(String[] args) {
    System.out.println("step16 Test03 실행");
    System.out.println();
    
    try {
      
      float result = divide(10, 2);
      System.out.println(result);
      
      result = divide(10, 0);
      System.out.println(result);
      
    } catch (Throwable ex) {
      System.out.println(ex.getMessage());
    }
    
    
  }

}
