/* 인터페이스 3 */

package step21.ex8;

public interface D extends B, C {
  
//  void m3(); // 부질 없는짓
  // 규칙을 왜 또 정의하냐 하지마라 
  
  
//  int m3 (); // 컴파일 오류!
  
  void m3(int a);
  
  int m3(int a, int b);
  
  void m7();
  
}
