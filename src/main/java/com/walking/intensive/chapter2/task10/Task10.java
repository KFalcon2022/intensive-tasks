package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String receivedSuggestion = sc.nextLine();

        System.out.println(isPalindrome(receivedSuggestion));
    }

    static boolean isPalindrome(String receivedSuggestion){
        String suggestion = receivedSuggestion;
        suggestion = getFormatString(suggestion);

        for(int i = 0; i < suggestion.length(); i++){
            if(suggestion.charAt(i) != getReverseString(suggestion)[i]){
                return false;
            }
        }
        return true;
    }

    private static char[] getReverseString(String suggestion){
        char[] newSuggestion = new char[suggestion.length()];

        for(int i = 0; i < suggestion.length(); i++){
            newSuggestion[(suggestion.length() - 1) - i] = suggestion.charAt(i);
        }
        return newSuggestion;
    }

    private static String getFormatString(String suggestion){
        suggestion = (suggestion.toLowerCase()).replaceAll("\\p{IsPunctuation}", "");
        suggestion = suggestion.replaceAll(" ", "");

        return suggestion;
    }
}