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
        int i = 0;
        int sumEvents = 0;

        while (i < 1000000) {

            int firstNumber;
            int sumFirst = 0;
            int secondNumber = i % 1000;
            int sumSecond = (int) secondNumber / 100 + secondNumber % 10 + (int) (secondNumber % 100) / 10;

            if (i >= 1000) {
                firstNumber = (int) i / 1000;
                sumFirst = (int) firstNumber / 100 + firstNumber % 10 + (int) (firstNumber % 100) / 10;
            }

            if (sumFirst == sumSecond) {
                sumEvents++;
            }

            i++;
        }

        return sumEvents / 999999.0;
    }

}