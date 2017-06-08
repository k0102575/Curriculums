"use strict"

module.exports = {

  setClassroomDao(dao) {
    this.classroomDao = dao
  },

  listName(success, error) {
    this.classroomDao.selectNameList(success, error)
  },//listName()


  list(pageNo, success, error) {
    var obj = this
    this.classroomDao.selectList(pageNo, function(classrooms) {
      obj.classroomDao.countAll(function(result) {
        success(classrooms, result[0].cnt)
      }, error)
    }, error)
  },//list()

  detail(no, success, error) {
    this.classroomDao.selectOne(no, success, error)
  },//detail()

  insert(classroom, success, error) {
    var obj = this
    this.memberDao.insert(classroom, function(result) {
      classroom.no = result.insertId
      obj.classroomDao.insert(classroom, success, error)
    }, error)
  },//insert()

  update(classroom, success, error) {
    var obj = this
    this.memberDao.update(classroom, function(result) {
      obj.classroomDao.update(classroom, success, error)
    }, error)
  }, // update()

  delete(no, success, error) {
    var obj = this
    this.classroomDao.delete(no, function(result) {
      obj.memberDao.delete(no, success, error)
    }, error)
  } // delete()
} // exports
