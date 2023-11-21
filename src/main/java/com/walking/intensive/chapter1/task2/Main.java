package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatLocation = "";

        //Проверки входных значений
        long totalFlats = 4L * floorAmount * entranceAmount;
        if (flatNumber > totalFlats || flatNumber <= 0) {
            flatLocation += "Квартиры " + flatNumber + " в доме нет";
            return flatLocation;
        }
        if (floorAmount <= 0 || entranceAmount <= 0) {
            flatLocation += "Параметры дома заданы неверно";
            return flatLocation;
        }

        long entranceNumber = (flatNumber / (totalFlats / entranceAmount)) + 1;
        //Обработка случая, когда искомая квартира крайняя в парадной.
        if (flatNumber % (totalFlats / entranceAmount) == 0) {
            entranceNumber--;
        }
        long floorNumber = ((flatNumber - (((entranceNumber - 1) * 4L * floorAmount) + 1)) / 4) + 1;
        flatLocation += flatNumber + " кв – " + entranceNumber + " подъезд, " + floorNumber + " этаж, ";
        if (flatNumber > (4L * floorAmount * (entranceNumber - 1)) + (4L * (floorNumber - 1)) + 2) {
            flatLocation += "справа от лифта, ";
        } else {
            flatLocation += "слева от лифта, ";
        }
        if (flatNumber % 2 == 0) {
            flatLocation += "вправо";
        } else {
            flatLocation += "влево";
        }

        return flatLocation;
    }
}