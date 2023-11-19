package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public static void main(String[] args) {

        int age = 32;  //Ответ 32 года, все верно.

        System.out.println(getAgeString(age));
        }

static String getAgeString(int age) {

        String result;

        if (age <= 0) {
        result = "Неверный возраст.";
        } else if (age % 10 == 1 && age != 11 && age != 12 && age != 13 && age != 14) {
        result = "Вам " + age + " год.";
        } else if ((age % 10 == 2 || age % 10 == 3 || age % 10 == 4) && (age != 11 && age != 12 && age != 13 && age != 14)) {
        result = "Вам " + age + " года.";
        } else {
        result = "Вам " + age + " лет.";
        }
        return result;
        }
        }