package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        double countLuckyTicket = 0.0;
        int maxNumber = 999_999;

        for (int i = 0; i <= maxNumber; i++) {
            if (isLucky(i)) {
                countLuckyTicket++;
            }
        }

        return countLuckyTicket / maxNumber;
    }

    static boolean isLucky(int number) {
        String string = String.valueOf(number);

        while (string.length() % 6 != 0) {
            string = "0" + string;
        }

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < string.length() / 2; i++) {
            num1 = num1 + Integer.parseInt(String.valueOf(string.charAt(i)));
        }

        for (int i = string.length() / 2; i < string.length(); i++) {
            num2 = num2 + Integer.parseInt(String.valueOf(string.charAt(i)));
        }

        return num1 == num2;
    }
}