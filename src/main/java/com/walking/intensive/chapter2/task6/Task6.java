package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNoc(12, 8));
        System.out.println(getNod(56,48));
    }

    static int getNoc(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        int max = Math.max(m, n);
        int min = Math.min(m, n);
            int temp = max;
            while (!(max % min == 0)) {
                max += temp;
            }
            return max;
        }


    static int getNod(int m, int n) {
        int nod = 0;
        m = Math.abs(m);
        n = Math.abs(n);
        int max = Math.max(m,n);
        int min = Math.min(m,n);
        if (max % min == 0){
            return nod = min;
        }
        for (int i = min; i > 0; i--) {
            if (max % i == 0 && min % i ==0){
                return nod = i;
            }
        } return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }

}