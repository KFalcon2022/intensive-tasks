package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {
        int numberN = 17296;
        int numberM = 18416;
        System.out.println(friendlyNumbs(numberN, numberM));

    }

    public static boolean isNotCorrectInput(int n, int m){

       return n == m || ((n < 0 || n > 999_999) || (m < 0 || m > 999_999));
    }

    public static boolean isFriendlyNumbs(int n, int totalN, int m, int totalM){

        return n == totalM & m == totalN;
    }

    public static int friendlyNumbs(int numberN, int numberM) {

        if (isNotCorrectInput(numberN , numberM)){

            return 0;
        }

        int totalN = getTotalN(numberN);
        int totalM = getTotalM(numberM);
        int total = 0;

        if (isFriendlyNumbs(numberN, totalN, numberM, totalM)){

            total = Math.min(totalN, totalM);
        }

        return total;
    }

    public static int getTotalN(int numberN){

        int totalN = 0;

        for (int i = numberN / 2; i > 0 ; i--){

            if (numberN % i == 0) {
                totalN += i;
            }
        }

        return totalN;
    }

    public static int getTotalM(int numberM) {

        int totalM = 0;

        for (int i = numberM / 2; i > 0; i--) {

            if (numberM % i == 0) {
                totalM += i;

                if (totalM > 999_999) {

                    return 0;
                }
            }
        }

        return totalM;
    }


}