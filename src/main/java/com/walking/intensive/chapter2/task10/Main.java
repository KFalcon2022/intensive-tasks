package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("!!!8545487"));
    }

    static boolean isPalindrome(String inputString) {

        int i = 0, j = inputString.length() - 1; //i - указатель, который бежит от начала к середине, j - от конца к середине

        while (i < j) {
            char chI = inputString.charAt(i);

            while (!Character.isLetter(chI) && i < j) {//двигаем указатель, пока не дойдем до буквы
                i++;
                chI = inputString.charAt(i);
            }

            char chJ = inputString.charAt(j);

            while (!Character.isLetter(chJ) && i < j) {
                j--;
                chJ = inputString.charAt(j);
            }

            //System.out.println("Compare: " + chI + " and " + chJ);
            if (chI != chJ || !Character.isLetter(chI)) {
                //System.out.println("not palindrome");
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}