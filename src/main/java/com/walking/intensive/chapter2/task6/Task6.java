package com.walking.intensive.chapter2.task6;

import java.util.ArrayList;
import java.util.List;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNod(150, 225));
    }

    static int getNoc(int m, int n) {

        if (m < 1 || n < 1) {
            throw new IllegalArgumentException("Введенные числа должны быть натуральными");
        }

        int largeNum = n;
        int smallNum = m;

        if (m > n) {
            largeNum = m;
            smallNum = n;
        }

        List<Integer> largeNumMults = getMults(largeNum);
        List<Integer> smallNumMults = getMults(smallNum);

        for (Integer smallNumMult : smallNumMults) {
            if (!largeNumMults.contains(smallNumMult)) {
                largeNumMults.add(smallNumMult);
            }
        }

        int result = 1;
        for (Integer mults : largeNumMults) {
            result *= mults;
        }
        return result;
    }

    static int getNod(int m, int n) {

        if (m < 1 || n < 1) {
            throw new IllegalArgumentException("Введенные числа должны быть натуральными");
        }
        int largeNum = n;
        int smallNum = m;

        if (m > n) {
            largeNum = m;
            smallNum = n;
        }

        List<Integer> largeNumMults = getMults(largeNum); // 1 2 2 5 7 41
        List<Integer> smallNumMults = getMults(smallNum); // 2 2  3 7
        int result = 1;


        for (Integer smallNumMult : smallNumMults) {
            for (int j = 0; j < largeNumMults.size(); j++) {

                if (smallNumMult.equals(largeNumMults.get(j))) {
                    result *= smallNumMult;
                    largeNumMults.remove(j);
                    break;
                }
            }
        }
        return result;
    }


    static int getNodByEuclideanAlgorithm(int m, int n) {
        // Ваш код
        return 0;
    }

    private static List<Integer> getMults(int num) {

        int multiplier = 2;
        List<Integer> mults = new ArrayList<>();

        do {
            if (num % multiplier == 0) {
                mults.add(multiplier);
                num /= multiplier;
                continue;
            }

            multiplier++;
        } while (num != 1);

        return mults;
    }
}