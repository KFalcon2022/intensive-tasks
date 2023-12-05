package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Dab bb bad"));
    }

    static boolean isPalindrome(String inputString) {
//        char[] str = inputString
//                .toLowerCase()
//                .toCharArray();

        int left = 0;
        int right = inputString.length() - 1;
        while (left < right) {
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
            left++;
            right--;
        }
        return true;
    }
}