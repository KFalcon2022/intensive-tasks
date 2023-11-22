package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floor = 5, entrance = 9, flatNumber = 12;
        System.out.println(getFlatLocation(floor, entrance, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода

        int entranceNumber = 1 + (flatNumber - 1) / (floorAmount * 4);
        int floorNumber = 1 + ((flatNumber - 1) % (floorAmount * 4)) / 4;

        if (flatNumber > floorAmount * entranceAmount * 4 || flatNumber < 1) {
            return "Такой квартиры нет";
        } else if (flatNumber % 4 == 1) {
            return "Ваша квартира " + flatNumber + " - " + entranceNumber + " подъезд, " + floorNumber + " этаж, слева от лифта, налево";
        } else if (flatNumber % 4 == 2) {
            return "Ваша квартира " + flatNumber + " - " + entranceNumber + " подъезд, " + floorNumber + " этаж, слева от лифта, направо";
        } else if (flatNumber % 4 == 3) {
            return "Ваша квартира " + flatNumber + " - " + entranceNumber + " подъезд, " + floorNumber + " этаж, справа от лифта, налево";
        }

        return "Ваша квартира " + flatNumber + " - " + entranceNumber + " подъезд, " + floorNumber + " этаж, справа от лифта, направо";

    }
}