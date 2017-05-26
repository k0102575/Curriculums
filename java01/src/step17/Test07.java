/* 예외처리: 사용자 정의 예외 던지기 
 * 
 * 보통상속은 
 * 슈퍼클래스에 기능에 다른 기능을 추가해 상속하는것이지만
 * 기능확장용이다.
 * 예외에서의 상속은
 * 이름으로 어떤예외인지 나타내기 위해서 상속을 한다.
 * 분류의 의미를 가진다.
 * 
 * */

package step17;

public class Test07 {
  
  static class InvalidValueScopeException extends IllegalArgumentException{
    
    public InvalidValueScopeException() {
      super();  // super(); 를 안넣으면 자동으로 컴파일할떄 생성한다.
    }

    public InvalidValueScopeException(String message, Throwable cause) {
      super(message, cause); // 문자열 다른 예외정보
    }

    public InvalidValueScopeException(String s) {
      super(s); // 문자열
    }

    public InvalidValueScopeException(Throwable cause) {
      super(cause); // 다른 예외정보
    }
    
  }
  
  public static void main(String[] args) {
    
    try {
      if (args.length < 1)
        throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다.");
      
    int age = Integer.parseInt(args[0]);
      
    if (age < 1)
      throw new InvalidValueScopeException("나이가 유효하지 않습니다.");
    
    System.out.println(age);
    
    } catch (Throwable ex) {
      ex.printStackTrace();  
      // 에러에 대해서 자세한 정보를 알고싶다.
      // 스택을 추적해서 출력하겠다.
    }
    
  }
}


