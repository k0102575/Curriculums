/* 유틸리티 클래스 : String II - 레퍼런스 비교 */
package step08;

public class Test02_2 {

  public static void main(String[] args) {
    System.out.println("step08 Test02_2실행");
    System.out.println();
    
    
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    if(s1 == s2){
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }
    
    
  }

}
