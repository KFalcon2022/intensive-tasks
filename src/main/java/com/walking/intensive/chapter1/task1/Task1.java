package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age;

        for (age = -2; age < 130; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {
        int ageModHundred = age % 100;
        int ageModTen = ageModHundred % 10;

        if(age < 0 || age > 127){
            return "Данные введены некорректно";
        }

        if (ageModTen == 1 && ageModHundred != 11) {
            return "Вам " + age + " год";
        }

        if (ageModTen > 1 && ageModTen < 5 && (ageModHundred < 12 || ageModHundred > 14)) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}