class PalindromeString {
    static boolean isPalindrome(String word) {
        int length = word.length();
        // Двигаемся с обоих концов слова к серидине
        for (int i = 0; i < (n / 2); i++) {
            // Сравниваем символы попарно
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return false;
            }
        }
        return true;
    }
}
