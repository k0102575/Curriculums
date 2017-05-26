package step09.ex1;

public class AdvancedCalculator {
  int result;
  
  void plus(int value) {
    this.result += value;
  }
  
  void minus(int value) {
    this.result -= value; // 주어진 인스턴스에서 value값으로 주어진 값을 빼서 저장한다.
  }
  
  // 새 곱하기 기능 추가
  void multiple(int value) {
    this.result *= value;
  }
  
}
