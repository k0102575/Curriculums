"use strict"

const net = require('net')
window.$ = window.jQuery = require('jquery')

var host = $('#host'),
    port = $('#port'),
    connectBtn = $('#connectBtn'),
    closeBtn = $('#closeBtn'),
    v1 = $('#v1'),
    v2 = $('#v2'),
    op = $('#op'),
    result = $('#result');

closeBtn.css('display', 'none')

var socket = new net.Socket()

socket.on('connect', () => {
  connectBtn.css('display', 'none')
  closeBtn.css('display', '')
}) // socket.on(connect)

var buffer = ''

socket.on('data', (data) => {
  buffer += data.toString()

  while (true) {
  var newLineIndex = buffer.indexOf('\n')
  if (newLineIndex < 0) {
    return
  }

  var value = buffer.substring(0, newLineIndex)
  buffer = buffer.substring(newLineIndex +1)

  if (value.length > 0) {
    break;
  }

  }// while

  result.val(value)

}) // socket.on(data)

socket.on('error', (error) => {
  alert(error.message)
}) // socket.on('error')

socket.on('timeout', () => {
  alert('서버가 응답하지 않습니다')
  socket.destroy()
}) // socket.on(timeout)

socket.on('close', () => {
  alert('끊었습니다!')

  // connectBtn.css('display', '')
  // closeBtn.css('display', 'none')
}) // socket.on(close)

connectBtn.click(() => {
  socket.connect(parseInt(port.val()), host.val()) // socket.connect
  // socket.setTimeout(500)
}) // connectBtn.click()

closeBtn.click(() => {
  socket.end()
  socket.destroy()
  connectBtn.css('display', '')
  closeBtn.css('display', 'none')
}) // closeBtn.click()

$('#send').click(() => {
  var obj = {
    'v1' : parseInt(v1.val()),
    "v2" : parseInt(v2.val()),
    op : op.val()
  }

  socket.write(JSON.stringify(obj) + '\r')
}) // #send.click()
