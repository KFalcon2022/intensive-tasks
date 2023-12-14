package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Ежу хуже"));
    }

    static boolean isPalindrome(String inputString) {
        if (inputString.length() < 3) {
            return false;
        }

        int stringLength = inputString.length();
        int rightIndex = stringLength - 1;

        for (int i = 0; i < stringLength/2; i++) {

            if (!Character.isLetter(inputString.charAt(i))) {
                continue;
            }

            while (true) {
                if (!Character.isLetter(inputString.charAt(rightIndex))) {
                    rightIndex--;
                    continue;
                }

                if (Character.toLowerCase(inputString.charAt(i)) != Character.toLowerCase(inputString.charAt(rightIndex))) {
                    return false;
                }
                break;
            }

            rightIndex--;
        }

        return true;
    }

}

