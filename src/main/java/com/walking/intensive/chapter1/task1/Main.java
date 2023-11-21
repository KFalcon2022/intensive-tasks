package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if(age < 0){
            return "Ошибка! Возраст не может быть отрецательным!";
        }
        if(age > 127){
            return "Ого! Новый мировой рекорд!";
        }


        if ((age >= 5 && age <= 20) || (age >= 111 && age <= 114)) {
            return "Вам " + age + " лет";
        } else if (age % 10 == 1) {
            return "Вам " + age + " год";
        } else if ((age % 10 > 1) && (age % 10 <= 4)) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}