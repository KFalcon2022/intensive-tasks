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

        if (inputString.length() < 3){
            return false;
        }

        StringBuilder originalText = new StringBuilder(inputString.toLowerCase());
        StringBuilder reversText = new StringBuilder(inputString.toLowerCase());
        originalText = getReplaceText(originalText);
        reversText = getReplaceText(reversText).reverse();

        return originalText.compareTo(reversText) == 0;
        }

    static StringBuilder getReplaceText(StringBuilder text){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                result.append(text.charAt(i));
            }
        }
        return result;
    }
}