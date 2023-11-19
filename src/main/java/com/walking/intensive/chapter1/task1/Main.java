package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = getAge();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (isCheckAge(age)) {
            return printMessageAge(age);
        }
        return "Указанный возраст выходит за границы возможного. Попробуйте еще раз.";

    }

    //получение значения
    static int getAge() {
        Scanner in = new Scanner(System.in);
        //System.out.print("Введите возраст: ");
        int age = in.nextInt();
        in.close();
        return age;
    }

    //проверка значения на корректность
    static Boolean isCheckAge(int age) {
        if (age >= 0 && age <= 127) {
            return true;
        }
        return false;
    }

    //вывод сообщения
/*
лет 0 5 6 7 8 9 11 - 20 25 - 30
год 1 21 31
года 2 3 4 22 - 24 32-34
*/
    static String printMessageAge(int age) {
        byte type = 0;

        /*if (age == 0) {
            type = 0;
        }*/

        if (age == 1 || age % 10 == 1) {
            type = 1;
        }

        if ((2 <= age && age <= 4 ) || (2 <= age % 10 && age % 10 <= 4)) {
            type = 2;
        }

        if ((age >= 11 && age <= 19) || (age % 100 >= 11 && age % 100 <= 19)) {
            type = (byte) age;
        }

        String message = "";
        switch (type) {
            /*case 0: {
                message = "Вам 0 лет. Поздравляю! Вы только родились!";
                break;
            }*/
            case 1: {
                message = "Вам " + age + " год";
                break;
            }
            case 2: {
                message = "Вам " + age + " года";
                break;
            }
            default: {
                message = "Вам " + age + " лет";
            }
        }
        return message;
    }
}