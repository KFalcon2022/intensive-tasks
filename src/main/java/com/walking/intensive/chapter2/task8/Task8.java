package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        double sumHappyTickets = 0;
        for (int i = 0; i < 1_000_000; i++) {
            int ticketDigit_1 = i / 100000 % 10;
            int ticketDigit_2 = i / 10000 % 10;
            int ticketDigit_3 = i / 1000 % 10;
            int ticketDigit_4 = i / 100 % 10;
            int ticketDigit_5 = i / 10 % 10;
            int ticketDigit_6 = i % 10;
            int sumLeft = ticketDigit_1 + ticketDigit_2 + ticketDigit_3;
            int sumRight = ticketDigit_4 + ticketDigit_5 + ticketDigit_6;

            if (sumLeft == sumRight) {
                sumHappyTickets += 1;
            }
        }
        return sumHappyTickets / 1_000_000;
    }
}