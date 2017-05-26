"use strict"

function createStudentService(memberDao, studentDao) {
  return {
    /*
    list(pageNo, success, error)스펙
    pageNo: 가져올 페이지의 번호
    success: 데이터 가져오는데 성공했을 때 호출될 함수
      success(학생데이터배열, 전체개수)
    error: 데이터 가져오는데 실패했을 때 호출될 함수
      error(오류객체)
    */
    list(pageNo, success, error) {
      studentDao.selectList(pageNo, function(students) { // 저쪽에서 값을 넘기는데 내가 이런 이름으로 가진 그릇으로 받겟다.
        studentDao.countAll(function(result) {
          success(students, result[0].cnt)
        }, error) // studentDao.countAll()
      }, error) // studentDao.selectList()
    }, // list()

    detail(no, success, error) {
      studentDao.selectOne(no, success, error)
    }, // detail()

    insert(student, success, error) {  // 멤버 정보 , 성공하면은 이 함수를 호출하고 에러하면 에러
      memberDao.insert(student, function(result) {  // 멤버 데이터를 추가하고 결과값에서 mno를 알아야 지 student에서 사용할수있다.
        student.no = result.insertId
        studentDao.insert(student, success, error) // studentDao.insert()
      }, error) // memberDao.insert()

    }, // insert()

    update(student, success, error) {
      memberDao.update(student, function(result) {
        studentDao.update(student, success, error) // studentDao.update()
      }, error) //memberDao.update()

    }, // update()

    delete(no, success, error) {
      studentDao.delete(no, function(result) {
        memberDao.delete(no, success, error) // memberDao.delete()
      }, error) // studeneDato.delete()
    } // delete()

  } //return
} // createStudentService()
























/**/
