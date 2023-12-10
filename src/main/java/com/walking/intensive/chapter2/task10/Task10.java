package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
    }

    static boolean isPalindrome(String inputString) {
        if(inputString == null || inputString.isEmpty()) {
            return false;
        }

        String preparedString = getPreparedString(inputString);

        if (preparedString.isEmpty()) {
            return false;
        }

        int i = 0;
        int lastCharIndex = preparedString.length() - 1;

        while (i < preparedString.length()/2) {
            if (preparedString.charAt(i) != preparedString.charAt(lastCharIndex - i)) {
                return false;
            }
            i++;
        }

        return true;
    }

    static String getPreparedString(String inputString) {
        StringBuilder preparedStringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                preparedStringBuilder.append(character);
            }
        }

        return preparedStringBuilder.toString().toLowerCase();
    }
}