package com.walking.intensive.chapter2.task7;

public class Main {
    static final int N = 1000000;

    public static void main(String[] args) {
        System.out.println(getFriends(99999));
    }

    static int getFriends(int n) {
        if (n >= N) {
            return 0;
        }
        int bSum, aSum, b;
        for (int a = n; a > 0; --a) {
            aSum = getSum(a);
            b = aSum;

            if (aSum >= N || a == b) {
                continue;
            }

            bSum = getSum(b);

            if (a == bSum) {
                return Math.max(a, b);
            }
        }
        return 0;
    }

    static int getSum(int x) {
        // уменьшить количество итераций
        int cut = x % 2 == 0 ? x / 2 : x / 3;
        int sum = 0;

        for (int i = cut; i > 0; --i) {
            if (x % i == 0) {
                sum += i;
            }
            if (sum >= N) {
                break;
            }
        }

        return sum;
    }
}