package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 32;

        getAgeString(age);
    }

    static void getAgeString(int age) {

        if (age < 0) {
            System.out.println("Неверный возраст.");
        } else if (age % 10 == 1 && age != 11) {
            System.out.println("Вам " + age + " год.");
        } else if (age % 10 >= 2 && age % 10 <= 4 && age != 12 && age != 13 && age != 14) {
            System.out.println("Вам " + age + " года.");
        } else {
            System.out.println("Вам " + age + " лет.");
        }

    }
}