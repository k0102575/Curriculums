/* final: 변수에 final을 붙이는 경우 */
package step12.ex3;

public class D {
  
  public static final int LEVEL_GUEST = 0;
  public static final int LEVEL_MEMBER = 1;
  public static final int LEVEL_ADMIN = 2;
  
  
  public void m1(final int a, final String b, final Object obj, final boolean c) {
    a = 20;
    b = "Hello";
    obj = new.java.util.date();
    c = true;
  }
  
}
