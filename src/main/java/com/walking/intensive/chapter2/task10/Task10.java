package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("как"));
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));

    }

    static boolean isPalindrome(String inputString) {
        String originalText = "";
        String reversText = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i))) {
                originalText = originalText + inputString.charAt(i);
            }
            if (Character.isLetter(inputString.charAt(inputString.length() - i - 1))) {
                reversText = reversText + inputString.charAt(inputString.length() - i - 1);
            }
        }

        return originalText.toLowerCase().equals(reversText.toLowerCase());
    }
}