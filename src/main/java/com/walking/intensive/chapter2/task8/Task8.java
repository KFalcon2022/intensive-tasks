package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("вероятность вытащить счастливый билет: " + getHappyTicketChance(999999));
    }

    static double getHappyTicketChance(int ticketNumber) {
        int countHappyTicket = 1; // счётчик на 1, так как 000_000 тоже считается
        for (int i = 1000; i <= ticketNumber; i++) {
            int sumRightValue = i % 10 + i / 10 % 10 + i / 100 % 10;
            int sumLeftValue = i / 1000 % 10 + i / 10000 % 10 + i / 100000 % 10;
            if (sumRightValue == sumLeftValue) {
                countHappyTicket++;
            }
        }

        System.out.println("всего счастливых чисел: " + countHappyTicket);
        return (double) countHappyTicket / (ticketNumber +1);
    }

}



