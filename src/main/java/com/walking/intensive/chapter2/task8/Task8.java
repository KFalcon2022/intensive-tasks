package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {

    static final int TICKETS_QUANTITY = 1000000;

    public static void main(String[] args) {
        double result = getHappyTicketChance();
        System.out.println(result);
    }

    static double getHappyTicketChance() {
        int countHappy = 1; // билет 000000

        for (int i = 1000; i < TICKETS_QUANTITY; ++i) {
            if (getSumNumbers(getFirstPart(i)) == getSumNumbers(getSecondPart(i))) {
                ++countHappy;
            }
        }

        return (double) countHappy / TICKETS_QUANTITY;
    }

    static int getFirstPart(int number) {
        return number / 1000;
    }

    static int getSecondPart(int number) {
        return number % 1000;
    }

    static int getSumNumbers(int number) {
        int sum = 0;
        for (int i = number % 10; number != 0; i = number % 10) {
            sum += i;
            number /= 10;
        }
        return sum;
    }
}