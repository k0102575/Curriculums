/* 주제: HTML 파일의 경로를 쉽게 찾기

 */

const {app, BrowserWindow} = require('electron')

let win

app.on('ready', createWindow)

console.log(__dirname);

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  //win.loadURL('file:///C:/workspace/electron01/step03/index.html')
  win.loadURL('file://' + __dirname + '/index.html')
  // file:// 는 프로토콜 규칙 웹은 http:// 필수
  // dirname  nodsjs에서 제공하는 함수 이파일의 디렉토리 경로
}
