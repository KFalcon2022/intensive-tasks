package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {
        int max = 1000000;

        System.out.println("Наибольшее число из пары дружественных чисел, но меньше ,чем " + max + ": " + findAmicableNumbers(max));
    }

    static int findAmicableNumbers(int max) {
        int first = 2, second = 0, firstSum = 0, secondSum = 0, firstAmicable, secondAmicable;
        for (; first < max; first++) { // Увеличиваем первое число до максимально заданного
            for (int i = 0; i < first; i++) {
                if (first % i == 0) { // Ищем делители первого числа
                    firstSum += i; // Складываем делители первого числа
                }
            }
            for (int i = 0; i < firstSum; i++){
                if (firstSum % i == 0) { //Ищем делители второго числа
                    secondSum += i; // Складываем делители второго числа
                }
            }
            if (first == secondSum && second == firstSum){
                firstAmicable = first;
                secondAmicable = second;
            }
        }


        return Math.max(firstAmicable, secondAmicable);
    }
}