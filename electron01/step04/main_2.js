/* 주제: HTML 파일의 경로를 쉽게 찾기

 */

const {app, BrowserWindow} = require('electron')
const path = require('path')

let win

app.on('ready', createWindow)

console.log(__dirname);

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  //win.loadURL('file:///C:/workspace/electron01/step03/index.html')
  //win.loadURL('file://' + __dirname + '/index.html')
  win.loadURL(path.join('file://', __dirname, '/index.html'))
  //         /를 정리해 주는 도구 path.join    path라는 객체 join 도구

}
console.log(path.join('file://', __dirname, '/index.html'))
