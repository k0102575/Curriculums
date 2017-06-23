package step28.ex6;

import java.util.List;
import java.util.Map;

public interface TeacherDao {

  List<Teacher> selectList(Map<String, Object> valueMap) throws Exception; // selectList()

  Teacher selectOne(int no) throws Exception; // selectOne()

  int insert(Teacher teacher) throws Exception; // insert()
  
}
