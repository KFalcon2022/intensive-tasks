package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {

        System.out.println(getHappyTicketChance());

    }

    public static double getHappyTicketChance(){

        int count = 0;

        for (int i = 1000; i < 1_000_000; i++){
            if (isTotalEqual(i)){
                count ++;
            }
        }

        return (double) count / 1_000_000;
    }

    public static boolean isTotalEqual(int number){

            return (number / 100000 + number / 10000 % 10 + number / 1000 % 10) == (number / 100 % 10 + number / 10 % 10 + number % 10);
    }
}