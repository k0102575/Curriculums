/* GET,
*/

var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')

var router = express.Router()

router.get('/aa/test.do', function(request, response) {
  response.end('/aa/test.do~~~~~``')
})

router.get('/aa/test2.do', function(request, response) {
  response.end('/aa/test2.do~~~~~``')
})

module.exports = router
