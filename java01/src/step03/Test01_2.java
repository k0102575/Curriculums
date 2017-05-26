/* 산술연산자(+, -, *, /, %) II */
package step03;

public class Test01_2 {

  public static void main(String[] args) {
    byte b1 = 10;
    byte b2 = 20;
    byte b3 = 10 + 20;
    
//  byte b33 = 10 + 118;  상수 값을 메모리에 담을 수 없기 때문에 컴파일 오류!
  
//  byte b4 = b1 + b2; 컴파일 오류!
//  byte b5 = b1 + 20; 컴파일 오류!
//  byte b6 = 10 + b2; 컴파일 오류!
    
    int i1 = 10;
    long l1 = 20;
    
//  int i2 = i1 + l1;
    long l2 = i1 + l1;
    
    float f1 = 10.0f;
//  long l3 = f1 + l1;
    float f2 = f1 + l1;
    
    float f3 = l1 + l2; // 
    
    
}

}

/* 기본 연산 규칙 ?
 * byte, short, char -> int -> long -> float -> double
 */