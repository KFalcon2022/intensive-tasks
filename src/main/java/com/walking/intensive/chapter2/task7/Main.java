package com.walking.intensive.chapter2.task7;


public class Main {
    public static void main(String[] args) {
        System.out.println(getMaxSumTwoPairs(450));
    }

    public static int getMaxSumTwoPairs(int n) {
        int maxOfAll = 0;
        int maxSumOfPair = 0;
        for (int firstOfPair = n; firstOfPair >= 0; firstOfPair--) {

            int secondOfPair = getSumDividers(firstOfPair);

            if (getSumDividers(secondOfPair) == firstOfPair) {
                int sumOfPair = firstOfPair + secondOfPair;

                if (secondOfPair < n && sumOfPair > maxSumOfPair) {
                    maxSumOfPair = sumOfPair;
                    maxOfAll = Math.max(firstOfPair, secondOfPair);
                }
            }
        }
        return maxOfAll;
    }

    public static int getSumDividers(int x) {
        int sum = 0;
        for (int i = 1; i < x / 2; i++) {
            if ((x % i) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}