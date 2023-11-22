package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int[] ages = new int[128];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
            System.out.println(getAgeString(i));
        }
//        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        String ageWord;

        if (((age + 100) % 100 >= 11 && (age + 100) % 100 <= 19)) {
            ageWord = "лет";
        } else if (((age + 10) % 10) == 1) {
            ageWord = "год";
        } else if ((age + 10) % 10 > 1 && (age + 10) % 10 < 5) {
            ageWord = "года";
        } else ageWord = "лет";

        return ("Вам " + age + " " + ageWord); // Заглушка. При реализации - удалить
    }
}