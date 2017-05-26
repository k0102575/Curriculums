/* 캡슐화 (encapsulation): 필드와 프로퍼티 */

package step11;

public class Test09 {
  
  static class Student {
    public static final int HIGH_SCHOOL = 1;
    public static final int BACHELOR = 2;
    public static final int MASTER = 3;
    public static final int DOCTOR = 4;
    // 필드 선언
    private String name;
    private int age;
    private int level;
    
    // 프로퍼티 선언
    
    
    // 필드명: "name"
    // 프로퍼티명: "fullName"
    public void setFullName (String fullName) {
      this.name = fullName;
    } // setFullName()
    
    public String getName () {
      return name;
    } // getName()
    
    // 필드명: "age"
    // 프로퍼티명: "age"
    public void setAge(int age){
      if (age > 5 && age < 100) {
        this.age = age;
      }
      throw new RuntimeException("나이는 6에서 99살까지 가능합니다.");
    } // setAge()
    
    public int getAge() {
      return age;
    } // getAge()
    
    // 필드명: "level"
    // 프로퍼티명: "schoolLevel"
    public void setSchoolLevel(int level){
      if (level >=1 && level <= 4){
        this.level = level;
      }
      throw new RuntimeException("학위정보는 1에서 4까지 가능합니다.");
    } // setSchoolLevel()
    
    public int getSchoolLevel(){
      return level;
    } // getSchoolLevel()
    
    // setter getter를 프로퍼티라 부른다.
    // 특별한 경우가 아니면 필드명과 프로퍼티명을 다르게 하지 않는다.
    // set은 readonly | get은 writeonly
    
  }
  
  public static void main(String[] args) {
    
    Student s = new Student();
    s.setFullName("홍길동");
    s.setAge(20);
    s.setSchoolLevel(Student.DOCTOR);
    
  }

}
