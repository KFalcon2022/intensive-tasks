package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static boolean isPalindrome(String inputString){
        String str = inputString.replaceAll("[^A-Za-zА-Яа-я]", "").toLowerCase();
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        String reversedStr = stringBuffer.toString();

        return str.equals(reversedStr);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
    }
}
