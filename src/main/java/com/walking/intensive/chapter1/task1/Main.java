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
        if (age <= 0 || age > 127) {
            return "Возраст введен некоректно. Проверьте введенное значение.";
        }

        int remainsYears100 = age % 100;
        int remainsYears10 = age % 10;

        if (remainsYears100 > 4 && remainsYears100 < 21) {
            return "Вам " + age + " лет.";
        }
        if (remainsYears10 == 1) {
            return "Вам " + age + " год.";
        }
        if (remainsYears10 > 1 && remainsYears10 < 5) {
            return "Вам " + age + " года.";
        }

        return "Вам " + age + " лет.";
    }
}