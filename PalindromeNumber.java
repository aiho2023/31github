public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrom(1b1)); // => true
        System.out.println(isPalindrom(aabb)); // => false
    }

    public static boolean isPalindrom(int string) {
        StringBuilder builder = new StringBuilder();
        String str = builder.append(string).reverse().toString();
        int reversedString = Integer.parseInt(str);
        return string == reversedString;
    }
}
