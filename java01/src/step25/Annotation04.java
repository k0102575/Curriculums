/* 애노테이션: 속성값 설정하기 */

package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation04 {
  String v1();
  String v2() default "aaa"; // 선택 속성
  
  int v3();
  int v4() default 100;
  
}
