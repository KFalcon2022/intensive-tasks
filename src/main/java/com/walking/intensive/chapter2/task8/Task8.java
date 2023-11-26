package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(oddsLuckyTicketForSixDigits());
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

        System.out.println(getHappyTicketChance(999_999));
    }

    static double getHappyTicketChance(int ticketNumber){
        if (ticketNumber < 0 || ticketNumber > 999_999) {
            return -1.0;
        }

        int count = 0;
        for (int i = 0; i <= ticketNumber; i++) {
            if (isLuckyTicket(i)) {
                count += 1;
            }
        }

        return count / (ticketNumber + 1.0);
    }

    static double oddsLuckyTicketForSixDigits() {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            if (isLuckyTicket(i)) {
                count += 1;
            }
        }

        return count / (999999 + 1.0);
    }

    static boolean isLuckyTicket(int number) {
        int num1 = number / 100_000;
        int num2 = (number / 10_000) % 10;
        int num3 = (number / 1000) % 10;
        int num4 = (number / 100) % 10;
        int num5 = (number / 10) % 10;
        int num6 = number % 10;

        return (num1 + num2 + num3) == (num4 + num5 + num6);
    }
}
