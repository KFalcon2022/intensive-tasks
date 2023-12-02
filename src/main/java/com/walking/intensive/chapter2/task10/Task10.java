package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Niagara o roar ag!!/.!ain"));
    }

    static boolean isPalindrome(String inputString) {
        String strListAdditionalCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
        inputString = inputString.toLowerCase();
        int counterFromBeginning = 0;
        int counterFromEnd = inputString.length() - 1;
        while (counterFromBeginning <= counterFromEnd) {
            if (strListAdditionalCharacters.indexOf(inputString.charAt(counterFromBeginning)) != -1 && strListAdditionalCharacters.indexOf(inputString.charAt(counterFromEnd)) != -1) {
                if (inputString.charAt(counterFromBeginning) != inputString.charAt(counterFromEnd)) {
                    return false;
                }
                counterFromEnd--;
                counterFromBeginning++;
            } else {
                counterFromBeginning += strListAdditionalCharacters.indexOf(inputString.charAt(counterFromBeginning)) == -1 ? 1 : 0;
                counterFromEnd += strListAdditionalCharacters.indexOf(inputString.charAt(counterFromEnd)) == -1 ? -1 : 0;
            }
        }
        return true;
    }
}