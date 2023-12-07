package com.walking.intensive.chapter2.task6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        getNoc(88, 648);
        getNod(88, 648);

    }

    static int getNoc(int m, int n) {

        int max = Math.max(m, n);
        int min = Math.min(m, n);
        int noc = max * min;

        for (int i = max * min;  i > max; i--) {
            if ((i % max == 0) && (i % min == 0))  {
                noc = i;
            }
        }

        System.out.println(noc);
        return noc;
    }

    static int getNod(int m, int n) {

        int nod = 1;
        int max = Math.max(m, n);
        int min = Math.min(m, n);

        for (int i = 1;  i < (min + 1); i++) {
            if ((max % i == 0) && (min % i == 0))  {
                nod = i;
            }
        }

        System.out.println(nod);
        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

        int nod = 1;
        int max = Math.max(m, n);
        int min = Math.min(m, n);

        if (max % min == 0) {
            return nod = min;
        }

        return getNodByEuclideanAlgorithm((max % min), min);

    }

}