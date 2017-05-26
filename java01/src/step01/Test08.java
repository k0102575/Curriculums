/* 주제: 리터럴 - 부동 소수점의 의미*/
package step01;

public class Test08 {
  public static float xxx = 12.375f;

  public static void main(String[] args) {
    System.out.println(987.654f);
        
    System.out.println(98.7654E1f); // 98.7654 * 10**1
    System.out.println(9.87654E2f); // 9.87654 * 10**2
    System.out.println(0.987654E3f); // 0.987654 * 10**3
    System.out.println(9876.54E-1f); // 9876.5 * 10**-1
    System.out.println(98765.4E-2f); // 98765.44 * 10**-2
  }

}
