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
        String triangle = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (getStringTriangle(n).length() - getStringTriangle(i).length()) / 2; j++) {
                triangle += " ";
            }

            triangle += getStringTriangle(i) + "\n";
        }

        return triangle;
    }

    static String getStringTriangle(int n) {
        String string = "";

        for (int i = 0; i <= n; i++) {
            int num = getNumberTriangle(n, i);

            if (i < n) {
                string += num + " ";
            } else {
                string += num;
            }
        }

        return string;
    }

    static int getNumberTriangle(int l, int num) {
        return (num == 0 || num == l) ? 1 : getNumberTriangle(l - 1, num - 1) + getNumberTriangle(l - 1, num);
    }
}