package com.walking.intensive.chapter2.task10;

import java.util.Locale;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String str = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println(str + " – " + isPalindrome(str) + " палиндром.");
    }

    static boolean isPalindrome(String inputString){
        inputString = inputString.replaceAll("\\p{Punct}+|\\s+", "").toLowerCase();
        char[] input = inputString.toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (input[i] != input[input.length - i - 1]) {
                return false;
            }
        }

        return true;
    }


}