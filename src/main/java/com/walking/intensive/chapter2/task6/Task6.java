package main.java.com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNoc(-5, 10));
        System.out.println(getNod(-10, 10));
    }

    static int getNoc(int m, int n) {
        if (!isNumsValid(m, n)) {
            return 0;
        }
        int nok = 1;
        int i = 1;

        while (i < Math.pow(m, 2) || i < Math.pow(n, 2)) {
            if (i % m == 0 && i % n == 0) {
                nok = i;
                return nok;
            }
            i++;
        }
        return nok;
    }

    static int getNod(int m, int n) {
        if (!isNumsValid(m, n)) {
            return 0;
        }

        int nod = 0;
        int i = 1;

        while (m >= i || n >= i) {
            if (m % i == 0 && n % i == 0) {
                if (i > nod) {
                    nod = i;
                }
            }
            i++;
        }
        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        // не знаком с рекурсией пока что
        return 0;
    }

    public static boolean isNumsValid(int a, int b) {
        if (a > 0 && b > 0) {
            return true;
        }
        System.out.println("Некорректное значение");
        return false;
    }
}