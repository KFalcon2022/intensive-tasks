package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("!!////"));
        System.out.println(isPalindrome("Муза! ранясь шилом опыта, ты помолишься на разум"));

    }

    static boolean isPalindrome(String inputString) {
        if (isLetterOnText(inputString)){

            return false;
        }

        for (int i = 0, j = inputString.length() - 1; i < inputString.length() && j >= 0; i++, j--) {

            char charForward = Character.toLowerCase(inputString.charAt(i));
            char charRevers = Character.toLowerCase(inputString.charAt(j));

            if (!Character.isAlphabetic(charForward)){
                j++;
                continue;
            }

            if (!Character.isAlphabetic(charRevers)){
                i--;
                continue;
            }

            if (charForward != charRevers){
                return false;
            }

            if (i == j){
                break;
            }
        }

        return true;
    }

    static boolean isLetterOnText(String text){
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {

                return false;
            }
        }
        return true;
    }
}

