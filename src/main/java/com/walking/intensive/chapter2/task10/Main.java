package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa.aba fAa"));
    }

    public static boolean isPalindrome(String example) {
        example = example.toLowerCase();
        for (int i = 0; i < example.length() - 1; i++) {

            int j = example.length() - 1 - i;

            if (example.charAt(j) == '.' || example.charAt(j) == ',' || example.charAt(j) == ' ' || example.charAt(j) == '?') {
                j--;
            }

            if (example.charAt(i) == '.' || example.charAt(i) == ',' || example.charAt(i) == ' ' || example.charAt(i) == '?') {
                i++;
            }

            if (i > j) {
                break;
            }

            if (example.charAt(j) != example.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}