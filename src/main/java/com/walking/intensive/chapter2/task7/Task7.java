package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int m = 80000;
        System.out.println(getFriendlyPair(m));
    }

    static int getFriendlyPair(int m) {

        int friendlyPairDigit1 = 0;
        int friendlyPairDigit2 = 0;

        if (m > 0 && m < 1_000_000) {

            for (int i = 0; i <= m; i++) {

                int count1 = 0;
                int count2 = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        count1 += j;
                    }
                }

                for (int j = 1; j < count1; j++) {
                    if (count1 % j == 0) {
                        count2 += j;
                    }
                }

                if (count1 <= m  && i == count2 && i != count1) {
                    friendlyPairDigit1 = count1;
                    friendlyPairDigit2 = count2;
                }
            }
        }
        return Math.max(friendlyPairDigit1, friendlyPairDigit2);
    }
}

