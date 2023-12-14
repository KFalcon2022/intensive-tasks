package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 3;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";
        if (ageLastNumber == 1)
            old = " год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = " лет";
        else if (ageLastNumber >= 2 && ageLastNumber <= 4)
            old = " года";
        if (exclusion)
            old = " лет";
        return ("Вам "+ age + old);
    }
}





