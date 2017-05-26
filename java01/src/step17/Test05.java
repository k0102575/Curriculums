/* 예외처리: catch 작성 순서 */

package step17;

public class Test05 {
  
  public static void main(String[] args) {
    
    try {
      if (args.length < 1)
        throw new Throwable("애플리케이션 아규먼트가 없습니다.");
      
    int age = Integer.parseInt(args[0]);
      
    if (age < 1)
      throw new Throwable("나이가 유효하지 않습니다.");
    
    System.out.println(age);
    
    } catch (NumberFormatException e) {
      
      System.out.println("에플리케이션의 아규먼트가 숫자가 아닙니다.");
      
    } catch (Throwable ex) {
      
      System.out.println(ex.getMessage());
      
    }
    
  }
}


