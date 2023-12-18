package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза, ранясь шилом опыта, ты помолишься на разумы"));
    }

    static boolean isPalindrome(String inputString) {
        char[] chars = new char[inputString.length()];
        int length = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetter(c)) {
                chars[length++] = Character.toUpperCase(c);
            }
        }

        if (length == 0) {
            return false;
        }

        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}