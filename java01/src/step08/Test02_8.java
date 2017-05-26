/* 유틸리티 클래스 : String VIII - StringBuffer는 문자열을 비교할 수 없다. */
package step08;

public class Test02_8 {

  public static void main(String[] args) {
    System.out.println("step08 Test02_8 실행");
    System.out.println();
    
    StringBuffer s1 = new StringBuffer("Hello");
    StringBuffer s2 = new StringBuffer("Hello");
    
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    //
    System.out.println(s1.toString().equals(s2.toString()));  
    
    
    
  }

}
