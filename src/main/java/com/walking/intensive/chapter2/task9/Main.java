/*�������� �����, � ������� �������� ����������� ����� N, � ����� ���������� ����������� �������.
����� N - ������� ��� ���������� ������ � ������������.
P.S. ����������� ������ ���� �������� �� ������.
 */

package com.walking.intensive.chapter2.task9;

public class Main {
    public static void main(String[] args) {

        drawPascalTriangle(20);
    }

    public static void drawPascalTriangle(int n) {

        StringBuilder maxString = new StringBuilder();
        for (int i = 0; i < n; i++) {

            maxString.append(getFactorial(n - 1) / (getFactorial(i) * getFactorial(n - 1 - i)));
            if (i != n - 1) {
                maxString.append(" ");
            }
        }
        int maxLength = maxString.length();
        System.out.println("Последняя строка " + maxString);
        System.out.println("Длина последней строки " + maxLength);

        for (int i = 0; i < n; i++) {

            StringBuilder triangleLine = new StringBuilder();

            for (int j = 0; j <= i; j++) {

                triangleLine.append(getFactorial(i) / (getFactorial(j) * getFactorial(i - j)));
                if (j != i) {
                    triangleLine.append(" ");
                }
            }

            for (int k = 0; k < (maxLength - triangleLine.length()) / 2; k++) {
                System.out.print(" ");
            }
            System.out.println(triangleLine);
        }
    }

    public static long getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}