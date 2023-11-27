package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {

    }

    static String getAgeString(int age) {
        int lastNumberFromAge = age % 10;
        if (lastNumberFromAge == 1 & age != 11 & age != 111) {
            return ("Вам " + age + " " + "год");
        } else {
            if (lastNumberFromAge == 2 || lastNumberFromAge == 3 || lastNumberFromAge == 4) {
                if (age != 12 & age != 112 & age != 13 & age != 113 & age != 14 & age != 114) {
                    return ("Вам " + age + " " + "года");
                }
            }
            return ("Вам " + age + " " + "лет");
        }
    }
}
