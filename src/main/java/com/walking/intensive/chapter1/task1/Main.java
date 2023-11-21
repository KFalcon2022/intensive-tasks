package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 42;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        final int MAX_AGE = 127;

        if (age >= 0 && age <= MAX_AGE) {

            int remainderOfDivisionOnTen = age % 10;
            int remainderOfDivisionOnOneHundred = age % 100;

            if (remainderOfDivisionOnTen == 1 && remainderOfDivisionOnOneHundred != 11) {
                return "Вам " + age + " год.";

            } else if ((remainderOfDivisionOnTen >= 2 && remainderOfDivisionOnTen <= 4) &&
                    (remainderOfDivisionOnOneHundred < 12 || remainderOfDivisionOnOneHundred > 14)) {
                return "Вам " + age + " года.";

            } else {
                return "Вам " + age + " лет.";
            }

        } else if (age > MAX_AGE) {
            return "Рекорд долгожительства на данный момент составляет 127 лет. " +
                    "Пожалуйста, введите свой реальный возраст." +
                    "\nЕсли Вы старше " + MAX_AGE +
                    " лет, то свяжитесь со службой поддержки для вывода корректного результата.";

        } else {
            return "Отрицательного возраста не бывает. Пожалуйста, введите корректные данные.";
        }
    }
}