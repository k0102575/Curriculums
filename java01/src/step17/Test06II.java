/* 개념이해 */

package step17;

public class Test06II {
  
  public static void main(String[] args) {
    
    try {
      if (args.length < 1)
        throw new Throwable("애플리케이션 아규먼트가 없습니다.");
      
    int age = Integer.parseInt(args[0]);
      
    if (age < 1)
      throw new Exception("나이가 유효하지 않습니다.");
    
    System.out.println(age);
    
    } catch (Throwable ex) {
      
      System.out.println(ex.getMessage());
      
    }
    
    // 하위 클래스로 구체적으로 갔을때 throwable 해야된다.
    // 소보루 -> 빵 -> 가공음식 -> 음식
    // 지금 이 코드는 음식 -> 가공음식 -> 빵 - > 소보루다
    // 음식에서 다 걸러버리기 떄문에 안된다. 
    
    } catch (NumberFormatException e) {
      
      System.out.println("에플리케이션의 아규먼트가 숫자가 아닙니다.");
      
    } catch (Exception ex) {
      
      System.out.println("나이 값이 유효하지 않습니다.");
      
    
  }
}


