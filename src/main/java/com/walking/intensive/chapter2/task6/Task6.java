package com.walking.intensive.chapter2.task6;

import java.util.ArrayList;
import java.util.List;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNodByEuclideanAlgorithm(312, 143));
    }

    static int getNoc(int m, int n) {

        checkNums(m, n);

        int largeNum = Math.max(m, n);
        int smallNum = Math.min(m, n);

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

        checkNums(m, n);

        int largeNum = Math.max(m, n);
        int smallNum = Math.min(m, n);

        List<Integer> largeNumMults = getMults(largeNum);
        List<Integer> smallNumMults = getMults(smallNum);
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

        checkNums(m, n);

        int largeNum = Math.max(m, n);
        int smallNum = Math.min(m, n);
        int remainder = largeNum % smallNum;

        if (remainder != 0) {
            largeNum = smallNum;
            smallNum = remainder;

            return getNodByEuclideanAlgorithm(largeNum, smallNum);
        }
        return smallNum;
    }

    private static void checkNums(int m, int n) {
        if (m < 1 || n < 1) {
            throw new IllegalArgumentException("Введенные числа должны быть натуральными");
        }
    }

    private static List<Integer> getMults(int num) {

        List<Integer> mults = new ArrayList<>();
        int multiplier = 2;

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