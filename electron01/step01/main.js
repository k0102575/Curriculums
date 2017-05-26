/* 주제: Electron 모듈 사용하기


//네이버 웨일은 chromium 과 네이버 자체 개발 슬링으로 만든 브라우저

*/

const {app,BrowserWindow} = require('electron')
const path = require('path')
// ./폴더지정은 안해도됨 npm으로 설치한 모듈은 모듈이름만 지정하면된다.

// 윈도우 객체(의 주소)를 저장할 변수
let win

/* app.on(이벤트명, 콜백함수)
- 지정된 이벤트가 발생할 때 호출될 함수를 등록한다.
- 이벤트?
  => 객체의 특정 실행 상태를 가르킨다.
- 리스너(Listenner) = 이벤트 리스터 = 이벤트 핸들러(handler) = 콜백함수
  => 어떤 객체의 실행이 특정 상태에 놓일 때 자동으로 호출되는 함수를 말한다.
  => 그래서 "내가 호출하는 것이 아니라 객체가 호출한다"라는 의미로
      콜백함수(callback)" 이라 부른다.
  => 특정 이벤트에 귀를 기울리는 함수
    그래서 "이벤트의 소식을 기다리는 자"라는 의미로
    "이벤트 리스너"라고 부른다.
  => 이 함수가 하는 일은 그 이벤트에 따라 적절한 작업을 처리한다.
    그래서 "이벤트를 다르는 자"라는 의미로 "이벤트 핸들러"라고 부른다.
*/

/*해석
  앱이라는 객체가 ready상태에 들어가면 createWindow 함수를 호출해라
  ready = 초기화를 마쳤을떄
애플리케이션이 실행 준비를 마친상태,윈도우를 생성하는 함수를 호출하라!
*/
app.on('ready', createWindow)

app.on('window-all-closed', quitApp)

//윈도우를 생성하고 출력하는 일을 하는 함수
function createWindow() {
  console.log("윈도우 생성하기...")
}

// 앱을 종료 시키는 함수
function quitApp() {
  console.log("애플리케이션 종료하기")
}
