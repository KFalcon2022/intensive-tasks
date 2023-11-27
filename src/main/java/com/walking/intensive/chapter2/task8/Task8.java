package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("вероятность вытащить счастливый билет: " + getHappyTicketChance(999999) + "%");
    }

    static double getHappyTicketChance(int ticketNumber) {
        int count = 0;
        for (int i = 1000; i <= ticketNumber; i++) {
            int sum1 = i % 10 + i / 10 % 10 + i / 100 % 10;
            int sum2 = i / 1000 % 10 + i / 10000 % 10 + i / 100000 % 10;
            if (sum2 == sum1) {
                count++;
            }
        }

        System.out.println("всего счастливых чисел: " + count);
        return (double) count / ticketNumber * 100;
    }

}



