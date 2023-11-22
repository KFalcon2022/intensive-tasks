package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 101;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        int remainder = age % 100 / 10; //Понял, где тупанул

        if (age < 0 || age > 127) {
            return "Это врядли";
        } else if (age > 9 && age < 20 || age > 109 && age < 120) { // Более элегантного решения не придумал
            return "Вам " + age + " лет";
        } else if (remainder == 1 || age % 10 == 1) { // А тут понял, что у меня в двух условиях один результат и объединил в одну строчку
            return "Вам " + age + " год";
        } else if (age % 10 >= 2 && age % 10 < 5) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет"; // Я понял, если не выполнились предыдущие if условия, то метод вернет эту строчку
    }
}