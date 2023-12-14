package com.walking.intensive.chapter2.task8;

import javax.sound.midi.Soundbank;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        int sumHappyTickets = 0;

        for (int i = 0; i < 1000000; i++) {
            int firstSum = 0;
            int secondSum = sumDigitsInThreeDigitNumber(i % 1000);

            if (i >= 1000) {
                firstSum = sumDigitsInThreeDigitNumber(i / 1000);
            }

            if (firstSum == secondSum) {
                sumHappyTickets++;
            }

        }

        return sumHappyTickets / 1000000.0;
    }

    static int sumDigitsInThreeDigitNumber (int number) {
        return number / 100 + number % 10 + (number % 100) / 10;
    }

}