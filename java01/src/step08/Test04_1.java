/* 유틸리티 클래스 : wrapper */
package step08;

public class Test04_1{
  
  
  public static void main(String[] args) {
    System.out.println("step08 Test04_1 실행");
    System.out.println();
    
    int i = 10;
    
    Integer obj = new Integer(10);
    
    int x = obj.intValue();
    
    String str = obj.toString();
    
    byte b = obj.byteValue();
    short s = obj.shortValue();
    long l = obj.longValue();
    float f = obj.floatValue();
    double d = obj.doubleValue();
    
    // 두수의 크기를 비교하는 기능도 있다.
    System.out.println(obj.compareTo(new Integer(5))); // 아규먼트의 값 보다 작으면 음수
    System.out.println(obj.compareTo(new Integer(10))); // 아규먼트 의 값과 같으면 0
    System.out.println(obj.compareTo(new Integer(20))); // 아규먼트의 값 보다 크면 양수
    
  }

}
