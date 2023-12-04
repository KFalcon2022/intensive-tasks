package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String testString = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println("Is palindrome: " + isPalindrome(testString));
    }

    public static boolean isPalindrome(String inputString) {
        String cleanedInput = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9а-яА-Я]", "");
        if (cleanedInput.length() <= 1) {
            return false;
        }
        int left = 0, right = cleanedInput.length() - 1;
        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}