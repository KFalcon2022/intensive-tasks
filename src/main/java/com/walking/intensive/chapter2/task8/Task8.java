package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    static final int TOTAL_DIGITS = 6;
    static final int HALF_TOTAL = TOTAL_DIGITS / 2;

    public static void main(String[] args) {

        System.out.println(getHappyTicketChance());

    }

    static double getHappyTicketChance() {

        int luckyTickets = 0;
        int maxValueTicketNumber = (int) Math.pow(10, TOTAL_DIGITS);
        int halfValueTicketNumber = (int) Math.pow(10, HALF_TOTAL);

        for (int i = 0; i < maxValueTicketNumber; i++) {

            int sumFirstHalf = calcSumDigits(i% halfValueTicketNumber);
            int sumSecondHalf = calcSumDigits(i / halfValueTicketNumber);

            if (sumFirstHalf == sumSecondHalf) {
                luckyTickets++;
            }
        }

        return (double) luckyTickets / maxValueTicketNumber;
    }

    private static int calcSumDigits(int ticketIteration) {

        int sum = 0;
//        for (int i = 0; i < HALF_TOTAL; i++) {
//            sum += ticketIteration % 10;
//            ticketIteration /= 10;
//        }

        while (ticketIteration > 0) {
            sum += ticketIteration % 10;
            ticketIteration /= 10;
        }

        return sum;
    }

}
