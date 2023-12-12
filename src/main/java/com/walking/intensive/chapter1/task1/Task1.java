package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(112));
    }

    static String getAgeString(int age) {

        if ((age < 0) || (age > 127)) {
            return ("указано некорректное значение возраста");
        }
        if ((age != 11) && (age % 100 != 11) && (age % 10 == 1)) {
            return ("Вам " + age + " год");
        }
        if (((age > 1) & (age < 5)) || (((age % 10 > 1) & (age % 10 < 5)) & (age > 20) & !((age > 111) & (age < 121)))){
            return ("Вам " + age + " года");
        }
        return ("Вам " + age + " лет");
    }
}