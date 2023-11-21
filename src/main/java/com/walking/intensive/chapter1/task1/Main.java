package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if ((age % 10 == 1) && (age % 100 != 11))
            return "Вам " + age + " год";

        else if ((age % 10 == 2) && (age % 100 != 12))
            return "Вам " + age + " года";

        else if ((age % 10 == 3) && (age % 100 != 13))
            return "Вам " + age + " года";

        else if ((age % 10 == 4) && (age % 100 != 14))
            return "Вам " + age + " года";

        else
            return "Вам " + age + " лет";
    }
}
