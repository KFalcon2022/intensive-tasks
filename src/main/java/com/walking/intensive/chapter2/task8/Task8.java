package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        int totalTickets = 1000000;
        int happyTickets = 0;

        for (int i = 0; i < totalTickets; i++) {
            if (isTicketHappy(i)) {
                happyTickets++;
            }
        }

        return (double) happyTickets / totalTickets;
    }

    static boolean isTicketHappy(int ticketNumber) {
        int firstPart = ticketNumber / 1000;
        int secondPart = ticketNumber % 1000;
        return sumOfDigits(firstPart) == sumOfDigits(secondPart);
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}