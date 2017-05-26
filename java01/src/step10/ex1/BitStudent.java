package step10.ex1;

public class BitStudent extends Student {
  
  String school;
  
  void print(){
    
    /*
    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
    */
    
    super.print();  // super는 Student를 이야기 하는것이 아니다. 재정의 하기전의 메서드다
    System.out.printf("학교: %s\n", school);
    
  } // print()
  
  
} // class
