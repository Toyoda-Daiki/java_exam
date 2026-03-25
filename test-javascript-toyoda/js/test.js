//問題1
// console.log("豊田大樹");


//問題2
// let firstName = "Daiki";
// let lastName = "Toyoda";
// console.log(lastName + " " + firstName);


//問題3
// let subtotal = 200 * 3 + 250 * 4;
// let tax = subtotal * 0.1;
// let total = subtotal + tax;
// console.log("小計");
// console.log(subtotal + "円");
// console.log("消費税");
// console.log(tax + "円");
// console.log("合計金額");
// console.log(total + "円");


//問題4
// let testScore = -1;
// if (testScore >= 0 && testScore <= 79) {
//   console.log("追試です");
// } else if (testScore >= 80 && testScore <= 100) {
//   console.log("合格です");
// } else {
//   console.log("存在しない点数です");
// }


//問題5
// let total = 0;
// for(let i = 1; i <= 100; i++){
//   total += i;
// }
// console.log(total);


//問題6
function add(x, y) {
  return x + y;
}
function sub(x, y) {
  return x - y;
}
function multi(x, y) {
  return x * y;
}
function div(x, y) {
  return x / y;
}
let x = 5;
let y = 3;
console.log(x + ' + ' + y + ' = ' + add(x, y));
console.log(x + ' - ' + y + ' = ' + sub(x, y));
console.log(x + ' * ' + y + ' = ' + multi(x, y));
console.log(x + ' / ' + y + ' = ' + div(x, y));
