package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int m = 999999;
        System.out.println(getFriendlyPair(m));
    }

    static int getFriendlyPair(int m) {

        int m1 = 0;
        int m2 = 0;

        if (m > 0 && m < 1000000) {

            for (int i = 220; i <= m; i++) {
                int count1 = 0;
                int count2 = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        count1 += j;  //284
                    }
                }

                for (int k = 1; k < count1; k++) {
                    if (count1 % k == 0) {
                        count2 += k;  //220
                    }
                }

                if (count1 + count2 <= m && i == count2) {
                    m1 = count1;
                    m2 = count2;
                }
            }
        }
        return Math.max(m1, m2);
    }
}

