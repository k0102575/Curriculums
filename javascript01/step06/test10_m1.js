/* 주제: 모듈 안에서 모듈 밖의 변수를 사용할 수 있는가?
*/

"use strict"

//모듈을 로딩하는(가져다 쓰는)쪽에서 선언한 v1 변수를 사용할 수 없다.
// 왜? NodeJS 에서는 var로 선언한 변수는 모듈 변수로 취급한다.
// 즉 그 파일 안에서만 사용할 숭 있다.

v1 = 200
console.log('test10_m1.js => v1:', v1);

global.v2 = 200
global.v3 = 300
console.log('test10_m1.js => global.v2:', global.v2)
