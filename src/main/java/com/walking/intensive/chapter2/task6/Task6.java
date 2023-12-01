package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 120;
        int n = 40;

        System.out.println(getNoc(m, n));
        System.out.print(getNod(m, n));
    }

    static int getNoc(int m, int n) {
        return n * m / getNod(m, n);
    }

    static int getNod(int m, int n) {
        if (Math.max(m, n) % Math.min(m, n) == 0) {
            return Math.min(m, n);
        }
        int nod = 1;
        for (int i = (Math.min(m, n)) / 2; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }
}

/*
    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }
*/
