package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 123;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String printAge;
        if (age > 10 & age < 15) printAge = "Вам " + age + " лет.";
        else if (age%10 > 0 & age%10 < 5 ) printAge = "Вам " + age + " года.";
        else printAge = "Вам " + age + " лет.";
        return printAge;
    }
}