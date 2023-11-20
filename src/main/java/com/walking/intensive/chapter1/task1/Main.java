package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        //int age = 0;
        for (int i = 0; i < 128; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static private String getYearsByAge(int age) {
        if (age == 0) return "лет";
        int modBy100 = age % 100;
        int modBy10 = age % 10;
        if (modBy100 > 10 && modBy100 < 20)
            return "лет"; // диапазоны от 10-20, 110-120 и т.д, для пропуска следующей проверки
        if (modBy10 > 1 && modBy10 < 5) return "года"; // окончание 2-4 например 22, 53, 3, 104 и т.д.
        if (modBy10 == 1) return "год"; // окончание 1, 51, 101 и т.д.
        return "лет"; // все остальные случаи, например 58, 5, 96, 109 и т.д.
    }

    static String getAgeString(int age) {
//     Место для вашего кода
        return "Вам " + age + " " + getYearsByAge(age);
    }
}