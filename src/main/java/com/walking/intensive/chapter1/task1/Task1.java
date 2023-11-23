package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 22;

        System.out.println(getAgeString(age));
        if (age > 127) System.out.println("У Вас новый рекорд долгожительства!(или Вы не человек)");
    }

    static String getAgeString(int age) {

        String yourAge = "Вам ";

        if (age < 0) {
            return "Ваше летоисчисление еще не началось!";
        } else if (age % 10 == 0 || age % 100 > 10 && age % 100 < 15 || age % 10 > 4) {
            yourAge = yourAge + age + " лет!";
        } else if (age % 10 > 1) {
            yourAge = yourAge + age + " года!";
        } else {
            yourAge = yourAge + age + " год!";
        }
        return yourAge;
    }
}