/* 캡슐화(encapsulation): private 옵션 */
package step11;

public class Test02 {

  public static void main(String[] args) {
    System.out.println("step11 ex1 Test01 실행");
    System.out.println();
    
    Calculator2 c = new Calculator2();
    c.plus(10);
    c.plus(7);
    c.minus(3);
    
    /*
    c.result = 100;
    System.out.println(c.result);
    */
    
    System.out.println(c.getResult());
  }
  

}
