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

    public static boolean isPalindrome(String inputString) {

        String cleanedString = inputString.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        if (cleanedString.isEmpty() || cleanedString.length() == 1) {
            return true;
        }

        return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
    }
}