package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {-12, 9},
                {0, -8},
                {111, 85},
                {-12, -4},
                {54, 54},
                {72, 96},
                {0, 6},
                {0, 0},
                {15, 1}
        };
        for (int i = 0; i < matrix.length; i++) {
            int a = matrix[i][0];
            int b = matrix[i][1];
            System.out.printf("НОД (%s, %s) = %s ", a, b, getNodByEuclideanAlgorithm(a, b));
            System.out.printf("НОД Евклид (%s, %s) = %s ", a, b, getNod(a, b));
            System.out.printf("НОК (%s, %s) = %s\n", a, b, getNoc(a, b));
        }
    }

    static int getNoc(int m, int n) {
        int noc = 0;

        try {
            if (m == 0 || n == 0) {
                throw new Exception();
            }
            noc = m * n / getNodByEuclideanAlgorithm(m, n);
        } catch (Exception e) {
            System.out.print("Не имеет решения! ");
//            e.printStackTrace();
        }

        return noc;
    }

    static int getNod(int m, int n) {
        if (n == 0) {
            return Math.abs(m);
        }
        return Math.abs(getNod(n, m % n));
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        int gcd = 1;

        if (m == 0 && n == 0) {
            return 0;
        } else if (m == 0) {
            return Math.abs(n);
        } else if (n == 0) {
            return Math.abs(m);
        } else {
            m = Math.abs(m);
            n = Math.abs(n);

            for (int i = 2; i < Math.min(m, n); i++) {
                while (m % i == 0 && n % i == 0) {
                    gcd *= i;
                    m /= i;
                    n /= i;
                }
            }
        }

        return gcd;
    }
}