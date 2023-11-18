package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i=1;i<3000;i++)
            System.out.println("" + i + " год "+(isLeap(i)?"високосный":"невисокосный"));
    }

    static boolean isLeap(int year) {
//        год, номер которого кратен 400, — високосный;
//        другие года, номера которых кратны 100, — невисокосные;
//        другие года, номер которых кратен 4, — високосные;
//        остальные года — невисокосные.
        if (year%400==0) {return true;}
        if (year%100==0) {return false;}
        return year % 4 == 0;
    }
}