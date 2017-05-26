
module.exports = {

  function doList(){
    console.log('[학생 성적 목록 ]')
    let count = 0
    for (var list of information){
    console.log(count++ + ":" + list[0] + "," + list[1] + "," + list[2] + ","
                + list[3] + "," + list[4] + "," + list[5])
    }
  },
  function doAdd(){
    console.log('[학생 성적 입력]')
      prompt.get(['name','kor','eng','math'],function(err,result){
        var addInformation = [result.name,
        parseInt(result.kor),
        parseInt(result.eng),
        parseInt(result.math),
        ]
        addInformation[4] = addInformation [1] + addInformation [2] + addInformation [3]
        addInformation[5] = addInformation[4] / 3
        information[information.length] = addInformation
        start()
      })
    },
    function doDelete(){
      if (information.length == 0) {
        console.log('삭제하실 정보가 없습니다')
        start()
        return
      }
      console.log('[학생 성적 삭제]')
      console.log('삭제할 학생의 넘버를 입력하세요')
        prompt.get(['number'],function(err,result){
        var number = parseInt(result.number)
        if (number < 0 || number >= information.length){
          console.log("학생의 정보가 없는 넘버를 입력하셨습니다.")
          start()
          return
        }
        var deleteInformation = information.splice(number, 1)
        console.log ("삭제하신 정보는 "+ deleteInformation + " 입니다.")
        start()
        })
    }
  }
