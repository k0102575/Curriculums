package step09.ex2;

public class BasicCalculator {
  int result;
  
  void plus(int value) {
    this.result += value;
  }
  
  void minus(int value) {
    this.result -= value; // 주어진 인스턴스에서 value값으로 주어진 값을 빼서 저장한다.
  }
  
}
