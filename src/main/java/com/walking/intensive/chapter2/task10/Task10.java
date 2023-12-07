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

        int i = 0;
        int j = preparedString.length() - 1;
        while (i <= j) {
            if (preparedString.charAt(i) != preparedString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
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

        return preparedStringBuilder.toString().toLowerCase();
    }
}