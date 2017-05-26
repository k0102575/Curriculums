"use strict"

module.exports = {
  setConnection(con) {
    this.connection = con
  },


  selectList(pageNo, pageSize, successFn, errorFn) {
    this.connection.query(
      "select lno, titl, date_format(sdt,'%Y-%m-%d') sdt2, \
      date_format(edt,'%Y-%m-%d') edt2, thrs, pric \
      from lect \
      order by sdt desc \
      limit ?, ?",
      [(pageNo - 1) * pageSize, pageSize],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) // connection.query()
  },//selectList()

  countAll(successFn, errorFn) {
    this.connection.query(
      'select count(*) cnt from lect',
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) //connection.query()
  },//countAll()

/*
select lno, titl, dscp, sdt, edt, qty, pric, thrs, crmno, mrno
from lect
where lno =
*/

  selectOne(no, successFn, errorFn) {
    this.connection.query(
      "select lno, titl, dscp, date_format(sdt,'%Y-%m-%d') sdt2, \
      date_format(edt,'%Y-%m-%d') edt2, qty, pric, thrs, crmno, mrno \
      from lect \
      where lno = ?",
      [no],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results[0])
        }
      }) // connection.query()
  },//selectOne()

  insert(lecture, successFn, errorFn) {
    this.connection.query(
      'insert into lect(crmno, mrno, titl, dscp, sdt, edt, qty, pric, thrs) values(?,?,?,?,?,?,?,?,?)',
      [lecture.classroom, lecture.manager, lecture.titl, lecture.dscp, lecture.sdt, lecture.edt, lecture.qty, lecture.pric, lecture.thrs],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      }) //connection.query()
  }, //insert

  update(l, successFn, errorFn) {
    this.connection.query(
      'update lect set titl=?, dscp=?, sdt=?, edt=?, qty=?, pric=?, thrs=?, crmno=?, mrno=? where lno=?',
      [l.titl, l.dscp, l.sdt, l.edt, l.qty, l.pric, l.thrs, l.classroom, l.manager, l.no],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      }) //connection.query()
  }, //update()

  delete(no, successFn, errorFn) {
    this.connection.query(
      'delete from lect where lno=?',
      [no],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      })
  }//delete()

}//exports
