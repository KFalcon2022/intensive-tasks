package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
    }

    static boolean isPalindrome(String inputString) {
        char[] badSymbols = {'!', '?', ' ', ',', '.', '-', '\'', '\"'};//
        for (char symbol : badSymbols
        ) {
            inputString = inputString.replace(String.valueOf(symbol), "");
        }
        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }
}