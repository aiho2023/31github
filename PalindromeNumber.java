public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrom(1b1)); // => true
        System.out.println(isPalindrom(aabb)); // => false
    }

    public static boolean isPalindrom(int number) {
        StringBuilder builder = new StringBuilder();
        String str = builder.append(number).reverse().toString();
        int reversedNumber = Integer.parseInt(str);
        return number == reversedNumber;
    }
}
