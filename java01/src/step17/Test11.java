/* 예외처리: 일반 모드(Exception 계열 예외)와 스텔스 모드(Error와 RuntimeException 계열 예외) */

package step17;

public class Test11 {
  
  static void m1(int v) throws Exception {
    m2(v);
  }
  
  static void m2(int v) throws Exception {
    m3(v);
  }
    
  static void m3(int v) throws Exception { 
    // 내가 발생하는 Exception은 아니지만 나를 호출하는곳에 전달하는것
    m4(v);
  }
  
//  static void m3(int v) { 
//    // 내가 발생하는 Exception은 아니지만 내가 처리하는것
//    try {
//      m4(v);
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    
//  }
  
  static void m4(int v) throws Exception {  // 호출 하는 쪽에 전달하는 것 
    
    if (v < 0)
      throw new Exception("음수는 허용 하지 않습니다.");
    
    System.out.println(v);
    // try catch
  }
  
//  static void m4(int v) {  // 여기서 예외를 처리하는 것 
//    try {
//    if (v < 0)
//      throw new Exception("음수는 허용 하지 않습니다.");
//    System.out.println(v);
//    } catch (Exception e) {
//      e.printStackTrace();
//    } // try catch
    
  
  public static void main(String[] args) {
    
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


