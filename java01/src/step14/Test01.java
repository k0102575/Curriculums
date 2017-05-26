/* 제네릭(Generic) 문법 : 사용전 */
package step14;

public class Test01 {
  
  public static void main(String[] args) {
    System.out.println("step14 Test01 실행");
    System.out.println();
    
    Bucket b = new Bucket();
    
    String str = new String("Hello");
    System.out.println(str.length());
    
    b.setValue(str);
    String str2 = (String) b.getValue();
    System.out.println(str2.length());
    
    
//    String str2 = (String)b.getValue(); // 이런 거짓말은 해서는 안된다. 형변환을 할수가없다.
//    System.out.println(str2.length());
    // 실행할때 오류가 발생한다. RunTime Exception
//    String st2 = b.getValue(); // getValue 의 리턴값이 Object다 
    // 어떤 참조 변수는 자식이나 자손의 주소는 담을수 있지만 부모의 주소는 담을수가 없다.
    // 부모에 없는 기능을(메서드,클래스변수) 쓸까봐 컴파일할떄 막힌다.
    // 레퍼런스는 상위 클래스를 가르킬수없다. 개발자 용어로
  }
}
