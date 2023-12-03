package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
        System.out.println(isPalindrome("Горд дох, ход дрог."));
        System.out.println(isPalindrome("Никогда не говори никогда."));
    }

    static boolean isPalindrome(String inputString) {
        StringBuffer originalPhrase = new StringBuffer(inputString.toLowerCase());
        StringBuffer phrase = new StringBuffer();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(originalPhrase.charAt(i))) {
                phrase.append(originalPhrase.charAt(i));
            }
        }

        StringBuffer reversePhrase = new StringBuffer();

        for (int i = originalPhrase.length() - 1; i >= 0; i--) {
            if (Character.isLetter(originalPhrase.charAt(i))) {
                reversePhrase.append(originalPhrase.charAt(i));
            }
        }

        for (int i = 0; i < phrase.length(); i++) {
            if (!(phrase.charAt(i) == reversePhrase.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
