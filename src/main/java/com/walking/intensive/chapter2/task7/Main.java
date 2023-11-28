package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {
        int max = 1000000;

        System.out.println("Ќаибольшее число из пары дружественных чисел, сумма которых максимальна среди всех пар дружественных чисел, большее из которых меньше " + max + ": " + findAmicableNumbers(max));
    }
    static int findAmicableNumbers(int max) {
        int first, second = 0, firstSum = 0, secondSum = 0, firstAmicable = 0, secondAmicable = 0;
        for (first = 0; first < max; first++) { // ѕока потенциальные дружественные числа не превыс€т заданный порог
            for (int i = 1; i * i < first; i++) {
                if (first % i == 0) { // »щем делители первого числа
                    if (i == 1 || i == first / i) {
                        firstSum += i; // —умма делителей первого числа
                    } else {
                        firstSum += i + first / i;
                    }
                }
            }
            for (int i = 1; i * i < firstSum; i++) {
                if (firstSum % i == 0) { //»щем делители второго числа
                    if (i == 1 || i == firstSum / i) {
                        secondSum += i;
                    } else {
                        secondSum += i + firstSum / i;
                    }
                }
                if (first == secondSum) { //—равниваем, равн€етс€ ли первое число сумме делителей второго
                    second = firstSum; //≈сли да, то присваиваем второму числу значение суммы первого числа
                }
            }
            if (first == secondSum && second == firstSum && first + second > firstAmicable + secondAmicable && second < max) { // ѕровер€ем, равн€етс€ ли первое число сумме делителей второго числа, а второе число равн€етс€ ли сумме делителей первого числа
                firstAmicable = first; // ≈сли да, обновл€ем рекордсменов
                secondAmicable = second;
                System.out.println(firstAmicable + " " + secondAmicable); // Ёто дл€ проверки
            }
            firstSum = 0;
            secondSum = 0;
        }
        return Math.max(firstAmicable, secondAmicable);
    }
}