package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floorAmount = 5;
        int entranceAmount = 8;
        int flatNumber = 96;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int apartmentsOnFloor = 4;

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) {
            return "Количество этажей, подъездов и номер квартиры должны быть положительными. " +
                    "Проверьте корректность введенных значений";
        } else if (floorAmount * entranceAmount * apartmentsOnFloor < flatNumber) {
            return "Квартира № " + flatNumber + " в данном здание не существует.";
        }

        String flatLocation;

        if (flatNumber % apartmentsOnFloor == 1) {
            flatLocation = "слева от лифта, влево";
        } else if (flatNumber % apartmentsOnFloor == 2) {
            flatLocation = "слева от лифта, вправо";
        } else if (flatNumber % apartmentsOnFloor == 3) {
            flatLocation = "справа от лифта, влево";
        } else {
            flatLocation = "справа от лифта, вправо";
        }

        int currentEntrance = 1;

        for (int i = 1; i <= entranceAmount; i++) {
            if (i * floorAmount * apartmentsOnFloor < flatNumber) {
                currentEntrance++;
            }
        }

        int apartmentsInEntrance = apartmentsOnFloor * floorAmount;
        int currentFloor;
        int numberApartmentsInCurrentEntrance = flatNumber - (currentEntrance - 1) * apartmentsInEntrance;

        if (numberApartmentsInCurrentEntrance % apartmentsOnFloor == 0) {
            currentFloor = numberApartmentsInCurrentEntrance / apartmentsOnFloor;
        } else {
            currentFloor = numberApartmentsInCurrentEntrance / apartmentsOnFloor + 1;
        }

        return flatNumber + " кв – " + currentEntrance + " подъезд, " + currentFloor + " этаж, " + flatLocation;
    }
}