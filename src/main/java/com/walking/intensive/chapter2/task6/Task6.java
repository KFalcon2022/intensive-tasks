package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNodByEuclideanAlgorithm(16, 24));
    }

    static int getNoc(int m, int n) {
        return Math.abs(m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {
        int result;
        int multTwoGlobal = 0;
        while (m != n && m != 0 && n != 0) {
            boolean mIsEven = (m & 1) == 0;
            boolean nIsEven = (n & 1) == 0;
            if (mIsEven && nIsEven) {
                m >>= 1;
                n >>= 1;
                multTwoGlobal++;
            } else if (mIsEven && !nIsEven) {
                m >>= 1;
            } else if (nIsEven) {
                n >>= 1;
            } else if (m > n) {
                m = (m - n) >> 1;
            } else {
                n = (n - m) >> 1;
            }
        }
        if (m != 0 && n != 0) {
            result = m;
        } else if (m == 0 && n != 0) {
            result = n;
        } else if (n == 0 && m != 0) {
            result = m;
        } else {
            result = -1;
        }
        result = multTwoGlobal > 0 ? result << multTwoGlobal : result;

        return result;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (m == n) {
            return n;
        } else if (m == 0 && n != 0) {
            return n;
        } else if (n == 0 && m != 0) {
            return m;
        }

        boolean mIsEven = (m & 1) == 0;
        boolean nIsEven = (n & 1) == 0;
        if (mIsEven && nIsEven) {
            return getNodByEuclideanAlgorithm(m >> 1, n >> 1) << 1;
        } else if (mIsEven && !nIsEven) {
            return getNodByEuclideanAlgorithm(m >> 1, n);
        } else if (nIsEven) {
            return getNodByEuclideanAlgorithm(m, n >> 1);
        } else if (m > n) {
            return getNodByEuclideanAlgorithm((m - n) >> 1, n);
        } else {
            return getNodByEuclideanAlgorithm(m, (n - m) >> 1);
        }
    }

}