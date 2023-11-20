package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age =102;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if ((age >= 10 && age <= 20) || (age >= 110 && age <= 120)) {
            return ("Вам " + age + " лет");
        }
        else if (age == 1) return ("Вам " + age + " год");
        else {
            int lastAgeInt = getLastAgeInt(age);

            if (lastAgeInt > 1 && lastAgeInt < 5) {
                return ("Вам " + age + " года");
            } else if (lastAgeInt == 0 || (lastAgeInt >= 5 && lastAgeInt <= 9)) {
                return ("Вам " + age + " лет");
            } else return ("Вам " + age + " год");
        }
    }

    static int getLastAgeInt(int age) {
        if (age > 100) {
            return (age % 100 % 10);
        } else if (age > 10) {
            return (age % 10);
        } else return age;
    }
}