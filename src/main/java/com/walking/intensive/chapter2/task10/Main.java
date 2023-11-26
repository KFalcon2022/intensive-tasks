package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?fd"));


    }
    static boolean isPalindrome(String s){
        char[] sentanse = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();

        for (int i = 0; i < sentanse.length/2; i++) {
            if(sentanse[i]!=sentanse[sentanse.length-i-1]){
                    return false;
                }
            }

        return true;
    }
}