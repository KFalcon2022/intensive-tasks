package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        double countLuckyTicket = 0.0;
        int maxNumber = 1_000_000;

        for (int i = 0; i < maxNumber; i++) {
            if (isLucky(i)) {
                countLuckyTicket++;
            }
        }

        return countLuckyTicket / maxNumber;
    }

    static boolean isLucky(int number) {
        int a, b, c, d, e, f;

        a = number / 100000;
        b = (number / 10000) % 10;
        c = (number / 1000) % 10;
        d = (number / 100) % 10;
        e = (number / 10) % 10;
        f = number % 10;

        return a + b + c == d + f + e;
    }
}