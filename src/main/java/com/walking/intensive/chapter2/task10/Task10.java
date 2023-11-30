package com.walking.intensive.chapter2.task10;

import java.util.Locale;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
        System.out.println(isPalindrome("Горд дох, ход дрог."));
        System.out.println(isPalindrome("Никогда не говори никогда."));
    }

    static boolean isPalindrome(String inputString) {
        inputString = inputString.replaceAll("[ ,.!?]", "").toLowerCase(Locale.ROOT);

        char[] arr = new char[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            arr[i] = inputString.charAt(i);
        }

        char[] pall = new char[inputString.length()];

        for (int i = 1; i < arr.length + 1; i++) {
            pall[i - 1] = arr[arr.length - i];
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (pall[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}