package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 25;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int ageDiv10, ageDiv100;
        String answer = "Вам " + age + " ";

        ageDiv10 = age % 10;
        ageDiv100 = age % 100;

        if ((ageDiv100 > 11 & ageDiv100 < 20) | ageDiv10 > 4){
            answer = answer + "лет";
        } else if (ageDiv10 == 1) {
            answer = answer + "год";
        }else {
            answer = answer + "года";
        }

        return answer;
    }
}