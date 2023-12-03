package com.walking.intensive.chapter2.task6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        getNoc(84, 648);

    }

    static int getNoc(int m, int n) {

        int max = Math.max(m, n);
        int min = Math.min(m, n);
        int noc = min;
        List<Integer> multipliersMax = new ArrayList<>();
        List<Integer> multipliersMin = new ArrayList<>();

        while (max > 1) {
            if (max % 2 == 0) {
                multipliersMax.add(2);
                max = max / 2;
                System.out.println(2);
            }
            for (int i = 3; i < (max + 1); i += 2)
                while (max % i == 0) {
                    multipliersMax.add(i);
                    System.out.println(i);
                    max = max / i;
                }
        }

        while (min > 1) {
            if (min % 2 == 0) {
                multipliersMin.add(2);
                min = min / 2;
                System.out.println(2);
            }
            for (int i = 3; i < (min + 1); i += 2)
                while (min % i == 0) {
                    multipliersMin.add(i);
                    System.out.println(i);
                    min = min / i;
                }
        }

        for (int i = 0;  i < multipliersMax.size(); i++) {
            if (multipliersMin.contains(multipliersMax.get(i))) {
                multipliersMin.remove(Integer.valueOf(multipliersMax.get(i)));
            } else {
                noc = noc * multipliersMax.get(i);
            }
        }

        System.out.println(noc);
        return noc;
    }

    static int getNod(int m, int n) {
        // Ваш код
        return 0;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        // Ваш код
        return 0;
    }

}