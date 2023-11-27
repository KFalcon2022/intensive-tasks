package com.walking.intensive.chapter2.task10;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(getPalindrome("А роза упала на лапу азора!"));
    }

    public static String getPalindrome(String income) {

        StringBuilder convertString = new StringBuilder();
        convertString.append(income.toLowerCase().replaceAll("[^\\p{L}\\p{N}]", ""));

        int start = 0;
        int end = convertString.length() - 1;

        while (start < end) {

            if (convertString.charAt(end) != convertString.charAt(start)) {
                return "Строка не палиндром.";

            }
            start++;
            end--;
        }
        return "Строка является палиндромом.";
    }
}