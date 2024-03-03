package com.walking.intensive.chapter1.task1;
import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Введите число лет (только целые значения): ");
        int age = sc.nextInt();
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String postfix = "";
        if (age%10 == 1) {
            postfix = " год";
        }
        else if(age%10 == 0 || age%10 >= 5 && age%10 <= 9) {
            postfix = " лет";
        }
        else if(age%100 >= 10 && age%100 <= 19) {
            postfix = " лет";
        }
        else if(age%10 >= 2 && age%10 <= 4) {
            postfix = " года";
        }
        else {
            return "Ошибка обработки";
        }
        return "Вам " + age + postfix;
    }
}