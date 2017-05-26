/* 미니 Express 만들기
*/

module.exports = function() {
  return {
    get() {
      console.log('get()...')
    }, // get()
    post() {
      console.log('post()...')
    },// post()
  } // return
}
