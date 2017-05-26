/* 캡슐화 (encapsulation): 중첩 클래스(nested class)에 붙일 수 있는 modifier 종류 */

package step11;

public class Test08 {
  
  private class Inner1 {}
  class Inner2 {}
  protected class Inner3 {}
  public class Inner4 {}
  
  public static void main(String[] args) {
    
    class local1{} // ok!
//    private class local2{} // 컴파일 오류!
//    protected class local3{} // 컴파일 오류!
//    public class local4{} // 컴파일 오류!
    
    int v1;
//    private int v2;
//    protected int v3;
//    public v4;
  }

}
