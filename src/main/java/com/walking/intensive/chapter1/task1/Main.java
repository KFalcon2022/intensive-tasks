package com.walking.intensive.chapter1.task1;

public class Main {
    public static void main(String[] args) {
        for (int i = -10; i < 140; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        if (age < 0 | age > 127) {
            return "неверное значение";
        }
        String result;
        int reminder10 = age % 10;
        int reminder100 = age % 100;

        if ((reminder10 == 0 || reminder10 > 4) || (reminder100 > 10 && reminder100 < 20)) {
            result = " лет";
        } else if (reminder10 == 1) {
            result = " год";
        } else {
            result = " года";
        }
        return "Вам " + age + result;
    }
}

// Вроде все работет, решал и с помощю 10-ти разных if и с помощью кейсов, подглядел самое короткое решение в ветке)))









