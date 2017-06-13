package bitcamp.java93.service;

import java.util.List;

import bitcamp.java93.dao.MemberDao;
import bitcamp.java93.dao.TeacherDao;
import bitcamp.java93.domain.Teacher;

public class TeacherService {
  
  MemberDao memberDao;
  TeacherDao teacherDao;
  
  public void setMemberDao(MemberDao memberDao) {
    this.memberDao = memberDao;
  }
  
  public void setTeacherDao(TeacherDao teacherDao) {
    this.teacherDao = teacherDao;
  }
  
  public List<Teacher> list(int pageNo, int pageSize) throws Exception {
    
    return teacherDao.selectList(pageNo, pageSize);
  } // list()
  
  public Teacher get(int no) throws Exception {
    
    return teacherDao.selectOne(no);
  } // get()
  
  public void add(Teacher teacher) throws Exception {
    memberDao.insert(teacher);
    teacherDao.insert(teacher);
  }  // add()
  
  public void update(Teacher teacher) throws Exception {
    int count = memberDao.update(teacher);
    if (count < 1) {
      throw new Exception(teacher.getNo() + "번 회원을 변경하지 못했습니다.");
    }
    
    count = teacherDao.update(teacher);
    
    if (count < 1) {
      throw new Exception(teacher.getNo() + "번 회원을 변경하지 못했습니다.");
    }
    
  }  // update()
   
  public void remove(int no) throws Exception {
    int count = teacherDao.delete(no);
    
    if (count < 1) {
      throw new Exception(no + "번 회원을 삭제하지 못했습니다.");
    }
    
    count = memberDao.delete(no);
    if (count < 1) {
      throw new Exception(no + "번 회원을 삭제하지 못했습니다.");
    }
  } // remove()
  
}