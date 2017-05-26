/* 상수 값 다루기 : enum 문법 적용후 II */

package step15;

public class Test05 {

  public static void main(String[] args) {
    System.out.println("step15 Test05 실행");
    System.out.println();
    
    Student3 s = new Student3();
    
    s.setName("홍길동");
    s.setAge(20);
    s.setSchoolLevel(SchoolLevel2.MASTER);
//    s.setSchoolLevel(4); 
    // 넘어오는 클래스를 int에서 SchoolLevel로 바꾸었기 떄문에 임의의 값을 넣을수가없다
    
    System.out.println(s);
    
    System.out.println(s.getSchoolLevel().value());
    
  }
  
}
