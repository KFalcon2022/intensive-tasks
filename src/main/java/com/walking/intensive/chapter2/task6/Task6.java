package com.walking.intensive.chapter2.task6;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 16;

        System.out.println("НОД = " + getNod(number1, number2) +
                ", НОК = " + getNoc(number1, number2)+
                " НОД посредством алгоритма Евклида = " + getNodByEuclideanAlgorithm(number1, number2));
    }

    static int getNoc(int m, int n) {
        //НОК - такое маленькое число, которое делится без остатка на число a и число b.
        int foundNoc = 0;

        LinkedList<Integer> mKratinie = new LinkedList<>();
        LinkedList<Integer> nKratinie = new LinkedList<>();

        int ceiling = Math.max(m, n);

        for (int i = 1; i <= m; i++) {
            mKratinie.add(i * m);
        }
        for (int i = 1; i <= n; i++) {
            nKratinie.add(i * n);
        }

        mKratinie.retainAll(nKratinie); //удаляем из списка mKratinie все элементы, которые не содержатся в nКратные, retain - сохранить

        return Collections.min(mKratinie);
    }

    static int getNod(int m, int n) {
        int ceiling = Math.min(m, n);
        int foundNod = 0;

        for (int i = 1; i <= ceiling; i++) {
            if (m % i == 0 && n % i == 0) {
                foundNod = i;
            }
        }

        return foundNod;
    }

    /*        Алгоритм Евклида для поиска НОД:
            1. Большее число делим на меньшее.
            2. Если делится без остатка, то меньшее число и есть НОД (выход).
            3. Если есть остаток, то большее число заменяем на остаток от деления.
            4. Переходим к пункту 1.

            Пример:
            Найти НОД для 30 и 18.
            30 / 18 = 1 (остаток 12)
            18 / 12 = 1 (остаток 6)
            12 / 6 = 2 (остаток 0)
            Конец: НОД – это делитель 6.
            НОД (30, 18) = 6
    */
    static int getNodByEuclideanAlgorithm(int m, int n) {
        int ceiling = Math.max(m, n);
        int floor = Math.min(m, n);
        int ostatok = ceiling % floor;

        if (ostatok == 0) {
            return floor;
        } else {
            ceiling = ostatok;
        }

        return getNodByEuclideanAlgorithm(floor, ceiling); //рекурсия
    }

}