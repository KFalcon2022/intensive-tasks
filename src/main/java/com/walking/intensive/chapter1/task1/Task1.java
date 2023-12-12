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

        int moduloRemainder10 = age % 10;
        int moduloRemainder100 = age % 100;

        if (age < 0 || age > 127) {
            return "Указан некорректный возраст!";
        }

        if (moduloRemainder10 == 0 || (moduloRemainder100 >= 11 && moduloRemainder100 <= 19) || (moduloRemainder10 >= 5 && moduloRemainder10 <= 9))
        {
            return "Вам " + age + " лет";
        }

        if (moduloRemainder10 >= 2 && moduloRemainder10 <= 4) {
            return "Вам " + age + " годa";
        }

        if (moduloRemainder10 == 1) {
            return "Вам " + age + " год";
        }

        return null; // Заглушка. При реализации - удалить
    }
}
