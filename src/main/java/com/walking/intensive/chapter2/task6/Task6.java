package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {

        System.out.println(getMaxCommonDivisor(0, 20));
        System.out.println(getMinCommonMultiple(24, 20));

    }
    public static int getMaxCommonDivisor(int x, int y) {

        if (x == 0 || y == 0){
            return 0;
        }

        if (x == y) {
            return x;
        }

        int divisor = x - y;

        if (divisor < 0) {
            // x меньше y, значит наименьшие числа  x и -divisor
            return getMaxCommonDivisor(x, -1 * divisor);
        } else {
            return getMaxCommonDivisor(y, divisor);
        }
    }

    public static int getMinCommonMultiple(int x, int y) {

        int maxDivisor = getMaxCommonDivisor(x, y);

        if (maxDivisor == 0) {
            return 0;
        }

        return x * y / maxDivisor;
    }
}