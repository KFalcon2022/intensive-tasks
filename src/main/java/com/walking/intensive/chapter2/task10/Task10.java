package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String str1 = "radar";
        String str2 = "hello";
        String str3 = "А роза упала на лапу Азора";

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

        if (isPalindrome(str3)) {
            System.out.println(str3 + " - это палиндром.");
        } else {
            System.out.println(str3 + " - это не палиндром.");
        }
    }

    public static boolean isPalindrome(String inputString) {
        // Ваш код
        // Убираем пробелы и приводим строку к нижнему регистру
        inputString = inputString.replaceAll(" ", "").toLowerCase();
//        inputString = inputString.toLowerCase();

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