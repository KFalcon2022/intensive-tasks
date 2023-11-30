package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        //Всего существует 55252 варианта билета, поэтому средняя вероятность его выпадения равна 0,055252 (5,5252%).
        System.out.println(getHappyTicketChance(999999));
    }

    static double getHappyTicketChance(int ticketNumber){
        // Ваш код
        //Всего комбинаций от 0 - i
        int combinations = ticketNumber + 1;
        int luckyCount = 0;
        for (int i = 0; i < ticketNumber + 1; i++) {
            if (isHappy(i)) {
                luckyCount++;
            }
        }
        return (double) luckyCount /combinations;
    }
    static boolean isHappy(int i) {

        int digit1;
        int digit2;
        int digit3;

        int digit4;
        int digit5;
        int digit6;

        digit1 = i / 100000;
        digit2 = (i - digit1 * 100000) / 10000;
        digit3 = (i - digit1 * 100000 - digit2 * 10000) / 1000;

        digit4 = (i - digit1 * 100000 - digit2 * 10000 - digit3 * 1000) / 100;
        digit5 = (i - digit1 * 100000 - digit2 * 10000 - digit3 * 1000 - digit4 * 100) / 10;
        digit6 = i - digit1 * 100000 - digit2 * 10000 - digit3 * 1000 - digit4 * 100 - digit5 * 10;
        return digit1 + digit2 + digit3 == digit4 + digit5 + digit6;
    }
}