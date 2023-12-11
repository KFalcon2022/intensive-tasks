package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;
        
        printAge(age);
    }

    static void printAge(int age) {
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        String declension = "Вам " + age;
        String resultString = null;
        int moduloDivision10 = age % 10;
        int moduloDivision100 = age % 100;

        if (age < 0 || age > 150) {
            return "Указан некорректный возраст!";
        }

        if (moduloDivision10 == 0 || (moduloDivision100 >= 5 && moduloDivision100 <= 20) || (moduloDivision10 >= 5 && moduloDivision10 <= 10)) {
            resultString = declension + " лет";
        } else if (moduloDivision10 >= 2 && moduloDivision10 <= 4) {
            resultString = declension + " годa";
        } else if (moduloDivision10 == 1) {
            resultString = declension + " год";
        }

        return resultString; // Заглушка. При реализации - удалить
    }
}
