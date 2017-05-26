/* 유틸리티 클래스 : String IV - 상수 문자열 인스턴스 */
package step08;

public class Test02_4 {

  public static void main(String[] args) {
    System.out.println("step08 Test02_4실행");
    System.out.println();
    
    
    String s1 = "Hello";
    String s2 = "Hello";
    
    if(s1 == s2){
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }
    
    System.out.println("---------------------");
    
    if(s1.equals(s2)){
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }
    
    
  }

}
