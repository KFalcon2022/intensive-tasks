package com.walking.intensive.chapter2.task10;

/**
 * ???????: <a href="https://geometry-math.ru/homework/Java-palindrome.html">??????</a>
 */
public class Task10 {
    public static void main(String[] args) {

        String str1 = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        String str2 = "О, Муза! Ранясь шилом опыта, ты помолишься на разум.";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    static boolean isPalindrome(String inputString) {

        char[] arrayOfChars = new char[inputString.length()];
        int lastLetterIndex = 0;

        for (int i = 0 ; i < inputString.length() ; i++) {
            if ( Character.isLetter(inputString.charAt(i)) ) {
                arrayOfChars[lastLetterIndex++] = Character.toLowerCase (inputString.charAt(i) );
            }
        }

        for (int j = 0 ; j < lastLetterIndex ; j++) {
            if (arrayOfChars[j] != arrayOfChars[lastLetterIndex-1-j]) {
            return false;
            }
        }

        return true;
    }






    /* static boolean isPalindrome(String inputString) {

        String lowerCaseString = inputString.toLowerCase();
        String regex = "[^а-яa-z]";
        String stringWithoutSymbols = lowerCaseString.replaceAll(regex , "");
        StringBuilder stringWithoutSymbolsReverse = new StringBuilder(stringWithoutSymbols).reverse();

        return stringWithoutSymbols.compareTo(stringWithoutSymbolsReverse.toString()) == 0;
    } */
}