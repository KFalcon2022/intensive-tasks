package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(20));
    }

    /**
     * Формула нахождения чисел пирамиды паскаля: C (n,k) = (n-k+1)/k, n и k - биномиальные коэффициенты,
     * переменная Cnk - и подразумевает эти вычисления, нахождения значений по коэффицентам
     */
    static String getPascalTriangle(int numberOfLines) {
        int CnK = 1;
        String lastStringInTriangle = 1 + " ";

        for (int k = 1; k < numberOfLines - 1; k++) {
            CnK *= ((numberOfLines - 1) - k + 1);
            CnK /= k;
            lastStringInTriangle += CnK + " ";
        }
        lastStringInTriangle += 1;

        String fullTriangleResult = "";
        for (int n = 0; n < numberOfLines; n++) {
            String currentLine = "";
            CnK = 1;
            currentLine += CnK + " ";
            for (int k = 1; k <= n; k++) {
                CnK *= (n - k + 1);
                CnK /= k;
                currentLine += CnK + " ";
            }

            fullTriangleResult += (" ".repeat(lastStringInTriangle.length() - currentLine.length() / 2) + currentLine) + "\n";

        }
        return fullTriangleResult;
    }
}