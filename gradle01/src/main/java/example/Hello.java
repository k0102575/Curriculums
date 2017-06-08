package example;

// 한글 주석 현재 이 자바 소스 파일은 UTF-8로 인코딩 되어 있다.
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello");
    
    String level = "mgr";
    
    switch (level) {
    case "mgr" : System.out.println("관리자 입니다."); break;
    case "user" : System.out.println("일반 입니다."); break;
    default: System.out.println("없는 등급 입니다.");
    } // switch
    
    
    
    
  }
}