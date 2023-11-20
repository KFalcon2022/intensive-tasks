package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 111;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age <= 0 || age > 127) {
            return "Возраст введен некоректно. Проверьте введенное значение.";
        } else if (age % 100 < 5 || age % 100 > 20) {
            if (age % 10 == 1) {
                return "Вам " + age + " год.";
            } else if (age % 10 > 1 && age % 10 < 5) {
                return "Вам " + age + " года.";
            } else {
                return "Вам " + age + " лет.";
            }
        } else {
            return "Вам " + age + " лет.";
        }

    }
}