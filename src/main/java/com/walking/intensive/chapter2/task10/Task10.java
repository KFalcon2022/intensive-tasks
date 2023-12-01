package com.walking.intensive.chapter2.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        System.out.println(isPalindrome(inputString));
    }

    static boolean isPalindrome(String inputString) {
        StringBuilder suggestion1 = new StringBuilder(inputString.replaceAll("\\s", ""));
        StringBuilder suggestion2 = new StringBuilder(inputString.replaceAll("\\s", ""));

        suggestion1 = getFormatStringBuilder(suggestion1);
        suggestion2 = getFormatStringBuilder(suggestion2);
        suggestion1.reverse();

        if (suggestion1.length() <= 1) {
            return false;
        }

        if (suggestion1.toString().toLowerCase().equals(suggestion2.toString().toLowerCase())) {
            return true;
        }
        return false;
    }

    private static StringBuilder getFormatStringBuilder(StringBuilder suggestion) {
        final String PUNCTUATION = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < suggestion.length(); i++) {
            boolean hasPunctuation = false;

            for (int j = 0; j < PUNCTUATION.length(); j++) {

                if (suggestion.charAt(i) == PUNCTUATION.charAt(j)) {
                    hasPunctuation = true;
                    break;
                }
            }

            if (!hasPunctuation) {
                answer.append(suggestion.charAt(i));
            }
        }
        return answer;
    }
}