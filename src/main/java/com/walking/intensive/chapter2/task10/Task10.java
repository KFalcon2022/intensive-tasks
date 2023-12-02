package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите палиндром: ");
        String inputString = in.nextLine();
        in.close();

        if (isPalindrome(inputString)) {
            System.out.print("Фраза - палиндром.");
        } else {
            System.out.print("Фраза не палиндром.");
        }
    }

    static boolean isPalindrome(String inputString) {
        int j = inputString.length() - 1;
        int i = 0;
        while (i != j && i < j) {
            if (!isLetter(inputString.charAt(i))) {
                ++i;
                continue;
            }
            if (!isLetter(inputString.charAt(j))) {
                --j;
                continue;
            }
            if (inputString.toLowerCase().charAt(i) != inputString.toLowerCase().charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

    static boolean isLetter(char symbol) {
        /*return switch (symbol) {
            case '.', ',', '"', ')', '(', ':', ';', '-', '_', ' ', '!', '?' -> false;
            default -> true;
        };*/
        return ".,;:()-_ \"\'!?".indexOf(symbol) == -1;
    }
}