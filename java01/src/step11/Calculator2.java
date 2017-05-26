package step11;

public class Calculator2 {
  private int result;
  
  public void plus(int value){
    result += value;
  }
  
  public void minus(int value){
    result -= value;
  }
  
  public int getResult(){
    return result;
  }
}
