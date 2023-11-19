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
        System.out.print("Введите возраст: ");
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
        String type = "";

        /*if (age == 0) {
            type = "0";
        }*/

        if ((age == 1 || age % 10 == 1 || age % 100 == 1) && (age != 11 && age - 100 != 11)) {
            type = "year";
        }

        if (age == 2 || age % 10 == 2 || age % 100 == 2 ||
                age == 3 || age % 10 == 3 || age % 100 == 3 ||
                age == 4 || age % 10 == 4 || age % 100 == 4) {
            type = "years";
        }

        String message = "";
        switch (type) {
            /*case "0": {
                message = "Вам 0 лет. Поздравляю! Вы только родились!";
                break;
            }*/
            case "year": {
                message = "Вам " + age + " год.";
                break;
            }
            case "years": {
                message = "Вам " + age + " годa.";
                break;
            }
            default: {
                message = "Вам " + age + " лет.";
            }
        }
        return message;
    }

}