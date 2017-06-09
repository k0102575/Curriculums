/* 애노테이션 사용하기 : value라는 이름의 속성 값 설정하기 */

package step25;

//@Annotation05

public class Class04 {
  @Annotation06
  class Test01{}
  
  @Annotation06
  class Test02{}
  
  @Annotation06(value="값값값")
  class Test03{}
  
  @Annotation06(value2="값값값")
  class Test04{}
  
  @Annotation06("값값값")
  class Test05{}
  
//  @Annotation06("값값값", value2="값값값")
@Annotation06(value="값값값", value2="값값값")
  class Test06{}
  
}
