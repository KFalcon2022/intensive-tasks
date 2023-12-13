package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("!!! ."));
    }

    static boolean isPalindrome(String inputString) {
        int leftShift = 0, rightShift = 0;
        boolean result = false;

        for (int i = 0; i < inputString.length(); i++) {
            while (!Character.isAlphabetic(inputString.charAt(leftShift + i))) {
                leftShift++;
                if ((leftShift + i) == inputString.length()) {
                    break;
                }
            }
            while (!Character.isAlphabetic(inputString.charAt(inputString.length() - (rightShift + i + 1)))) {
                rightShift++;
                if (inputString.length() == (rightShift + i + 1)) {
                    break;
                }
            }
            int leftPosition = leftShift + i;
            int rightPosition = inputString.length() - (rightShift + i + 1);

            if (leftPosition >= rightPosition) {
                break;
            }

            if (Character.toUpperCase(inputString.charAt(leftPosition)) != Character.toUpperCase(inputString.charAt(rightPosition))) {
                result = false;
                break;
            } else {
                result = true;
            }
        }

        return result;
    }
}