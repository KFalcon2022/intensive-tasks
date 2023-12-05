package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        int totalNumberInTicket = 6;
        System.out.println(getHappyTicketChance(totalNumberInTicket));
    }

    static double getHappyTicketChance(int totalNumberInTicket) {
        int allResult = (int) Math.pow(10, totalNumberInTicket);
        int goodResult = getSumGoodResult(totalNumberInTicket);

        return (double) goodResult / allResult;
    }

    static int getSumGoodResult(int totalNumberInTicket) {
        if (totalNumberInTicket % 2 != 0 || totalNumberInTicket <= 0) {
            return 0;
        }

        int halfNumberInTicket = totalNumberInTicket / 2;
        int maxSumNumbers = 9 * halfNumberInTicket;
        int countGoodResult = 0;

        for (int i = 0; i <= maxSumNumbers; i++) {
            countGoodResult += countTicketsEqualSumNumbers(i, halfNumberInTicket);
        }

        return countGoodResult;
    }

    static int countTicketsEqualSumNumbers(int sumNumbers, int halfNumberInTicket) {
        int capacityHalfTicket = (int) Math.pow(10, halfNumberInTicket);
        int maxNumberHalfTicket = capacityHalfTicket - 1;
        int goodResult = 0;

        for (int i = 0; i <= maxNumberHalfTicket; i++) {
            int sumNumbersTicket = i % 10;

            for (int j = 10; j <= capacityHalfTicket; j *= 10) {
                sumNumbersTicket += i / j % 10;
            }

            if (sumNumbersTicket == sumNumbers) {
                goodResult++;
            }
        }

        return goodResult * goodResult;
    }
}