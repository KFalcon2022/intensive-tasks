package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floors = Integer.parseInt(args[0]);
        int entrances = Integer.parseInt(args[1]);
        int flatNumber = Integer.parseInt(args[1]);

        System.out.println(getFlatLocation(floors, entrances, flatNumber));

//        System.out.println(getFlatLocation(5,5, 1));
//        System.out.println(getFlatLocation(5,5, 2));
//        System.out.println(getFlatLocation(5,5, 3));
//        System.out.println(getFlatLocation(5,5, 4));


    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        if (flatNumber > floorAmount * entranceAmount * 4 || flatNumber < 0) return "Нет такой квартиры";

        int flatsInEntrance = floorAmount * 4;
        int entranceNumber = flatNumber/flatsInEntrance + 1;
        int floorNumber = ((flatNumber - 1) % flatsInEntrance) / 4 + 1;
        int flatPosition = flatNumber % 4;

        if (flatPosition == 1)
            return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж , слева от лифта, влево";
        if (flatPosition == 2)
            return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж , слева от лифта, вправо";
        if (flatPosition == 3)
            return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж , справа от лифта, влево";
        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж , справа от лифта, вправо";
//        return null; // Заглушка. При реализации - удалить
    }
}