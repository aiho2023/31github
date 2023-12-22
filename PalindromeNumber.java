public class PalindromeNumber{
public static void main(String[] args){
var X = 121;
if (X.toString().split("").reverse().join("") == X.toString()) {
    System.out.println("Это палиндром");
} else {
    System.out.println("Это не палиндром");
}
}
}
