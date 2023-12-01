package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int m = 1184;
        System.out.println(getFriendlyPair(m));
    }

    static int getFriendlyPair(int m) {
        int n = 0;
        if (m > 0 && m < 1_000_000) {
            for (int i = 1; i < m; i++) {
                if (m % i == 0 && n < 1_000_000) {
                    n += i;
                }
            }

            int reverse_m = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    reverse_m += i;
                }
            }

            if (reverse_m == m) {
                return Math.max(n, m);
            }
        }
        return -1;
    }
}