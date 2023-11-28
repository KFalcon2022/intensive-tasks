package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String str = "Муза! Ранясь шилом опыта, ты помолишься на разум.";

        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String inputString){
        // \\pP - регулярное выражение, благодаря которому можно удалить всю пунктуацию
        String resultString = inputString.toLowerCase().replaceAll(" ", "").replaceAll("\\pP", "");

        int length = resultString.length();
        for (int i = 0; i < length / 2; i++) {      // Не стал использовать метод reverse() класса StringBuilder :D
            if(resultString.charAt(i) != resultString.charAt(length - i - 1))
                return false;
        }

        return true;
    }
}