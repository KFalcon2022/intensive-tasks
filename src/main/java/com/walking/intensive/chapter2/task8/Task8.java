package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(isLuckyTicket(1));
        System.out.println(getHappyTicketChance(1));
    }

    static double getHappyTicketChance(int ticketNumber) {
        double count = 0;

        for (int i = 0; i <= 999_999; i++) {
            if (isLuckyTicket(i)) {
                count++;
            }
        }

        return count / 1000_000; // делим на общее число вероятных значений, включая 0
    }

    static boolean isLuckyTicket(int ticketNumber) { // дополнительные скобки для читаемости
        int firstPart = (ticketNumber / 100_000) + (ticketNumber / 10_000 % 10) + (ticketNumber / 1000 % 10);
        int secondPart = (ticketNumber / 100 % 10) + (ticketNumber / 10 % 10) + (ticketNumber % 10);

        return firstPart == secondPart;
    }
}