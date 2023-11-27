package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance(0));
    }

    static double getHappyTicketChance(int ticketNumber){
        //максмальное значение суммы трех цифр: 27
        //посчитаем вероятность выпадения каждого числа
        int[] frequency = new int[28];

        for (int i = 0; i < 1000; i++) {
            int sum = i % 10 + (i / 10) % 10 + (i / 100);
            frequency[sum]++;
        }
        //посчитаем вероятность того, что одновременно в правой и левой частях выпадет одинаковая сумма
        double Probability = 0; // итоговая вероятность счастливого билета
        double amount = 1000; //количество вариантов

        for (int curFrequency : frequency) {
            Probability += Math.pow((double) curFrequency / amount, 2);
        }

        return Probability;
    }
}