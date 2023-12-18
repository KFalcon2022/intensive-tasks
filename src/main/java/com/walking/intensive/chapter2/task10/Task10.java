package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза, ранясь шилом опыта, ты помолишься на разум"));
    }

    static boolean isPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;
        boolean hasLetter = false;

        while (left < right) {
            // Проверяем, является ли символ слева буквой
            while (left < right && !Character.isLetter(inputString.charAt(left))) {
                left++;
            }

            // Проверяем, является ли символ справа буквой
            while (left < right && !Character.isLetter(inputString.charAt(right))) {
                right--;
            }

            // Проверяем, встретилась ли хотя бы одна буква
            if (left < right) {
                hasLetter = true;
            }

            // Сравниваем символы
            if (Character.toUpperCase(inputString.charAt(left)) != Character.toUpperCase(inputString.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return hasLetter;
    }
}