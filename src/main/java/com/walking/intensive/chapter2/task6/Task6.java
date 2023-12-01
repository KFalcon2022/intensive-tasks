package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;

        System.out.println("Наименьшее общее кратное чисел " + a + " и " + b + " = " + getNoc(a, b));
        System.out.println("Наибольший общий делитель чисел " + a + " и " + b + " = " + getNod(a, b));
    }

    static int getNoc(int m, int n) {
        if (m == n) {
            return 1;
        }

        int noc;
        int index = 1;

        while (true) {
            if (index % m == 0 && index % n == 0) {
                noc = index;

                break;
            }

            index++;
        }

        return noc;
    }

    static int getNod(int m, int n) {
        if (m == n) {
            return m;
        }

        int numberOne = m;
        int numberTwo = n;
        while (numberOne != numberTwo) {
            if (numberOne < numberTwo) {
                numberTwo = numberTwo - numberOne;
            } else {
                numberOne = numberOne - numberTwo;
            }
        }

        return numberOne;
    }
}