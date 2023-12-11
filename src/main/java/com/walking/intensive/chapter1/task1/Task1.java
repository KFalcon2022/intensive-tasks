package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(-5));
    }

    static String getAgeString(int age) {

        if ((age % 10 == 0) || ((age > 4) && (age < 21)) || ((age > 104) && (age < 121))) {
            return ("Вам " + age + " лет");
        } else if (age % 10 == 1) {
            return ("Вам " + age + " год");
        } else if ((age % 10 > 1) & (age % 10 < 5)) {
            return ("Вам " + age + " года");
        } else if (age % 10 > 4) {
            return ("Вам " + age + " лет");
        }
        return ("указано некорректное значение возраста");
    }
}