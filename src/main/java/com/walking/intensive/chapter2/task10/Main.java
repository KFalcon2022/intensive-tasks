package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("rerer"));
    }

    public static boolean isPalindrome(String example) {
        String str = example.replaceAll(" ", "").replaceAll("\\p{Punct}", "");

        return str.equalsIgnoreCase(String.valueOf(new StringBuilder(str).reverse()));
    }


}