package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        for (int i = 0; i < 50; i++) {
            int age = (int) Math.round(Math.random() * 130);
            System.out.printf("Вам %d %s\n", age, getExceptionsHundred(age));
        }
    }


    static String getExceptionsHundred(int age) {
        String resultString;
        if (age >= 105 && age <= 120) {
            resultString = "лет";
        } else resultString = getAgeString(getLostNumber(age));
        return resultString;
    }

    static int getLostNumber(int age) {
        age %= 10;
        return age;
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        String ageString;
        if (age > 1 && age < 5) {
            ageString = "года";
        } else if (((age >= 5) && (age <= 9)) || (age == 0)) {
            ageString = "лет";
        } else {
            ageString = "год";
        }
        return ageString; // Заглушка. При реализации - удалить
    }
}
