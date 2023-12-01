package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(getFriendlyPair(1000000));
        System.out.println((System.currentTimeMillis() - start) + " ms");
    }

    static int getFriendlyPair(int m) {
        int maxFriendly = 0;
//        int minFriendly = 0;
        int maxFriendlySum = 0;

        for (int testA = m - 1; testA > 1; testA--) {
            int testB = getDivisorsSum(testA);
            if (testB < m && testB != testA) {
                int divisorsSumB = getDivisorsSum(testB);
                if (testA == divisorsSumB && maxFriendlySum < (testA + testB) ) {
                    maxFriendlySum = testA + testB;
                    maxFriendly = testA;
//                    minFriendly = testB;
                }
            }
        }

//        System.out.printf("Friendly pair: %d, %d\n", maxFriendly, minFriendly);
        return maxFriendly;
    }

    public static int getDivisorsSum(int a) {
        int divisorsSum = 1;
        int i = 2;

        while (i * i < a) {
            if (a % i == 0) {
                divisorsSum += i;
                if (i != (a / i)) {
                    divisorsSum += a / i;
                }
            }
            i++;
        }

        return divisorsSum;
    }
}