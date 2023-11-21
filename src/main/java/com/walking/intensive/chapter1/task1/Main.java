package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Рекорд долгожительства на данный момент составляет 127 лет. Введите Ваш возраст: ");
        int yourAge = in.nextInt();

        in.close();
        System.out.println(getAgeString(yourAge));
    }

    static String getAgeString(int yourAge) {

        if (yourAge < 0 || yourAge > 127) {
            return "Проверьте правильность введённых данных либо обратитесь в Книгу Рекордов Гинесса.";
        } if (yourAge % 100 >= 11 && yourAge % 100 <= 19) {
            return "Вам " + yourAge + " лет";
        } if (yourAge % 10 >= 2 && yourAge % 10 <= 4) {
            return "Вам " + yourAge + " года";
        } if (yourAge % 10 == 1) {
            return "Вам " + yourAge + " год";
        } else {
            return "Вам " + yourAge + " лет";
        }
    }
}