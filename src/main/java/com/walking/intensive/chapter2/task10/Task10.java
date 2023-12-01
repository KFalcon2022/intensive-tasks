package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "Hello, World!";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " - это палиндром.");
        } else {
            System.out.println(str1 + " - это не палиндром.");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " - это палиндром.");
        } else {
            System.out.println(str2 + " - это не палиндром.");
        }
    }

    // Метод для проверки строки на палиндром
    public static boolean isPalindrome(String inputString) {
        // Убираем пунктуацию и приводим строку к нижнему регистру
        inputString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false; // Если символы не совпадают, строка не палиндром
            }
            left++;
            right--;
        }
        return true; // Если все символы совпадают, строка палиндром
    }
}