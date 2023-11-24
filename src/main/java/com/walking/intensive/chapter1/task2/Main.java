package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 2;
        int entranceAmount = 3;
        int flatNumber = 11;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int FLOOR_FLAT_AMOUNT = 4;

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) {
            return "Введены некорректные данные.";
        }

        int entranceFlatAmount = FLOOR_FLAT_AMOUNT * floorAmount;
        if (flatNumber > (entranceFlatAmount * entranceAmount)) {
            return "Квартиры с указанным номером нет. Проверьте введённые данные.";
        }

        int entranceNumber = flatNumber / entranceFlatAmount;
        if (flatNumber % entranceFlatAmount != 0) {
            entranceNumber++;
        }

        int floorNumber =
                (flatNumber - (entranceNumber - 1) * entranceFlatAmount) / FLOOR_FLAT_AMOUNT;
        int modFloorFlatAmount = flatNumber % FLOOR_FLAT_AMOUNT;
        if (modFloorFlatAmount != 0) {
            floorNumber++;
        }

        String floorPlace;
        switch (modFloorFlatAmount) {
            case 1:
                floorPlace = "слева от лифта, влево";
                break;
            case 2:
                floorPlace = "слева от лифта, вправо";
                break;
            case 3:
                floorPlace = "справа от лифта, влево";
                break;
            default:
                floorPlace = "справа от лифта, вправо";
        }
        return String.format("%d кв - %d подъезд, %d этаж, %s",
                flatNumber, entranceNumber, floorNumber, floorPlace);
    }
}