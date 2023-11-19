package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 *
 * КУРСОВАЯ ЗАДАЧА - ВОЗРАСТ
 *
 * Рекорд долгожительства на данный момент составляет 127 лет.
 *
 * Напишите программу, которая будет печатать: "Вам n лет".
 * Программа должна корректно отрабатывать правила русского языка.
 * Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
//        int age = 0;
//
//        System.out.println(getAgeString(age));


        for(int i = 0; i <= 127; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        String youStr = "Вам ";
        String years = " лет.";
        String yearsAnother = " года.";
        String singleYear = " год.";

        if(age < 0) {
            return "Ты еще не родилися.";
        } else if(age > 127) {
            return "Поздравляю! Ты новый долгожитель!";
        } else if(age == 0) {
            return "Поздравляю! Ты родился.";
        } else if(age == 1) {
            return youStr + age + singleYear;
        } else if(age < 5 ) {
            return youStr + age + yearsAnother;
        } else if(age <= 20 || (age % 10 >= 5 || age % 10 == 0)) {
            return youStr + age + years;
        } else if (age % 10 == 1) {
            return youStr + age + singleYear;
        }

        return youStr + age + yearsAnother;
    }
}