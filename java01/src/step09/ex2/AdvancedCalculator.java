package step09.ex2;

public class AdvancedCalculator extends BasicCalculator{   // advancedCalculator 는 basiccalculator를 쓰겟다.
  
  // 새 곱하기 기능 추가
  void multiple(int value) {
    this.result *= value;
  }
  
}
