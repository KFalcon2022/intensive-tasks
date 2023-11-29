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
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < n; i++) {
            triangle.append(" ".repeat(Math.max(0, (getStringTriangle(n - 1).length() - getStringTriangle(i).length()) / 2 + 1)));

            triangle.append(getStringTriangle(i));
            triangle.append("\n");
        }

        return triangle.toString();
    }

    static String getStringTriangle(int n) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            int num = getNumberTriangle(n, i);
            string.append(num);
            if (i < n) {
                string.append(" ");
            }
        }

        return string.toString();
    }

    static int getNumberTriangle(int l, int num) {
        return (num == 0 || num == l) ? 1 : getNumberTriangle(l - 1, num - 1) + getNumberTriangle(l - 1, num);
    }
}