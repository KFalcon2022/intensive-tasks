package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {

        System.out.println(getPascalTriangle(20));
//        System.out.println(getStringFactorial(13));
//        System.out.println(getFactorial(11));

    }

    static String getPascalTriangle(int n){
       String f = "";

        for (int i = 0; i <= n; i++){
            f = f + "\n" + getStringFactorial(i);

        }

        return f;
    }

    public static long getFactorial(long f){

        long result = 1;

        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static String getStringFactorial(int stringF){

        StringBuilder result = new StringBuilder(getFactorial(stringF) / (getFactorial(0) * getFactorial(stringF)) + "");

        for (int i = 1; i <= stringF; i++){
            String x = " " + getFactorial(stringF) / (getFactorial(i) * getFactorial(stringF - i));
            result.append(x);
        }

        return result.toString();
    }

    public static String getSpace(int spaceNumb){

        String space = "";

        for (int i = 0; i < spaceNumb; i++){
            space = space + " ";
        }

        return space;
    }
}