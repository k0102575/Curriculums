/* 유틸리티 클래스 : wrapper II - equals() 메서드 */
package step08;

public class Test04_2{
  
  
  public static void main(String[] args) {
    System.out.println("step08 Test04_2 실행");
    System.out.println();
    
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));
    
    System.out.println("---------------------");
    
    StringBuffer s1 = new StringBuffer("Hello");
    StringBuffer s2 = new StringBuffer("Hello");
    
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    
    // 시험문제에 은근히 많이 나온다 equals가 오버라이딩 되는가 그점을 파악하기 위해서 물어본다.
  }

}
