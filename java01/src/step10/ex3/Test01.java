/* 다형성 - 오버로딩(overloading) */

package step10.ex3;

public class Test01 {

  public static void main(String[] args) {
    
    System.out.println("step10 ex3 Test01 실행");
    System.out.println();
    
    Calculator c1 = new Calculator();
    c1.plus(1);
    c1.plus(2);
    c1.plus(10, 7);
    
    c1.minus(5);
    
    System.out.println(c1.result);
}

}
