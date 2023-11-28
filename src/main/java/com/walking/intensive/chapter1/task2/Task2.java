package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.print(getFlatLocation(10, 3, 5));


    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatFloor = floorAmount * 4;
        int adjustmentOfApartmentLocation = 0;

        if (flatNumber < 1 || flatNumber > flatFloor * entranceAmount) {
            return "Такой квартиры не существует";
        }
        int entranceNumber = flatNumber / (flatFloor + 1) + 1;  //номер подьезда

        int floorNumber = (flatNumber + 3) / 4 - floorAmount * (entranceNumber - 1);     //этаж

        if (flatNumber < 5){
            adjustmentOfApartmentLocation = 4;
        }
        String patch = switch ((flatNumber + adjustmentOfApartmentLocation) % 4) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 0 -> "справа от лифта, вправо";
            default -> "";
        };
        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + patch;
    }

}