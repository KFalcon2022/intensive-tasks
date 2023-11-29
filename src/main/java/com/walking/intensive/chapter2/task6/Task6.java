package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {

public static void main(String[] args) {
    int n = 25;
    int m = 15;
    System.out.println("НОК чисел " + n + " и " + m + " равен " + getNoc(n, m));
    System.out.println("НОД чисел " + n + " и " + m + " равен " + getNod(n, m));
}
    //    тод для нахождения НОД двух чисел
    public static int getNod(int n, int m) {
        if (m == 0) {
            return n;
        }
        return getNod(m, n % m);
    }

    // Метод для нахождения НОК двух чисел
    public static int getNoc(int n, int m) {
        int gcd = getNod(n, m);
        return (n * m) / gcd;
    }


}
