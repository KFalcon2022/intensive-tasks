package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Вероятность поесть: " + getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        String ticket;
        int sum = 0;
        final int ticketsNumber = 999999;

        for (int i = 1001; i < ticketsNumber; i++) {
            ticket = String.valueOf(i);

            int len = ticket.length();

            if (len < 6) {
                String zeroes = "00";
                ticket = zeroes.substring(0, 6 - len) + ticket;
            }

            if (happy(ticket)) {
                sum++;
            }
        }

        return (double) sum / ticketsNumber;
    }

    static boolean happy(String ticket) {
        char[] ticketCharArray = ticket.toCharArray();
        return (ticketCharArray[0] + ticketCharArray[1] + ticketCharArray[2]) == (ticketCharArray[3] + ticketCharArray[4] + ticketCharArray[5]);
    }
}