package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.print(getFlatLocation(15, 5, 110));


    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatFloor = floorAmount * 4;
        int flatNumberOriginal = flatNumber;

        if (flatNumber < 1 || flatNumber > flatFloor * entranceAmount) {
            return "Такой квартиры не существует";
        }

        int entranceNumber = flatNumber / (flatFloor + 1) + 1;  //номер подьезда

        if (flatNumber > flatFloor) {
            flatNumber = flatNumber - (flatFloor * (entranceNumber - 1));   //номер квартиры если бы она была в 1 подъезде
        }
        int floorNumber = (flatNumber + 3) / 4;     //этаж

        int flatNumber2 = flatNumber - (floorNumber - 1) * 4;  //номер квартиры если бы она была на 1 этаже

        String toGo = "";

        switch (flatNumber2) {

            case 1:
                toGo = "слева от лифта, влево";
                break;
            case 2:
                toGo = "слева от лифта, вправо";
                break;
            case 3:
                toGo = "справа от лифта, влево";
                break;
            case 4:
                toGo = "справа от лифта, вправо";
                break;

        }
        return flatNumberOriginal + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + toGo;


    }

}