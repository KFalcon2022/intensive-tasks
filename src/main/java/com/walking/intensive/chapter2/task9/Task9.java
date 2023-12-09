package com.walking.intensive.chapter2.task9;

import static java.lang.System.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {

        System.out.println(getPascalTriangle(20));
    }

    static String getPascalTriangle(int n){
        StringBuilder maxLengthStr = new StringBuilder();

        for (int i = n; i >= 0; i--){
            String x = " " + getFactorial(n) / (getFactorial(i) * getFactorial(n - i));
            maxLengthStr.append(x);
        }

        StringBuilder resultTriangle = new StringBuilder();

        for (int i = 0; i <= n; i++){
            resultTriangle.append("\n").append(getStringFactorial(i, maxLengthStr.length()));
        }

        return resultTriangle.toString();
    }

    public static String getStringFactorial(int stringF,int maxStringLength){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= stringF; i++){
            String x = " " + getFactorial(stringF) / (getFactorial(i) * getFactorial(stringF - i));
            result.append(x);
        }

        return getSpace((maxStringLength - result.length()) / 2) + result;
    }

    public static long getFactorial(long f){
        long result = 1;

        for (int i = 1; i <= f; i++) {
            result = result * i;
        }

        return result;
    }

    public static String getSpace(int spaceNumb){
        StringBuilder space = new StringBuilder();

        for (int i = 0; i < spaceNumb; i++){
            space.append(" ");
        }

        return space.toString();
    }
}