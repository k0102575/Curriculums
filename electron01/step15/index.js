"use strict"

const net = require('net')
window.$ = window.jQuery = require('jquery')

$('#send').click(() => {
  var host = $('#host').val(),
      port = parseInt($('#port').val()),
      message = $('#message').val();

  var socket = new net.Socket()
  socket.setTimeout(500)
  // 잘못된 서버에 접속하면 0.5초 뒤에  timeout을 한다.

  socket.connect(port, host, () => {
    socket.write(message + '\n')
  }) // socket.connect

  socket.on('error', (error) => {
    alert(error.message)
  }) // socket.on('error')

  socket.on('data', (data) => {
    $('#response').val(data.toString())
    socket.destroy()
  }) // socket.on(data)

  socket.on('timeout', () => {
    alert('서버가 응답하지 않습니다')
    socket.destroy()
  }) // socket.on(timeout)

}) // #send.click()
