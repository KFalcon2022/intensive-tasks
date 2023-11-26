package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(10,3,121));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        /*
        Проверка на то, что номер квартиры - положительное число и
        номер квартиры не превышает кол-во возможных квартир в доме
         */
        if ( flatNumber <= 0 || 4 * floorAmount * entranceAmount < flatNumber ) {
            return "Такой квартиры не существует";
        }

        flatNumber--; // Нумерация квартир будет начинаться не с 1, а с 0
        String answer = "";

        int flatInEntrance = 4 * floorAmount; // Кол-во квартир в одном подъезде = 4 * кол-во этажей
        answer += String.valueOf(flatNumber / flatInEntrance + 1) + " подъезд," + String.valueOf((flatNumber % flatInEntrance) / 4 + 1) + " этаж,";

        switch(flatNumber % 4){
            case 0:
                answer += "слева от лифта, влево";
                break;
            case 1:
                answer += "слева от лифта, вправо";
                break;
            case 2:
                answer += "справо от лифта, влево";
                break;
            case 3:
                answer += "справа от лифта, вправо";
                break;
        }

        return answer;
    }
}