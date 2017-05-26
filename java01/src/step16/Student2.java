package step16;

import java.io.Serializable;

public class Student2 implements Serializable{

  private static final long serialVersionUID = 1L;
  // 버전체크용이다 작성을 안해도 상관없지만 경고가 뜬다.
  
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  boolean working;
  
  public Student2 () {}
  
  public Student2(String name, int kor, int eng, int math, boolean working) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = kor + eng + math;
    this.aver = this.sum / 3f;
    this.working = working;
  }
  
  public String toString() {
    return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
        + aver + ", working=" + working + "]";
  }
  
}
