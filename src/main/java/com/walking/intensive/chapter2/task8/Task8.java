package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
    }

    static double getHappyTicketChance(int ticketNumber){
        int positiveresults = 0;

        for (int i = 0; i <= 999_999; i++)
        {
            if (isHappyTicket(i)) {
                positiveresults++;
            }
        }
        return positiveresults/1_000_000d;
    }

    static boolean isHappyTicket (int ticketNumber) {
        int leftSum = 0;
        int rightSum = 0;

        for (int divider = 100_000; divider >= 1; divider /= 10) {
            if (divider > 100) {
                leftSum += ticketNumber / divider;
            } else {
                rightSum += ticketNumber / divider;
            }
            ticketNumber = ticketNumber % divider;
        }
        return  (leftSum == rightSum);
    }
}