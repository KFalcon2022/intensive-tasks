package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance(120000));
    }

    static double getHappyTicketChance(int ticketNumber){
        int numberLuckyTickets = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 0; i < 999999; i++) {
            a = i / 100000;
            b = i % 100000 / 10000;
            c = i % 10000 / 1000;
            d = i % 1000 / 100;
            e = i % 100 / 10;
            f = i % 10;
            if (a+d+c == d+e+f) {
                numberLuckyTickets++;
            }
        }
        return numberLuckyTickets != 0 ? (double) numberLuckyTickets / 999999 : 0;
    }
}