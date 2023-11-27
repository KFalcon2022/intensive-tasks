package com.walking.intensive.chapter2.task10;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-palindrome.html">������</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String palindrome1 = "� ���� ����� �� ���� �����";
        System.out.println(isPalindrome(palindrome1));

        String palindrome2 = "����! ������ ����� �����, �� ���������� �� �����.";
        System.out.println(isPalindrome(palindrome2));

        String palindrome3 = "� - ���� ����";
        System.out.println(isPalindrome(palindrome3));

        System.out.println(isPalindrome("��� �� ���������!"));
    }

    static boolean isPalindrome(String inputString) {
        StringBuilder stringOne = new StringBuilder(inputString.toLowerCase());
        StringBuilder stringTwo = new StringBuilder(inputString.toLowerCase());

        stringOne = cleanString(stringOne);
        stringTwo = cleanString(stringTwo);
        stringTwo.reverse();

        return stringOne.compareTo(stringTwo) == 0;
    }

    static StringBuilder cleanString(StringBuilder string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                result.append(string.charAt(i));
            }
        }
        return result;
    }
}