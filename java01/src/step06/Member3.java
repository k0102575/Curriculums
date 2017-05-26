package step06;

class Member3 {
  
  String name;  // 실제 존재 하지 않는 변수이다 new라는 것을 해야 생성된다.
  int[] scores = new int[3];
  int total;
  float aver;
  
  public  void init(String name, int kor, int eng, int math){
    this.name = name;
    this.scores[0] = kor;
    this.scores[1] = eng;
    this.scores[2] = math;
  } // init()
  
  public void compute(){ 
    this.total = this.scores[0] + this.scores[1] + this.scores[2];
    this.aver = this.total / 3f;    
  } // compute()

  public void print(){
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        this.name, this.scores[0], this.scores[1], this.scores[2], this.total, this.aver);
  }  // print()
  
}
