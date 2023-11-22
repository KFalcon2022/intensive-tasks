package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 4;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int remainderNum10 = age % 10;
        int remainderNum100 = age % 100;
        if (age < 0 || age > 127) {
            return "Некорректный возраст";
        }
        if ((remainderNum10 == 1 | remainderNum100 == 1) && age != 11 && age != 111) {
            return  "Вам " + age + " год";
        } else if ((remainderNum10 > 1 && remainderNum10 < 5) | (remainderNum100 > 1 && remainderNum100 < 5)
                && (age < 5 | age > 20 && age < 110 | age > 120) ) {
            return "Вам " + age + " года";
        }
        return "Вам " + age + " лет";
    }
}
