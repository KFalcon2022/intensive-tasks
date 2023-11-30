package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        int ticketNumber = 999999;

        if (ticketNumber < 1 || ticketNumber > 999999) {
            System.out.println("Некорректный номер.");
            return;
        }

        System.out.println("Вероятность счастливого билета: " + getHappyTicketChance(ticketNumber));
    }

    static double getHappyTicketChance(int ticketNumber) {

        if (ticketNumber < 1000) {
            return 0;
        }

        int sumHappyTickets = 0;

        for (int i = 1001; i <= ticketNumber; i++) {

            int i1 = i / 100000 % 10,
                    i2 = i / 10000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;

            if (i1 + i2 + i3 == i4 + i5 + i6) {
                sumHappyTickets++;
            }
        }
        return (double) sumHappyTickets / ticketNumber;
    }
}