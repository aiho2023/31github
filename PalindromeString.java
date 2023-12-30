function isPalindrome(str) {
str = str.toLowerCase().replace(/[^а-яa-z]/g, "");
var reversedStr = "";
for (var i = str.length - 1; i >= 0; i--) {
reversedStr += str.charAt(i);
}
return str === reversedStr;
}
public class PalindromeString {
public static void main(String[] args) {
var inputString = "А роза упала на лапу Азора";
var result = isPalindrome(inputString);
console.log(result);
}
}

