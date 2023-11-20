package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 31;

        System.out.println("Вам " + age + getAgeString(age));
    }

    static String getAgeString(int age) {
        String resultString;

        if (age > 127 || age < 0) {
            return "Давай не будем обманывать, сладкий пирожочек, напиши сколько тебе лет на самом деле.";
        }

        if (age % 10 == 1 && age % 100 != 11) {
            resultString = " год.";
        }

        else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
            resultString = " года.";
        }

        else {
            resultString = " лет.";
        }
        return resultString;
    }

}
