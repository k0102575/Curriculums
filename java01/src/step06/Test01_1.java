/* 객체 지향 프로그래밍 (Object-Oriented Programming; OOP) */

package step06;

public class Test01_1 {
  
  static class Student {
    // 1) 사용자 정의 데이터 타입 만들기
    String name;
    int[] scores = new int[3];
    int total;
    float aver;
  }

  public static void main(String[] args) {
    // 2) 사용자 정의 데이터으로 메모리 준비하기
    Student s; // 레퍼런스
    s = new Student();
    
    // 3) 인스턴스에 값 넣기
    s.name = "홍길동";
    s.scores[0] = 100;
    s.scores[1] = 90;
    s.scores[2] = 80;
    s.total = s.scores[0] + s.scores[1] + s.scores[2];
    s.aver = s.total / 3f;
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                       s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
    
  }

}
