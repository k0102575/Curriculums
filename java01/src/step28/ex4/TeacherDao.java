package step28.ex4;

import java.util.List;

public interface TeacherDao {

  List<Teacher> selectList(int pageNo, int pageSize) throws Exception; // selectList()

  Teacher selectOne(int no) throws Exception; // selectOne()

  int insert(Teacher teacher) throws Exception; // insert()
  
}
