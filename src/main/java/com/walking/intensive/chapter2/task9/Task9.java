package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        getPascalTriangle(40);
    }

    static void getPascalTriangle(int m) {
        int widthMax = getPascalLine(m - 1).length();

        for (int n = 0; n < m; n++) {
            String line = getPascalLine(n);
            int width = line.length();
            for (int i = 0; i < (widthMax - width) / 2; i++) {
                System.out.print(" ");
            }
            System.out.println(line);
        }
    }

    static String getPascalLine(int n){
        long current, previous = 0;
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k <= n; k++) {
            if (k == 0) {
                current = 1;
            } else {
                current = previous * (n + 1 - k) / k;
            }
            sb.append(current).append(" ");
            previous = current;
        }

        return sb.toString();
    }
}