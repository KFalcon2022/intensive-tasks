/*Напишите метод, в который вводится натуральное число N, а метод возвращает треугольник Паскаля.
Число N - степень или количество этажей в треугольнике.
P.S. Треугольник должен быть выровнен по центру.
 */

package com.walking.intensive.chapter2.task9;

public class Main {
    public static void main(String[] args) {

        drawPascalTriangle(10);
    }
    public static void drawPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {


            StringBuilder string = new StringBuilder();

            for (int j = 0; j <= i; j++) {

                string.append(getFactorial(i) / (getFactorial(j) * getFactorial(i - j)));
                if (j != i){
                    string.append("       ");
                }
            }
            for (int j=0;j<(n-i)+1; j++){
                System.out.print("    ");
            }

            System.out.println(string);
        }
    }

    public static long getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}