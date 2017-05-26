/* 상수 값 다루기 : enum 문법 적용후 */

package step15;

public class Test02 {

  public static void main(String[] args) {
    System.out.println("step15 Test02 실행");
    System.out.println();
    
    Student2 s = new Student2();
    
    s.setName("홍길동");
    s.setAge(20);
    s.setSchoolLevel(SchoolLevel.DOCTOR);
//    s.setSchoolLevel(4); 
    // 넘어오는 클래스를 int에서 SchoolLevel로 바꾸었기 떄문에 임의의 값을 넣을수가없다
    
    System.out.println(s);
    
    
    
  }
  
}
