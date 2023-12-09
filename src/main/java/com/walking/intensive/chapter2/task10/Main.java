package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?fd"));
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("abba"));
    }

    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.replaceAll("[^a-zA-Z]", "").toLowerCase().length() / 2; i++) {
            if (s.replaceAll("[^a-zA-Z]", "").toLowerCase().charAt(i) != s.replaceAll("[^a-zA-Z]", "").toLowerCase().charAt(s.replaceAll("[^a-zA-Z]", "").toLowerCase().length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}