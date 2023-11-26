package com.walking.intensive.chapter2.task6;

/*КУРСОВАЯ ЗАДАЧА - НОК и НОД

Напишите два метода. Первый метод возвращает НОК двух чисел. Второй метод возвращает НОД двух чисел.
P.S. По желанию: Если знакомы с рекурсией напишите алгоритм Евклида поиска НОД.

 */
public class Task6 {
    public static void main(String[] args) {

        int a = 27;
        int b = 168;

        System.out.printf("Наименьшее общее кратное для %d и %d: %d", a, b, findLeastCommonMultiple(a, b));
        System.out.println();
        System.out.printf("Наибольший общий делитель для %d и %d: %d", a, b, findGreatestCommonDivisor(a, b));
        System.out.println();
        System.out.printf("Наибольший общий делитель для %d и %d рекурсивно: %d", a, b, useEuclideanAlgorithm(a, b));

    }

    public static int findLeastCommonMultiple(int a, int b) {

        int result = 0;
        int i = 2;

        while (result == 0) {
            if (i % a == 0 && i % b == 0) {
                result = i;
            } else {
                i++;
            }
        }
        return result;
    }
    public static int findGreatestCommonDivisor(int a, int b) {

        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int useEuclideanAlgorithm(int a, int b) {

        if (a==0 || b == 0){
            return a+b;
        }
        if (a>b){
            a = a%b;
        }
        else {
            b=b%a;
        }
        return useEuclideanAlgorithm(a,b);
    }
}