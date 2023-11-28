package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        final int maxNumber = 999999;

        System.out.println(getHappyTicketChance(maxNumber));
    }

    static double getHappyTicketChance(int ticketNumber) {
        int amountAllEvents = ticketNumber + 1; // Кол-во всех событий, полагая, что нулевой билет - тоже билет. В нашем случае - это 1 млн.
        int amountLuckyEvents = 0;  // Кол-во хороших событий

        int tmp = ticketNumber; // Временная переменная для определения разрядности числа
        int numbersCount = 0;

        do { // В случае, если будут не 6 цифр, а 4, 8, 12 и т.д.
            numbersCount++;
            tmp /= 10;
        } while (tmp != 0);

        for (int i = 0; i <= ticketNumber; i++) {
            if (isLuckyNumber(i, numbersCount))
                amountLuckyEvents++;
        }

        return ((double) amountLuckyEvents) /  amountAllEvents;
    }

    static boolean isLuckyNumber(int num, int numbersCount) {   // В метод передаю число и его разрядность (кол-во цифр в числе)
        int firstSum = 0;
        int secondSum = 0; // Первая сумма считает первые три числа, вторая сумма - сумму вторых три числа.
        int firstNum = num / ((int) Math.pow(10, (numbersCount / 2)));    // Если число 123456, то firstNum = 123, secondNum = 456
        int secondNum = num % ((int) Math.pow(10, (numbersCount / 2)));

        for (int i = 0; i < numbersCount / 2; i++) { //
            firstSum += firstNum % 10;
            secondSum += secondNum % 10;

            firstNum /= 10;
            secondNum /= 10;
        }

        return firstSum == secondSum;
    }
}