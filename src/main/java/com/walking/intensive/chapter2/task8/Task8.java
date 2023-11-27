package com.walking.intensive.chapter2.task8;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(getProbability());

    }
    public static double getProbability (){

        int countLucky = 0;
        int totalTicets = 0;

        for (int i = 999999; i>=0; i--){
            int firstGroupNumber=i/1000;
            int secondGroupNumber=i%1000;
            int sumFirstGroupNumber = 0;
            int sumSecondGroupNumber = 0;

            while (firstGroupNumber > 0 || secondGroupNumber > 0) {
                sumFirstGroupNumber += firstGroupNumber % 10;
                firstGroupNumber /= 10;
                sumSecondGroupNumber += secondGroupNumber % 10;
                secondGroupNumber /= 10;

            }

            if (sumFirstGroupNumber == sumSecondGroupNumber){
                countLucky++;
            }
            totalTicets++;

        }
        return (double) countLucky / totalTicets;
    }
}