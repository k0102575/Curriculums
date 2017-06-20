/* Class 도구 사용법: 클래스의 메서드 알아내기 */
package step26;

import java.lang.reflect.Method;

public class Test03 {
  public static void main(String[] args) throws Exception {

        test1();
    System.out.println("--------------");
    test2();

  }


  private static void test1() throws Exception {

    Class<?> clazz = Myclass.class;

    Method[] methodList = clazz.getMethods();

    for (Method m : methodList) {
      System.out.println(m.getName());
    }

  } // test1()

  private static void test2() throws Exception {

    Class<?> clazz = Myclass.class;

    Method[] methodList = clazz.getDeclaredMethods();

    for (Method m : methodList) {
      System.out.println(m.getName());
    }

  } // test2()

}
