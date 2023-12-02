package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {

        int numberN = 999999;
        System.out.println(getFriendlyNumbs(numberN));
    }

    public static boolean isNotCorrectInput(int n) {

        return n < 0 || n > 999_999;
    }

    public static int getFriendlyNumbs(int numberN) {

        if (isNotCorrectInput(numberN)) {

            return 0;
        }

        return getMinTotalN(numberN);
    }

    public static int getMinTotalN(int numberN) {

        int total;

        for (int i = numberN; i > 0; i--) {

            total = getTotalM(i, numberN);

            if (total <= i && getTotalM(total, i) == i) {

                return total;
            }
        }

        return 0;
    }

    public static int getTotalM(int numberM, int checkNumb) {

        int totalM = 0;

        for (int i = numberM / 2; i > 0; i--) {

            if (numberM % i == 0) {
                totalM += i;

                if (totalM > checkNumb) {
                    return 0;
                }
            }
        }
        if (totalM == numberM) {

            return 0;
        }

        return totalM;
    }
}