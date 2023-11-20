package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 1001;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int lastOneNumber = age % 10;
        int lastTwoNumbers = age % 100;
        if (age < 0 || age > 127) {
            return "Поздравляю, вы вне существующих рамок ждём ваше свидетельство о рождении на почту sobaka@sobaka.ru";
        }
        if (age == 0) {
            return "Вам " + age + " лет";
        }
        if (lastTwoNumbers > 9 & lastTwoNumbers < 20) {
            return "Вам " + age + " лет";
        }
        if (lastOneNumber > 1 & lastOneNumber < 5) {
            return "Вам " + age + " годa";
        }
        if (lastOneNumber == 1) {
            return "Вам " + age + " год";
        } else {
            return "Вам " + age + " лет";
        }
    }
}
