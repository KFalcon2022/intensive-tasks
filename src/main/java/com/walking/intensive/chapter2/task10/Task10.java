package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String inputString = console.nextLine();

        console.close();
        System.out.println(isPalindrome(inputString));
    }

    static boolean isPalindrome(String inputString) {
        char[] palindromeArray = inputString.toCharArray();
        for (int i = 0; i < palindromeArray.length; ++i) {
            for (int j = palindromeArray.length - 1; j >= 0; --j) {
                if (Character.isAlphabetic(palindromeArray[i]) && Character.isAlphabetic(palindromeArray[j])) {
                    palindromeArray[i] = Character.toLowerCase(palindromeArray[i]);
                    return palindromeArray[i] == palindromeArray[j];
                }
            }
        }
        return false;
    }
}


