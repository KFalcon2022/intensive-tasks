package com.walking.intensive.chapter1.task3;
import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Введите год (только целые значения): ");
        int year = sc.nextInt();
        System.out.println((isLeap(year) ? "Год " + year + " - високосный" : "Год " + year + " - не високосный"));
    }

    static boolean isLeap(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}