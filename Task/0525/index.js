"use strict"

const net = require('net')
window.$ = window.jQuery = require('jquery')


var sendChat = $('#sendChat'),
    sendBtn = $('#sendBtn'),
    userId = $('#userId'),
    host = $('#host'),
    port = $('#port'),
    conBtn = $('#conBtn'),
    chat = $('#chat')


var buffer = ''

var socket = new net.Socket()

socket.on('connect', () => {
  console.log("서버연결됨")
}) // socket.on(connect)


socket.on('data', (data) => {
  buffer += (data.toString()+ '\n')
  chat.val(buffer)
}) // socket.on(data)

sendChat.keypress(function(e) {
    if(e.which == 13) {
      var obj = {
        userId : userId.val(),
        content : sendChat.val()
      }
      socket.write(JSON.stringify(obj) + '\n')
      sendChat.val('')
    }
})

socket.on('error', (error) => {
  // alert(error.message)
}) // socket.on('error')

conBtn.click(() => {
  socket.connect(parseInt(port.val()), host.val())
}) // connectBtn.click()

sendBtn.click(() => {
  var obj = {
    userId : userId.val(),
    content : sendChat.val()
  }

  socket.write(JSON.stringify(obj) + '\n')
  sendChat.focus()
  sendChat.val('')

}) // #send.click()
