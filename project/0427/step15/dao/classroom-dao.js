"use strict"

module.exports = {
  setConnection(con) {
    this.connection = con
  },
/*
select l.lno, m.name managername
from lect l left outer join mgr mr on l.mrno = mr.mrno inner join memb m on mr.mrno = m.mno
*/

  selectList(pageNo, successFn, errorFn) {
    this.connection.query(
      'select m.mno, m.name, m.tel, m.email \
      from mgr mr inner join memb m on mr.mrno=m.mno  \
      order by m.name asc \
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

  selectNameList(successFn, errorFn) {
    this.connection.query(
      'select crmno, name from croom order by name asc',
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) // connection.query()
  },//selectNameList()

  countAll(successFn, errorFn) {
    this.connection.query(
      'select count(*) cnt from mgr',
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) //connection.query()
  },//countAll()

  /*
  select c.name
  from croom c
  */

  selectOne(no, successFn, errorFn) {
    this.connection.query(
      'select m.mno, m.name, m.tel, m.email, mr.posi, mr.fax, mr.path \
      from mgr mr inner join memb m on mr.mrno = m.mno \
      where mr.mrno=?',
      [no],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results[0])
        }
      }) // connection.query()
  },//selectOne()

  insert(manager, successFn, errorFn) {
    this.connection.query(
      'insert into mgr(mrno, posi, fax, path) values(?,?,?,?)',
      [manager.no, manager.fax, manager.path, manager.posi],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      }) //connection.query()
  }, //insert

  update(manager, successFn, errorFn) {
    this.connection.query(
      'update mgr set posi=?, fax=?,path=? where mrno=?',
      [manager.posi, manager.fax, manager.path, manager.no],
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
      'delete from mgr where mrno=?',
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
