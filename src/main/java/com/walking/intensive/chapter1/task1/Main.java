package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age == 1 || age == 101) {
            return String.format("Вам %d год", age);
        }
        else if ((age > 0 && age < 5) || (age > 101 && age < 105)) {
            return String.format("Вам %d года", age);
        }
        else if ((age >= 5 && age <= 100) || (age >= 105 && age <= 127)) {
            return String.format("Вам %d лет", age);
        }
        else {
            return "Указан неверный возраст";
        }
    }
}