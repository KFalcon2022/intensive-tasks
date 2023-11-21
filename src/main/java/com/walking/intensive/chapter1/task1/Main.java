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

        final int MAX_AGE = 127; // Максимальный возраст человека на данный момент вынесем в константу

        if (age >= 0 && age <= MAX_AGE) {

            /*
            Если заданный возраст находится в пределах от 0 до 127 лет включительно,
            то заводим две целочисленные переменные:
            */
            int remainderOfDivisionOnTen = age % 10;   // отстаток от деления возраста на 10
            int remainderOfDivisionOnOneHundred = age % 100;  // и остаток от деления возраста на 100

            /*
            И задаём следующие условия:

            - если остаток от деления на 10 равен 1, а остаток от деления на 100 не равен 11,
            то возвращаемая строка будет примерно такого вида : "Вам n год."
            */
            if (remainderOfDivisionOnTen == 1 && remainderOfDivisionOnOneHundred != 11) {
                return "Вам " + age + " год.";

              /*
              - если остаток от деления на 10 находится в диапозоне от 2 до 4 включительно,
              а остаток от деления на сто  не равен ни 12, ни 13, ни 14,
              то пример возвращаемой строки будет: "Вам n года."
              */
            } else if ((remainderOfDivisionOnTen >= 2 && remainderOfDivisionOnTen <= 4) &&
                       (remainderOfDivisionOnOneHundred < 12 || remainderOfDivisionOnOneHundred > 14)) {
                return "Вам " + age + " года.";
            }

            // - во всех остальных случаях возвращаемая строка будет: "Вам n лет."
            else
                return "Вам " + age + " лет.";

        /*
        Если указанный возраст превышает отметку в 127 лет или имеет отрицательное значение,
        то будут возвращаться соответствующие информационные сообщения
        */
        } else if (age > MAX_AGE) {
            return "Рекорд долгожительства на данный момент составляет 127 лет. " +
                    "Пожалуйста, введите свой реальный возраст." +
                    "\nЕсли Вы старше " + MAX_AGE +
                    " лет, то свяжитесь со службой поддержки для вывода корректного результата.";

        } else
            return "Отрицательного возраста не бывает. Пожалуйста, введите корректные данные.";
    }
}