package com.walking.intensive.chapter2.task8;

import java.awt.*;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

    }

    static double getHappyTicketChance(int ticketNumber) {
        double happyTicketAmount = 0;
        for (int i = 0; i < 1000000; i++) {
            int firstDigit = i % 10;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i / 100 % 10;
            int fourthDigit = i / 1000 % 10;
            int fifthDigit = i / 10000 % 10;
            int sixthDigit = i / 100000 % 10;
            if (firstDigit + secondDigit + thirdDigit == fourthDigit + fifthDigit + sixthDigit) {
                happyTicketAmount++; // Количество счастливых билетов
            }
        }
        return happyTicketAmount / 1000000; // Вероятность выпадения счастливого билетика
    }
}