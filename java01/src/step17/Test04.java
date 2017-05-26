/* 예외처리: throw 명령
 * 
 * */

package step17;

public class Test04 {
  
  public static void main(String[] args) {
    
    try {
      if (args.length < 1)
        throw new Throwable("애플리케이션 아규먼트가 없습니다.");
      
    int age = Integer.parseInt(args[0]);
      
    if (age < 1)
      throw new Throwable("나이가 유효하지 않습니다.");
    
    System.out.println(age);
    
    } catch (Throwable ex) {
      System.out.println(ex.getMessage());
    }
    
    
    
  }
}


