/*Напишите метод, который проверяет, является ли строка палиндромом.
Метод должен игнорировать пунктуацию, пробелы и регистр.
 */
package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {

        String string1 = "A? roza! upala- na; LaPu: Azora)";
        String string2 = "a ZORA upala na lapu azora";

        System.out.println(isPalindrome(string1)); //true
        System.out.println(isPalindrome(string2)); //false
    }

    public static String prepareString(String string) {

        return string.replaceAll("\\p{Punct}|\\s", "").toLowerCase();
    }

    public static boolean isPalindrome(String string) {

        string = prepareString(string);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}