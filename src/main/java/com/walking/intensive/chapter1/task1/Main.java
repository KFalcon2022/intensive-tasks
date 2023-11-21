package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String ageString = "Вам ";
        ageString += age;

        if (((age / 10) == 1) || (((age % 100) / 10 == 1) && (age > 100))) {
            ageString += " лет";
        } else {
            switch (age % 10) {
                case 1:
                    ageString += " год";
                    break;
                case 2, 3, 4:
                    ageString += " года";
                    break;
                default:
                    ageString += " лет";
            }
        }

        return ageString;
    }
}