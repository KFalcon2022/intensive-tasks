package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));

    }

    static boolean isPalindrome(String inputString) {

        if (inputString.length() < 2) {
            return false;
        }

        String inputStringFormatted = inputString.toLowerCase().replaceAll("[\\s\\p{P}]", "");

        int stringLength = inputStringFormatted.length();

        for (int i = 0, k = stringLength - 1; i < stringLength && k >= 0; i++, k--) {

            if (inputStringFormatted.charAt(i) != inputStringFormatted.charAt(k)) {
                return false;
            }
        }

        return true;
    }
}