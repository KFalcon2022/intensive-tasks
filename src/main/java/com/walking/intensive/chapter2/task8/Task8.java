package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        System.out.printf("\nThe odds to get a happy ticket are %.2f",getHappyTicketChance(999_999));
    }

    static double getHappyTicketChance(int ticketNumber) {

        int happyTicketAmount = 0;

        for (int i = 0; i <= ticketNumber; i++) {

            if (isHappyTicket(i)) {

                happyTicketAmount++;
            }
        }

        return (double) happyTicketAmount / 1_000_000;
    }

    static boolean isHappyTicket(int ticketNumber) {

        int firstDigit = ticketNumber / 100_000;
        int secondDigit = (ticketNumber % 100_000) / 10_000;
        int thirdDigit = (ticketNumber % 10_000) / 1_000;
        int fourthDigit = (ticketNumber % 1_000) / 100;
        int fifthDigit = (ticketNumber % 100) / 10;
        int sixthDigit = (ticketNumber % 10);

        return firstDigit + secondDigit + thirdDigit == fourthDigit + fifthDigit + sixthDigit;
    }
}