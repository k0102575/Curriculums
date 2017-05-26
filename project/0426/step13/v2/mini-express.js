/* 미니 Express 만들기 - 모듈에서 함수 리턴
*/

module.exports = () => {
  return {
    get() {
      console.log('1...')
    }, // get()

    post() {
      console.log('2...')
    }
  } // return
} // module.exports
