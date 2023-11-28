package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?fd"));


    }
    static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s.replaceAll("[^a-zA-Z]", "").toLowerCase());
        if(!sb.toString().contentEquals(sb.reverse())){
            return false;
        }
        return true;
    }
}