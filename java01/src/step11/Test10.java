/* 캡슐화 (encapsulation): 필드와 프로퍼티 */

package step11;

import step13.Constants.school;

public class Test10 {
  
  static enum SchoolLevel {
    HIGH_SCHOOL, BACHELOR, MASTER, DOCTOR
  }
  
  static class Student {
    
    // 필드 선언
    private String name;
    private int age;
    private SchoolLevel level;
    
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
    public SchoolLevel getLevel() {
      return level;
    }
    public void setLevel(SchoolLevel level) {
      this.level = level;
    }
    
    
  }
  
  public static void main(String[] args) {
    System.out.println("step11 Test10 실행");
    System.out.println();
    
    Student s = new Student();
    s.setName("홍길동");
    s.setAge(20);
    s.setLevel(SchoolLevel.BACHELOR);
    
  }

}
