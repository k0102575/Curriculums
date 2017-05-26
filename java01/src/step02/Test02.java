/*주제: 변수 선언 - 자바의 원시 데이터 타입 */
package step02;

public class Test02 {

  public static void main(String[] args) {
    byte b;
    short s;
    int i;
    long l;
    
    b = -128;
    b = 127;
//  b = -129;
//  b = 128; 양수가 1개 작은이유는 0을 포함하고있어서이다.
  
    s = -32768;
    s = 32767;
//  s = -32769;
//  s = 32768;
    
    i = -21_4748_3648;
    i = 21_4748_3647;
//  i = -21_4748_3649l;
//  i = 21_4748_3648l;
//  i = 100l  100l은 8바이트 정수 값을 의미한다.
            //8바이트 값을 4바이트 메모리에 담으려고 하면 오류!
    
    l = Long.MIN_VALUE;
    l = Long.MAX_VALUE;


    
    
  }

}
