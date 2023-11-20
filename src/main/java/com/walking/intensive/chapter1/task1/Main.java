package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        //int age = 0;

        for (int age=0 ; age<=127; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {
        String ageMessage = "Вам ";

        if (age == 0){
            //"Я родился! (с) Лунтик"
            ageMessage = "Вы - Лунтик";
        }
        else if (age % 10 == 0 || age % 10 > 4 || age % 100 > 10 && age % 100 < 15){
            // если возраст заканчивается на 0
            // если возраст заканчивается на 5-9
            // если возраст заканчивается на 11-14
            ageMessage = ageMessage + age + " лет";
        }
        else if (age % 10 == 1){
            //если возраст заканчивается на 1
            ageMessage = ageMessage + age + " год";
        }
        else if (age % 10 > 1){
            //если возраст заканчивается на 2-4
            ageMessage = ageMessage + age + " годa";
        }

        return ageMessage; // Возвращаем ответ
    }
}