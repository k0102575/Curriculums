"use strict"

module.exports = {
  setConnection(con) {
    this.connection = con
  },

  selectList(pageNo, successFn, errorFn) {
    this.connection.query(
      'select l.lno, l.titl, c.name classname, m.name managername  \
      from lect l left outer join croom c on l.crmno = c.crmno \
        left outer join mgr mr on l.mrno = mr.mrno \
        left outer join memb m on mr.mrno = m.mno  \
      order by lno asc \
      limit ?, ?',
      [(pageNo - 1) * 3, 3],
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



*/

  selectOne(no, successFn, errorFn) {
    this.connection.query(
      'select l.lno, l.titl, l.dscp, l.sdt, l.edt, l.qty, l.pric, l.thrs, c.name classname, m.name managername \
      from lect l left outer join croom c on l.crmno = c.crmno \
        left outer join mgr mr on l.mrno = mr.mrno \
        left outer join memb m on mr.mrno = m.mno \
        where l.lno=?',
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
      [lecture.crmno, lecture.mrno, lecture.titl, lecture.dscp, lecture.sdt, lecture.edt, lecture.qty, lecture.pric, lecture.thrs],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      }) //connection.query()
  }, //insert

  update(lecture, successFn, errorFn) {
    this.connection.query(
      'update lect set titl=?, dscp=?, sdt=?, edt=?, qty=?, pric=?, thrs=?, crmno=?, mrno=? where lno=?',
      [lecture.titl, lecture.dscp, lecture.sdt, lecture.edt, lecture.qty, lecture.pric, lecture.thrs, lecture.crmno, lecture.mrno, lecture.no],
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
