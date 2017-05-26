package step06;

class Student {
  String name;
  int[] scores = new int[3];
  int total;
  float aver;
  
  public static void init(Student s, String name, int kor, int eng, int math){
    
    s.name = name;
    s.scores[0] = kor;
    s.scores[1] = eng;
    s.scores[2] = math;
    
  } // init()

  public static void compute(Student s){ // 계산할 객체(인스턴스 주소) 를 주세요
    
    s.total = s.scores[0] + s.scores[1] + s.scores[2];
    s.aver = s.total / 3f;    
    
  } // compute()
  
  public static void print(Student s){
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                      s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
    
  } // print()
} // class Student
