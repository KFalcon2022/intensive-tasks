package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("!!111111111111!!!!!!!!!!!!!! Ежу Хуже....!!  111111111111111111111111111111111111111"));
        System.out.println(isPalindrome("!!. вю."));
    }

    static boolean isPalindrome(String inputString) {
        if (inputString.length() < 3) {
            return false;
        }

        int stringLength = inputString.length();
        int rightIndex = stringLength - 1;
        int lettersQuantity = 0;

        for (int i = 0; i < stringLength; i++) {

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
            lettersQuantity++;
        }

        if (lettersQuantity < 3) {
            return false;
        }

        return true;
    }

}

