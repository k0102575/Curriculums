/* 초기화블록: 인스턴스 블록 */
package step07;

public class Test03_2 {
  
  static class Student {
   static String name = "홍길동";
   int age = 20;
     static {
       System.out.println("static {...}");
     }
     
     { // 인스턴스 블록
       System.out.println(age);
       System.out.println("{인스턴스 블록 실행...1}");
       this.age = 30;
     }
     
     {
       System.out.println("{인스턴스 블록 실행...2}");
     }

  }

  public static void main(String[] args) {
    System.out.println("Test03_2 실행");
    System.out.println();
    
    new Student();  // 인스턴스를 만들었다고 해서 꼭 주소를 받을필요를 없다. 받을지 말지는 내가 결정한다.
    System.out.println("------------------------");
    new Student();
    
  }

}

// 스태틱 블록은 1번 실행된다 클래스를 1번 로딩하기 떄문에