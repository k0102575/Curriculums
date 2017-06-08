"use strict"

module.exports = {

  setLectureDao(dao) {
    this.lectureDao = dao
  },

  setclassroomDao(dao) {
    this.classroomDao = dao
  },

  setManagerDao(dao) {
    this.managerDao = dao
  },

  setMemberDao(dao) {
    this.memberDao = dao
  },


  list(pageNo, success, error) {
    var obj = this
    this.lectureDao.selectList(pageNo, function(lectures) {
      obj.lectureDao.countAll(function(result) {
        success(lectures, result[0].cnt)
      }, error)
    }, error)
  },//list()

  detail(no, success, error) {
    this.lectureDao.selectOne(no, success, error)
  },//detail()

  detail2(no, success, error) {
    this.classroomDao.selectOne2(success, error)
  },//detail2()

  detail3(no, success, error) {
    this.managerDao.selectOne2(success, error)
  },//detail3()

  insert(lecture, success, error) {
    console.log(lecture)
    this.lectureDao.insert(lecture, success, error)
  },//insert()


  update(lecture, success, error) {
    this.lectureDao.update(lecture, success, error)
  },//update()

  delete(no, success, error) {
    this.lectureDao.delete(no, success, error)
  },//delete()


} // exports
