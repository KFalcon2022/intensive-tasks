package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("В русской литературе достоверно известно"));
        System.out.println(isPalindrome("Кот, сука, за кусток"));
        System.out.println(isPalindrome("!!! ."));
        System.out.println(isPalindrome("!a!"));
        System.out.println(isPalindrome("!!! 0 abba .."));
        System.out.println(isPalindrome("a"));
    }

    static boolean isPalindrome(String inputString) {
        boolean isPalindrome = false;
        int left = 0;
        int right = inputString.length() - 1;
        while (left <= right) {
            if (!Character.isLetter(inputString.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetter(inputString.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toLowerCase(inputString.charAt(left)) != Character.toLowerCase(inputString.charAt(right))) {
                return false;
            }

            isPalindrome = true;
            left++;
            right--;
        }

        return isPalindrome;
    }
}