package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        scanner.close();

        System.out.println("Введенная строкая " + ((isPalindrome(string) ? "является" : "не является") + " палиндромом"));
    }
    static boolean isPalindrome(String inputString) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetterOrDigit(inputString.charAt(i))) {
                string.append(inputString.charAt(i));
            }
        }
        return string.toString().equalsIgnoreCase(string.reverse().toString());
    }
}