package com.walking.intensive.chapter2.task9;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк в треугольнике: ");
        int heightTriangle = scanner.nextInt();
        scanner.close();

        System.out.println(getPascalTriangle(heightTriangle));
    }
    static String getPascalTriangle(int n) {
        String line = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                line += "    ";
            }
            for (int j = 0; j <= i; j++) {
                int result = 1;
                if (i > 1) {
                    result = (int) (getFactorial(i) / (getFactorial(j) * getFactorial(i - j)));
                }
                if (j < i) {
                    line += result + "       ";
                } else {
                    line += result;
                }
            }
            line += "\n";
        }
        return line;
    }
    static long getFactorial(int number) {
        long factorial = 1;
        if (number == 0) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}