/*주제: 변수 선언 - 변수의 범위 II */
package step02;

public class Test19 {
    
  public static void main(String[] args) {
    int a = 10;
    {
      int b = 20;
    System.out.println(b);
    System.out.println(a);
    }
    
    //System.out.println(b);
    
    
  }
}
