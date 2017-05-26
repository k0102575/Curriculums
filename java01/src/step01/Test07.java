/* 주제: 리터럴 - 부동 소수점과 유효자릿수*/
package step01;

public class Test07 {
  public static float xxx = 12.375f;

  public static void main(String[] args) {
    // 1) 4바이트 메모리  // single precision(단정도; 한개의 정밀도) 7자릿수까지 유효하다.
    System.out.println(987.654f);
    System.out.println(987.6549f);
    System.out.println(987.65498f);  // 에러는 뜨지 않는다 다만 깨질뿐이다. 안전하게 들어갔다 나오지못한다.
                                     // 실행결과 : 987.65497 소수점위치는 중요하지 않다.

    // 2) 8바이트 메모리  // double precision(배정도; 단정도 보다 두 배 정밀하다)15자릿수까지 유효하다
    System.out.println(99999.9999999999);
  }

}
