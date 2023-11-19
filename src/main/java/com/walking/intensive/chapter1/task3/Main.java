package com.walking.intensive.chapter1.task3;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int year = getYear();
        printMessage(isCheckYearGregorian(year), isCheckYearJulian(year), isCheckYear(year));

    }

    //получение значения
    static int getYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();

        if (year <= 0) {
            System.out.print("Анализируются года текущей эры. Введите год повторно:");
            year = in.nextInt();
        }

        in.close();
        return year;
    }

    /*Разделение на календари добавлено для корректности проверки.
    Большая часть спиской високосных годов представлена по Грегорианскому календарю.
    В условиях задачи расчеты расходятся и с Юлианским календарем, и с Григорианским.*/

    //проверка значений, Грегорианский календарь
    /*год, номер которого кратен 400, — високосный;
остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
остальные годы, номер которых кратен 4, — високосные;
все остальные годы — невисокосные*/
    static boolean isCheckYearGregorian(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }

    //проверка значений, Юлианский календарь
    static boolean isCheckYearJulian(int year) {
        if (year == 1) {
            return true;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    //проверка значений, согласно условиям задачи
    static boolean isCheckYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        return false;
    }

    //вывод сообщения
    static void printMessage(boolean gregorianCalendar, boolean julianCalendar, boolean taskCalendar) {
        if (gregorianCalendar == true) {
            System.out.println("По Григорианскому календарю: високосный.");
        } else {
            System.out.println("По Григорианскому календарю: невисокосный.");
        }

        if (julianCalendar == true) {
            System.out.println("По Юлианскому календарю: високосный.");
        } else {
            System.out.println("По Юлианскому календарю: невисокосный.");
        }

        if (taskCalendar == true) {
            System.out.println("По условиям задачи: високосный.");
        } else {
            System.out.println("По условиям задачи: невисокосный.");
        }
    }
}