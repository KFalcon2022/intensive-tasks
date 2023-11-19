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

        int temporaryAgeCondition = 0;

        if (age <= 4 || age > 20 && age <= 104 || age > 120) {
            temporaryAgeCondition = age % 10;
        }

        String firstOutputPart = "Вам " + age;
        String result = firstOutputPart + " лет";


        if (temporaryAgeCondition == 1) {
            result = firstOutputPart + " год";
        } else if (temporaryAgeCondition != 0 && temporaryAgeCondition <= 4) {
            result = firstOutputPart + " года";
        }

        return result;
    }
}