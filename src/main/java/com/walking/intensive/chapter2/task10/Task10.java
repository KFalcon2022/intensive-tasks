package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw!!!"));
        System.out.println(isPalindrome("Caroline please!"));

    }

    static boolean isPalindrome(String inputString) {
        String clearLetters = "";
        for (int i = 0; i < inputString.length(); i++) {
            clearLetters += Character.isLetter(inputString.charAt(i)) ? inputString.charAt(i) : "";
        }
        clearLetters = clearLetters.toLowerCase();
        String reverseString = "";
        for (int i = clearLetters.length() - 1; i >= 0; i--) {
            reverseString += clearLetters.charAt(i);

        }
        //System.out.println(clearLetters);
        //System.out.println(reverseString);
        if (reverseString.equals(clearLetters)) {
            return true;
        } else {
            return false;
        }
    }
}