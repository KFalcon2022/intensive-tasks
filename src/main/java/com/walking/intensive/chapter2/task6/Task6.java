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

        List<Integer> multipliersMax = getMultipliers(max);
        List<Integer> multipliersMin = getMultipliers(min);

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

        int nod = 1;
        int max = Math.max(m, n);
        int min = Math.min(m, n);

        List<Integer> multipliersMax = getMultipliers(max);
        List<Integer> multipliersMin = getMultipliers(min);

        for (int i = 0; i < multipliersMin.size(); i++) {
            if (multipliersMax.contains(multipliersMin.get(i))) {
                multipliersMax.remove(Integer.valueOf(multipliersMin.get(i)));
                nod = nod * multipliersMin.get(i);
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

    static List<Integer> getMultipliers (int m) {

        List<Integer> multipliersM = new ArrayList<>();

        while (m > 1) {
            if (m % 2 == 0) {
                multipliersM.add(2);
                m = m / 2;
                System.out.println(2);
            }
            for (int i = 3; i < (m + 1); i += 2)
                while (m % i == 0) {
                    multipliersM.add(i);
                    System.out.println(i);
                    m = m / i;
                }
        }

        return multipliersM;
    }

}