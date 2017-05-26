/* 문장: 조건문 switch - 사용 가능한 값 */
package step04;

public class Test02_3 {
  
  enum Level {
    GUEST, MEMBER, ADMIN;
  }

  public static void main(String[] args) {
    byte b = 10;
    short s = 10;
    int i = 10;
    long l = 10;
    float f = 10f;
    double d = 10.0;
    boolean bool = true;
    char c = '가';
    String str = "오호라";
    
    switch (b) {}
    switch (s) {}    
    switch (i) {}
    // switch (l) {} // 컴파일 오류! 8바이트 크기의 정수임
    // switch (f) {}
    // switch (d) {}
    switch (c) {}
    // switch (bool) {}
    switch (str) {}
    
    switch (Level.GUEST){}
    
    
    
  }
}
