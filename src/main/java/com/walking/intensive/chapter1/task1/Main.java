package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
//        int age = 0;

        for (int i = -15; i < 225; i++)
        {
            System.out.println(getAgeString(i));
        }

//        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        if (age < 0) return "Некорректно введен возраст";

        int remainder = age % 10;
        String result;

        if (((age % 100) > 10 && (age % 100) < 20) || (remainder == 0 || remainder > 4))
            result = " лет";
        else if (remainder == 1) result = " год";
        else result = " года";

        return "Вам " + age + result; // Заглушка. При реализации - удалить
    }
}