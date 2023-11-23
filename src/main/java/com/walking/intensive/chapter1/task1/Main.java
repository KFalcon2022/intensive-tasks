package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 0;
/*        Для собственных проверок можете делать любые изменения в этом методе
        int[] ages = new int[128];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
            System.out.println(getAgeString(i));
        }

 */
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода.
        if ((age % 10) == 1  && (age % 100 != 11)) {
            return ("Вам " + age + " " + "год");
        } else if (age % 10 > 1 && age % 10 < 5 && !(age % 100 >= 11 && age % 100 <=19)) {
            return ("Вам " + age + " " + "года");
        } else return ("Вам " + age + " " + "лет");
    }
}


