package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 105;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if ((age > 10 && age < 20) || (age >= 100 && age <= 120)) {
            return ("Вам " + age + " лет");
        } else {
            int lastAgeInt = getLastAgeInt(age);

            if (lastAgeInt > 1 && lastAgeInt < 5) {
                return ("Вам " + age + " года");
            } else if (lastAgeInt == 1 || lastAgeInt == 0 || (lastAgeInt >= 5 && lastAgeInt <= 9)) {
                return ("Вам " + age + " лет");
            } else return ("Вам " + age + " год");
        }
    }

    static int getLastAgeInt(int age) {
        if (age > 100) {
            return (age % 100);
        } else if (age > 10) {
            return (age % 10);
        } else return age;
    }
}