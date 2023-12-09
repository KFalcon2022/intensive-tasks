package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {

        System.out.println(getFriendlyPair(10000));

    }

    static int getFriendlyPair(int n) {

        for (int i = n; i > 0; i--) {
            int friendN = getDivisorSum(i);
            int friendDivisorSum = getDivisorSum(friendN);

            if (friendDivisorSum == i && i != friendN) {
                return i;
            }
        }

        return 0;
    }

    static int getDivisorSum(int n) {

        int sum = 0;

        for (int i = 1; i < n / 2 + 1; i++) { //нет смысла искать делитель в диапазне от n/2 и выше
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}