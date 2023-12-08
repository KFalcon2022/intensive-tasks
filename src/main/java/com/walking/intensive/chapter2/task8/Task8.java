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

            String ticketNumber = String.format("%06d", i);

            int firstNumber = Integer.parseInt(ticketNumber.substring(0, 1)) + Integer.parseInt(ticketNumber.substring(1, 2)) + Integer.parseInt(ticketNumber.substring(2, 3));
            int secondNumber = Integer.parseInt(ticketNumber.substring(3, 4)) + Integer.parseInt(ticketNumber.substring(4, 5)) + Integer.parseInt(ticketNumber.substring(5, 6));

            if (firstNumber == secondNumber) {
                sumEvents++;
            }

            i++;
        }

        return sumEvents / 999999.0;
    }

}