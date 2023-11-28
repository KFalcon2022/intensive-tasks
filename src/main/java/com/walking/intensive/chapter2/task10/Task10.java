package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab bb  ba"));
    }

    static boolean isPalindrome(String inputString) {
        char[] str = inputString
                .toLowerCase()
                .toCharArray();

        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            if (!Character.isLetter(str[left])) {
                left++;
                continue;
            }

            if (!Character.isLetter(str[right])) {
                right--;
                continue;
            }

            if (str[left] != str[right]) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}