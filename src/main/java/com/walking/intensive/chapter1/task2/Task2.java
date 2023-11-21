package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
//              КУРСОВАЯ ЗАДАЧА - ДОМ
//
//        Дано 3 переменных: количество этажей в доме, количество подъездов и номер нужной квартиры.
//        На этаже 4 квартиры. Нумерация квартир возрастает по часовой стрелке.
//        Напишите программу, которая указывает подъезд, этаж и расположение нужной квартиры на этаже.
//        Примеры:
//        1 кв – 1 подъезд, 1 этаж, слева от лифта, влево
//        2 кв – 1 подъезд, 1 этаж, слева от лифта, вправо
//        3 кв – 1 подъезд, 1 этаж, справа от лифта, влево
//        4 кв – 1 подъезд, 1 этаж, справа от лифта, вправо
//        Если такой квартиры в доме нет, укажите это в решении.
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
//                       количество этажей в доме, количество подъездов и номер нужной квартиры.
        int floorAmount = 10;        // количество этажей в доме,
        int entranceAmount = 3;     // количество подъездов
        int flatNumber = 21;        //номер нужной квартиры

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }
        if (floorAmount * entranceAmount * 4 < flatNumber) {
            return "Такой квартиры не существует";
        }

        int currentEntrance = 1;

        for (int i = 1; i <= entranceAmount; i++) {
            if (i * floorAmount * 4 < flatNumber) {
                currentEntrance++;
            }
        }

        int floorNumber;
        int apartmentsInEntrance = 4 * floorAmount;
        int numberApartmentsInCurrentEntrance = flatNumber - (currentEntrance - 1) * apartmentsInEntrance;

        if (numberApartmentsInCurrentEntrance % 4 == 0) {
            floorNumber = numberApartmentsInCurrentEntrance / 4;
        } else {
            floorNumber = numberApartmentsInCurrentEntrance / 4 + 1;
        }

        return flatNumber + " кв - " + currentEntrance + " подъезд, " + floorNumber + " этаж," + getPleaseFlatNumber(flatNumber);
    }

    static String getPleaseFlatNumber(int flatNumber) {

        switch (flatNumber % 4) {
            case 0:
                return " справа от лифта, вправо";
            case 1:
                return " слева от лифта, влево";
            case 2:
                return " слева от лифта, вправо";
            case 3:
                return " слева от лифта, вправо";
            default:
                return " слева от лифта, вправо";

        }

    }

}