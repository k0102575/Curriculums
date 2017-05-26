/* 예외처리: 일반 모드(Exception 계열 예외)와 스텔스 모드(Error와 RuntimeException 계열 예외) II */

// 당신이 필요한 시점에 처리하세요 
// Excetion 은 매번 중간중간 어떻게 할지 명시하세요

package step17;

public class Test12 {
  
  static void m1(int v) {
    m2(v);
  }
  
  static void m2(int v) {
    m3(v);
  }
    
  static void m3(int v) { 
    m4(v);
  }
  
  static void m4(int v){  // 호출 하는 쪽에 전달하는 것 
    
    if (v < 0)
      throw new RuntimeException("음수는 허용 하지 않습니다.");
    
    System.out.println(v);
  }
  
  
  public static void main(String[] args) {
    
    // 스텔스 모드로 넘어온 오류를 메인 메서드에서 처리하지 않고 여기서도 던지면 
    // JVM이 받는다 JVM에서는 오류처리를 하면은 시스템이 다운된다.
    // 그래서 main메서드에서 처리해야된다.
    // 실무 에서는 이렇게 처리해야된다.
    // 문법 공부할떄는 JVM이 다운되도 공부가 되니 그렇게 처리한다.
    
     try {
       if (args.length < 1){
         System.out.println("사용법: java -cp bin step17.Test11 숫자");
         return;
       }
       
       m1(Integer.parseInt(args[0]));
       
     } catch (NumberFormatException e){
       System.out.println("프로그램 아규먼트는 숫자여야 합니다.");
       
     } catch (Exception e) {
       e.printStackTrace();
     }
     
     System.out.println("안녕!");
     
  }
}


