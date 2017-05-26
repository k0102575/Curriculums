/*
var prompt = require('prompt');

prompt.start();


prompt.get(['step'], function(err, result) {
  var step = parseInt(result.step);

  a = 1;
  while(a <= 9){
    console.log(step + "*" + a + "=" + (step * a));
    a++;
  }

});
*/

var prompt = require('prompt');

prompt.start();


prompt.get(['step'], function(err, result) {
  var step = parseInt(result.step);
  for(a = 1; a <=9 ;a++){
    console.log(step + "*" + a + "=" + (step * a));
  }
}
);
