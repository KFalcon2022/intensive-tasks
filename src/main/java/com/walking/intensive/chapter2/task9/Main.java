package com.walking.intensive.chapter2.task9;

public class Main {
    public static void main(String[] args) {
        getPaskalArray(10);
        drawTriangle(20);


    }

    static long[][] getPaskalArray(int N) {
        long[][] array = new long[N][N];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (paskalCell(i, j) != 0) {
                    array[i][j] = paskalCell(i, j);
                }
            }
        }
        return array;
    }

    static long paskalCell(int i, int j) {
        if (i == 0 && j == 1) {
            return 0;
        }
        return getFactorial(i) / (getFactorial(j) * getFactorial(i - j));
    }

    public static long getFactorial(int f) {
        long result = 1;
        for (long i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    static void drawTriangle(int N) {
        long[][] array = getPaskalArray(N);
        StringBuilder sb = new StringBuilder();
        int length[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    sb.append(" ");
                    sb.append(array[i][j]);
                    sb.append(" ");
                }
            }
            length[i] = sb.length();
            sb.delete(0, sb.length());
        }


        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < (((length[N - 1] - length[i]) / 2)+N); k++) {
                sb.append(" ");
            }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    sb.append(" ");
                    sb.append(array[i][j]);
                    sb.append(" ");
                }

            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}