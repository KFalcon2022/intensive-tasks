package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        //4 4 64
        int floorAmount = 4;
        int entranceAmount = 4;

        for (int i = 0; i < 66; i++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, i));
        }

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        //проверка на корректность этажей
        if (floorAmount < 1) {
            return "В доме не может быть менее 1 этажа";
        }

        //проверка на корректность количества подъездов
        if (entranceAmount < 1) {
            return "В доме не может быть менее 1 подъезда";
        }

        final int FLATS_PER_FlOOR = 4; // константа для количества квартир на этаже
        int flatAmmount = floorAmount * entranceAmount * FLATS_PER_FlOOR; // вычисление общего количества квартир

        //ленивая проверка на наличие квартиры в доме
        if (flatNumber < 1 || flatNumber > flatAmmount) {
            return "В доме нет такой квартиры";
        }

        int entranceNumber = (int) Math.ceil((double) flatNumber / (floorAmount * FLATS_PER_FlOOR)); // вычисление подъезда. NB:возможно, сущеcтвует более простой способ округлять частное интов в большую сторону.

        int floorNumber = (int) Math.ceil((((double) flatNumber - (floorAmount * FLATS_PER_FlOOR * (entranceNumber - 1))) / FLATS_PER_FlOOR)); // вычисление этажа, тоже через одно место

        String destination;
        //направление квартиры на этаже
        switch (flatNumber % 4) {
            case 0:
                destination = "справа от лифта, вправо";
                break;
            case 1:
                destination = "слева от лифта, влево";
                break;
            case 2:
                destination = "слева от лифта, вправо";
                break;
            default:
                destination = "справа от лифта, влево";
                break;
        }
        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + destination;
    }
}