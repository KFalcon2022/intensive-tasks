package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String inputString1 = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        String inputString2 = "\"Madam, in Eden, I'm Adam!\"";
        String inputString3 = "456_654;";

        Task10 check = new Task10();

        System.out.println(check.isPalindrome(inputString1));
        System.out.println(check.isPalindrome(inputString2));
        System.out.println(check.isPalindrome(inputString3));
    }

    boolean isPalindrome(String inputString) {

        if (isNullOrEmpty(inputString)) {
            return false;
        }

        String preparesString = getPreparedString(inputString);

        StringBuilder reversedStringBuilder;
        reversedStringBuilder = new StringBuilder(preparesString);

        return preparesString.equalsIgnoreCase(reversedStringBuilder.reverse().toString());
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

    static boolean isNullOrEmpty(String inputString) {
        return inputString == null || inputString.isEmpty();
    }
}