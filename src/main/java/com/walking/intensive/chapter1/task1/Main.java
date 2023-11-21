package com.walking.intensive.chapter1.task1;

import java.io.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Ведите ваш возраст: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String youAge = reader.readLine();
        int nAge = Integer.parseInt(youAge);

        System.out.println("Вам " + youAge + " " + getAgeString(nAge));

    }

    static String getAgeString(int number) {
        int ageLastNumber = number % 10;
        boolean isExclusion = (number % 100 >= 11) && (number % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if (ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (isExclusion)
            old = "лет";

        return old;
    }
}