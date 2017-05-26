/* 유틸리티 클래스 : wrapper II - 오토박싱(auto-boxing) */
package step08;

public class Test04_3{
  
  
  public static void main(String[] args) {
    System.out.println("step08 Test04_3 실행");
    System.out.println();
    
    int a = 10;
    Integer obj = new Integer(20);
    
    int b = obj.intValue();
    int c = obj; // 자동으로 intValue()로 언박싱한다. auto-unboxing 
    
    Integer obj2 = new Integer(a);
    Integer obj3 = a; // 이게 자동으로 new Integer로 박싱한다. auto-boxing
    Integer ojb4 = 20;  // 상수 객체 만드는것과 같다 해깔리지 마라
    
    // 주소변수에 원시값을 저장하는것처럼 보이게 
    // 자동으로 하는이유는 일일이 박싱 언박싱 하면 귀찷으니까
    
    
  }

}
