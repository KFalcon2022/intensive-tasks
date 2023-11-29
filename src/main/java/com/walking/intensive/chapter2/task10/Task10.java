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
        int leftOnRight = 0, rightOnLeft = inputString.length() - 1;

        while (leftOnRight < rightOnLeft) {
            char left = Character.toLowerCase(inputString.charAt(leftOnRight));
            char right = Character.toLowerCase(inputString.charAt(rightOnLeft));

            if (Character.isLetter(left) && Character.isLetter(right)) {
                if (left != right) {
                    return false;
                }
                leftOnRight++;
                rightOnLeft--;
            } else if (!Character.isLetter(left)) {
                leftOnRight++;
            } else if (!Character.isLetter(right)) {
                rightOnLeft--;
            }
        }
        return true;
    }
}

