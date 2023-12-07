package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
    }

    static boolean isPalindrome(String inputString) {
        String is = inputString;
        // Ваш код
        int i = 0;
        int j = is.length() - 1;
        is = is.toUpperCase();

        while (i < j) {
            if (is.charAt(i) == is.charAt(j)) {
                i++;
                j--;
            } else {
                if (isSpaceOrPunctuation(is.charAt(i))) {
                    i++;
                    continue;
                }
                if (isSpaceOrPunctuation(is.charAt(j))) {
                    j--;
                    continue;
                }
//                System.out.println(i + "i- " + is.charAt(i) + " " + j + "j - " + is.charAt(j));
                return false;
            }
        }
        return true;
    }

    //Знаю, что есть способ проверки на знак пунктуации - это сравнить с другим регистром, но не нашел как сделать
    // это в java. Если подскажите - буду благодарен.
    static boolean isSpaceOrPunctuation (char c) {
        if (c == '.' || c == '!' || c == ' ' || c == ',' ) {
            return true;
        }
        return false;
    }
}
