package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 100;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        int remainder = age % 100 / 10; //Понял, где тупанул

        if (age < 0 || age > 127) {
            return "Это врядли";
        } else if (remainder == 1) {
            return "Вам " + age + " год";
        } else if (age % 10 == 1){
            return "Вам " + age + " год";
        }
        else if (age % 10 >= 2 && age % 10 < 5) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}