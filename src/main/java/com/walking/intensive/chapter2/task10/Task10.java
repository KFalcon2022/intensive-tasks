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
        String str = inputString.replaceAll("[,.!? -]", "").toLowerCase();
        int check = 0;
        int j = str.length();
        for (int i = 0; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) == str.charAt(j - 1)) {
                check++;
            }
        }

        if (check == j - 1) {
            return true;
        }
        return false;
    }
}