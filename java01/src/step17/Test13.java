/* 예외처리: finally 블록 */

package step17;

public class Test13 {
  
  public static void main(String[] args) {
    
    try {
      if (args.length < 1) {
        System.out.println("사용법: java -cp bin step17.Test13 숫자");
        return;
      }
      System.out.println(Integer.parseInt(args[0]));
    
    } catch (Exception e) {
    
      e.printStackTrace();
    
    } finally {
      // 예외가 떠도 실행하고 안떠도 실행하고
      // 위에서 return을 하더라도 finally를 무조건 실행한다.
      System.out.println("오호라");
    }
    
    System.out.println("안녕!");
    
  }
}


