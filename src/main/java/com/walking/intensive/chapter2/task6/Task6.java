package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        System.out.println(getNod(25,15));
    }

    static int getNoc(int m, int n) {
        // Ваш код
        return 0;
    }

    static int getNod(int m, int n) {

            while (m != n) {
                if (m > n) {
                    m = m - n;
                } else {
                    n = n - m;
                }
            }
            return m;
        }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }

}