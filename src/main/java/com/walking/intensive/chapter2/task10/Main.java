package com.walking.intensive.chapter2.task10;

import static java.lang.Character.isLetter;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aaavaaa"));
    }

    public static boolean isPalindrome(String example) {
        String stringWithoutPunctuation = removePunctuation(example);
        return stringWithoutPunctuation.equalsIgnoreCase(rewerseString(stringWithoutPunctuation));
    }

    public static String removePunctuation(String string) {

        String stringWithoutPunctuation = "";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (isLetter(c)) {
                stringWithoutPunctuation += c;
            }
        }
        return stringWithoutPunctuation;
    }

    public static String rewerseString(String string) {

            char[] array = string.toCharArray();
            String result = "";

            for (int i = array.length - 1; i >= 0; i--) {
                result += array[i];
            }

            return result;
    }


}