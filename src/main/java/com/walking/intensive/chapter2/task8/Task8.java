package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        int a, b, c, d, e, f;
        int count = 0;
        final int limit = 999999;

        for (int i = 0; i <= limit; i++) {
            a = i / 100000;
            b = (i / 10000) % 10;
            c = (i / 1000) % 10;
            d = (i / 100) % 10;
            e = (i / 10) % 10;
            f = i % 10;

            if (a + b + c == d + e + f) {
                count++;
            }
        }
        System.out.println(count);
        return ((double) count) / limit;
    }
}