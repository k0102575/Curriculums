/* 주제: 윈도우 생성하기

 */

const {app, BrowserWindow} = require('electron')

let win

app.on('ready', createWindow)

function createWindow() {
  win = new BrowserWindow({width: 500, height: 400})
  
}
