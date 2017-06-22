package step28.ex1;

import java.util.List;

public interface MemberDao {
  List<Member> selectList(int pageNo, int pageSize) throws Exception; // selectList()

  Member selectOne(int no) throws Exception; // selectOne()

  int insert(Member member) throws Exception; // insert()

  int delete(int no) throws Exception; // delete()

  int update(Member member) throws Exception; // update()

  Member selectOneByEmailPassword(String email, String password) throws Exception; // selectOneByEmailPassword()

}
