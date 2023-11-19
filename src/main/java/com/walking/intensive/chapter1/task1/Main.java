package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = -2; i < 130; i++) {
            int age = i;
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {

        String years;
        if (age < 0) {
            years = " что неверно. Возраст не может быть отрицательным";
        } else if (age % 100 > 4 && age % 100 < 21 || age == 11) {
            years = " лет";
        } else if (age % 10 == 1) {
            years = " год";
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            years = " года";
        } else
            years = " лет";

        return "Вам " + age + years;
    }
}
