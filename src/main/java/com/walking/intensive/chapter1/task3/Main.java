package src.main.java.com.walking.intensive.chapter1.task3;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int yearNumber = scanner.nextInt();

        scanner.close();

        if (isLeap(yearNumber)) {
            System.out.println("Этот год високосный!");
        } else {
            System.out.println("Этот год не високосный!");
        }
    }

    static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0));
    }
}