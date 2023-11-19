package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = -4;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age > 0) {
            if (age == 1) {
                return "Вам 1 год";
            } else if (age >= 2 & age < 5) {
                return "Вам " + age + " года";
            }
        } else if (age < 0) {
            return "Количество лет не может быть отрицательным, проверьте ваши данные";
        }
        return "Вам " + age + " лет";
    }
}