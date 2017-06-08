"use strict"

module.exports = {
  setConnection(con) {
    this.connection = con
  },

  selectOne2(successFn, errorFn) {
    this.connection.query(
      'select c.name crmname, c.crmno from croom c',
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) // connection.query()
  },//selectOne()


}//exports
