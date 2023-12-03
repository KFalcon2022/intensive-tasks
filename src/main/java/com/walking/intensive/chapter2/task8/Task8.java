package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */

public class Task8 {

    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        double maxTicket = 999999;
        double counter = 0;
        for (int i = 0; i <= maxTicket; i++) {
            if (isTicketHappy(i)) {
                counter++;
            }
        }
        return counter / maxTicket;
    }

    static boolean isTicketHappy(int ticketNumber) {
        int firstHalf = ticketNumber / 1000;
        int secondHalf = ticketNumber % 1000;
        return (firstHalf % 10 + (firstHalf % 100) / 10 + (firstHalf % 1000) / 100) == (secondHalf % 10 + (secondHalf % 100) / 10 + (secondHalf % 10000) / 100);
    }
}