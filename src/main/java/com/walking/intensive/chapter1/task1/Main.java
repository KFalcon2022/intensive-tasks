package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 124;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0) {
            return "Неверное значение возраста";
        }

        short year = (short) (age % 10);
        short century = (short) (age % 100);

        String yearStr;
        if (century == 11 || century == 12 || century == 13 || century == 14) {
            yearStr = "лет";
        } else if (year == 1) {
            yearStr = "год";
        } else  if (year == 2 || year == 3 || year == 4) {
            yearStr = "года";
        } else {
            yearStr = "лет";
        }

        return "Вам "+ age + " " + yearStr;
    }
}