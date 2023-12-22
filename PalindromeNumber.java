public class PalindromeNumber; 
public static void main(String[] args){
var X = 121;
if (X.toString().split("").reverse().join("") == X.toString()) {
    console.log("Это палиндром")
} else {
    console.log("Это не палиндром")
}
}
