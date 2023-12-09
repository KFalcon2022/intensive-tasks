package com.walking.intensive.chapter2.task10;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("!!!85P4ip5487"));
    }

    static boolean isPalindrome(String inputString) {

        int i = 0, j = inputString.length() - 1; //i - указатель, который бежит от начала к середине, j - от конца к середине
        String lowCaseString = inputString.toLowerCase();

        while (i < j) {
            char chI = lowCaseString.charAt(i);

            while (!Character.isLetter(chI) && i < j) {//двигаем указатель, пока не дойдем до буквы
                i++;
                chI = lowCaseString.charAt(i);
            }

            char chJ = lowCaseString.charAt(j);

            while (!Character.isLetter(chJ) && i < j) {
                j--;
                chJ = lowCaseString.charAt(j);
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