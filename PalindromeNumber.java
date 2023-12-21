function solution(x) {
if (x===x.split("").reverse().join("")) { // проверяет палиндром или нет
    return true 
}
for (var i = 0; i < x.length; i++) {
    //тут думаю надо поменять местами элементы и проверять заново,но как не знаю (
} } 


console.log(solution("aabb")) // true
