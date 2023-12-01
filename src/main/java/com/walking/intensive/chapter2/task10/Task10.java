package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        Task10 task = new Task10();
        String testString = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println("Is palindrome: " + task.isPalindrome(testString));
    }

    boolean isPalindrome(String inputString) {
        String cleanedString = "";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                cleanedString += currentChar;
            }
        }

        cleanedString = cleanedString.toLowerCase();

        int leftIndex = 0;
        int rightIndex = cleanedString.length() - 1;

        while (leftIndex < rightIndex) {
            char leftChar = cleanedString.charAt(leftIndex);
            char rightChar = cleanedString.charAt(rightIndex);

            if (leftChar != rightChar) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}