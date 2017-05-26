/*주제: 변수 선언 - 자바의 원시 데이터 타입 */
package step02;

public class Test04 {

  public static void main(String[] args) {
    // 정수형 변수 숫자로된 유니코드 값을 저장한다.
    char c; // 2byte 크기의 메모리 정수 값을 저장
            // short : -32768 ~ 32767
            // char  : 0 ~ 65535
    short s;
    s = -32768;
    s = 32767;
//  s = 65535;
    
    c = 0;
    c = 65535;
//  c = -1;
    
    c = 44032;
    System.out.println(c);

    c = '가';
    System.out.println(c);
    
    int i1 = '\b';
    int i2 = '\t';
    int i3 = '\n';
    int i4 = '\f';
    int i5 = '\r';
    int i6 = '\'';
    int i7 = '\"';
    int i8 = '\\';
    System.out.printf("%x, %x, %x, %x, %x, %x, %x, %x", i1, i2, i3, i4, i5, i6, i7, i8);
  }

}
