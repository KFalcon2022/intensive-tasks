package com.walking.intensive.chapter1.task1;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        Scanner scanner = new Scanner(System.in);
        System.out.print("Веедите ваш возраст: ");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println(getAgeString(age));

    }

    static String getAgeString(int age) {

        int ageLastNum = age % 10;
        String year= "";

        if (ageLastNum == 1) {
            year = " год";
        } else if (ageLastNum == 0 || ageLastNum >= 5 && ageLastNum <= 9) {
            year = " лет";
        } else if (ageLastNum >= 2 && ageLastNum <= 4) {
            year= " года";
        }
        if (age % 100 >= 11 && age % 100 <= 14) {
            year= " лет";
        }

        return "Вам : " + age + year;
    }
}
