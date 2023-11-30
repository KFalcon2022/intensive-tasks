package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {
        int max = 1000000;

        System.out.println("Ќаибольшее число из пары дружественных чисел, сумма которых максимальна среди всех пар дружественных чисел, большее из которых меньше " + max + ": " + findAmicableNumbers(max));
    }

    static int findAmicableNumbers(int max) {
        int first, second = 0, firstSum, secondSum, firstAmicable = 0, secondAmicable = 0;

        for (first = 0; first < max; first++) { // ѕока потенциальные дружественные числа не превыс€т заданный порог
            firstSum = getDividerSum(first);
            secondSum = getDividerSum(firstSum);

            if (first == secondSum) { //—равниваем, равн€етс€ ли первое число сумме делителей второго
                second = firstSum; //≈сли да, то присваиваем второму числу значение суммы первого числа
            }

            if (first == secondSum && second == firstSum && first + second > firstAmicable + secondAmicable && second < max && first != second) { // ѕровер€ем, равн€етс€ ли первое число сумме делителей второго числа, а второе число равн€етс€ ли сумме делителей первого числа
                firstAmicable = first; // ≈сли да, обновл€ем рекордсменов
                secondAmicable = second;
                 //System.out.println(firstAmicable + " " + secondAmicable); // Ёто дл€ проверки
            }
        }

        return Math.max(firstAmicable, secondAmicable);
    }

    static int getDividerSum(int limit) {
        int dividerSum = 0;

        for (int i = 1; i * i < limit; i++) {
            if (limit % i == 0) { // »щем делители первого числа
                if (i == 1 || i == limit / i) {
                    dividerSum += i; // —умма делителей первого числа
                } else {
                    dividerSum += i + limit / i;
                }
            }
        }
        return dividerSum;
    }
}