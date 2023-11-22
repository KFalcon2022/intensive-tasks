package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        for (int age=0 ; age<=127; age++) {
            System.out.println(getAgeString(age));
        }
    }
    static String getAgeString(int age) {
        String ageMessage = "Вам ";
         if (age % 10 == 0 || age % 10 > 4 || age % 100 > 10 && age % 100 < 15){
            ageMessage = ageMessage + age + " лет";
        } else if (age % 10 == 1){
            ageMessage = ageMessage + age + " год";
        } else if (age % 10 > 1){
            ageMessage = ageMessage + age + " года";
        }
        return ageMessage;
    }
}