/* 주제: 리터럴 - 정수 리터럴*/
package step01;

public class Test03 {

  public static void main(String[] args) {
    // 1) 그냥 숫자를 작성 하는 것은 4바이트 크기의 정수 값을 의미한다.
    System.out.println(-10);
    System.out.println(10);
    System.out.println(2147483647);
    System.out.println(-2147483648);
    
    // 2) 8바이트 정수 값을 표현할 떄는 숫자 뒤에 'L', 'l'을 붙인다.
    System.out.println(-10L);
    System.out.println(10L);
    System.out.println(2147483647L);
    System.out.println(-2147483648L);
    System.out.println(9223372036854775807L);
    System.out.println(-9223372036854775808L);
  }

}
