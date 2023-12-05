package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

    }

    static boolean isPalindrome(String inputString) {
        if (isNullOrEmpty(inputString)) {
            return false;
        }

        String preparedString = getPreparedString(inputString);

        if (preparedString.length() == 1) {
            return false;
        }

        StringBuilder reversedStringBuilder;
        reversedStringBuilder = new StringBuilder(preparedString);

        return preparedString.equalsIgnoreCase(reversedStringBuilder.reverse().toString());
    }

    static boolean isNullOrEmpty(String inputString) {
        return inputString == null || inputString.isEmpty();
    }

    static String getPreparedString(String inputString) {

        if (isNullOrEmpty(inputString)) {
            return "";
        }

        StringBuilder preparedStringBuilder;
        preparedStringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if ((character >= ' ' && character <= '/') ||
                    (character >= ':' && character <= '?') ||
                    (character >= '[' && character <= '_')) {
                continue;
            }

            preparedStringBuilder.append(character);
        }

        return preparedStringBuilder.toString();
    }
}