package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    static final int totalDigits = 6;
    static final int halfDigits = totalDigits / 2;

    public static void main(String[] args) {

        System.out.println(getHappyTicketChance());

    }

    static double getHappyTicketChance() {

        int luckyTickets = 0;
        int maxValueTicketNumber = (int) Math.pow(10, totalDigits);
        int halfValueTiketNumber = (int) Math.pow(10, halfDigits);


        for (int i = 0; i < maxValueTicketNumber; i++) {

            int sumFirstHalf = sumOfDigitCalc(i);
            int sumSecondHalf = sumOfDigitCalc(i / halfValueTiketNumber);

            if (sumFirstHalf == sumSecondHalf) {
                luckyTickets++;
            }
        }

        return (double) luckyTickets / maxValueTicketNumber;
    }

    private static int sumOfDigitCalc(int tiketIteration) {

        int sum = 0;

        for (int i = 0; i < halfDigits; i++) {
            sum += tiketIteration % 10;
            tiketIteration /= 10;
        }

        return sum;
    }

}
