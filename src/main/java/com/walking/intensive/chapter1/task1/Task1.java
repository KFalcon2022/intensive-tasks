package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        String declension = "Вам " + age;
        int mod = age % 10;

        if (age >= 0 && age < 150) {

            if (age == 0 || (age >= 5 && age <= 20) || (age >= 105 && age <= 120)) {
                declension = declension + " лет";
            } else if (mod == 1) {
                declension = declension + " год";
            } else if (mod >= 2 && mod <= 4) {
                declension = declension + " годa";
            } else {
                declension = declension + " лет";
            }
        } else {
            declension = "Указан некорректный возраст!";
        }

        return declension; // Заглушка. При реализации - удалить
    }
}