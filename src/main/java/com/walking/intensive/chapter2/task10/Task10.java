package com.walking.intensive.chapter2.task10;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        /* Онлайн компилятор, где кодировка windows-1251 работает:

        https://www.jdoodle.com/online-java-compiler

         */

        String palindrome = "Учуя молоко, я около мяучу";
        String encodedInputString;

        try {
            byte[] byteArray = palindrome.getBytes("windows-1251");
            encodedInputString = new String(byteArray, "windows-1251");
                // пробовал и с StandardCharsets.UTF_8
                // проверка работает и так, и так
                // нужно для корректного отображения в консоли
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Является ли палиндромом: " + isPalindrome(encodedInputString));
    }

    public static boolean isPalindrome(String inputString) {
        char[] symbol = inputString.toCharArray();
        //System.out.println(symbol);
        StringBuilder formattedPalindrome = new StringBuilder();

        for (int i = 0; i < symbol.length; i++) {               //фильтруем по char
            if ((symbol[i] >= 1040 && symbol[i] <= 1103) ||     //UTF-8 Cyrillic (А-Я, а-я)
                    symbol[i] == 1025 ||                        //буква Ё
                    symbol[i] == 1105 ||                        //буква ё
                    (symbol[i] >= 65 && symbol[i] <= 90) ||     //UTF-8 Basic Latin (A-Z)
                    (symbol[i] >= 97 && symbol[i] <= 122)       //UTF-8 Basic Latin (a-z)
            ) {
                formattedPalindrome.append(symbol[i]);
            }
        }
        String upcasedPalindrome = formattedPalindrome.toString().toUpperCase();
        //System.out.println(upcasedPalindrome);

        for (int i = 0; i < upcasedPalindrome.length() / 2; i++) {
            if (upcasedPalindrome.charAt(i) !=
                    upcasedPalindrome.charAt(upcasedPalindrome.length() - 1 - i)) return false;

        }

        return true;
    }
}