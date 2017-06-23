package step28.ex6;

import java.util.List;
import java.util.Map;

public interface MemberDao {
  List<Member> selectList(Map<String, Object> valueMap) throws Exception; // selectList()
  
  List<Member> selectListByNames(Map<String, Object> valueMap) throws Exception; // selectList()
  
  Member selectOne(int no) throws Exception; // selectOne()

  int insert(Member member) throws Exception; // insert()

  int delete(int no) throws Exception; // delete()

  int update(Member member) throws Exception; // update()

  Member selectOneByEmailPassword(Map<String, Object> valueMap) throws Exception; // selectOneByEmailPassword()

}
