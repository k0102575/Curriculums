/* 비트 논리 연산자 응용*/
package step03;

public class Test03_5 {

  public static void main(String[] args) {
    // 유닉스에서 권한 관리를 위해서 사용한다.
    // 읽기 권한 쓰기권한 실행권한
    
    int a = 0b111; 
    int b = 0b100;
    int c = 0b001;
    
    final int READ = 0b100;
    final int WRITE = 0b010;
    final int EXEC = 0b001;
    
    System.out.println((a & WRITE) ==  WRITE);
    System.out.println((b & WRITE) ==  WRITE);
    System.out.println((c & WRITE) ==  WRITE);
    
    
    
    
}
}
