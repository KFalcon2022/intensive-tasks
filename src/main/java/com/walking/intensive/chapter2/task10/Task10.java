package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner palindrome = new Scanner(System.in);

        System.out.println("Введите строку");
        String inputString = palindrome.nextLine();

        System.out.println(isPalindrome(inputString));
    }
    static boolean isPalindrome(String inputString) {
        String removeExcess = inputString.replaceAll("[^\\p{L}\\p{N}]+", "");
        StringBuilder result = new StringBuilder(removeExcess);
        StringBuilder reverse = result.reverse();

        return reverse.toString().equalsIgnoreCase(removeExcess);
    }
}
