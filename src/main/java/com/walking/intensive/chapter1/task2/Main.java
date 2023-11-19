package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 32; i++) {
            System.out.println(getFlatLocation(3, 4, i));
        }

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (flatNumber <= 0 || flatNumber > floorAmount * entranceAmount * 4) {
             return "Такой квартиры не существует в этом доме";
        }

        //квартира на этаже
        int flatOnFloor = flatNumber % 4;
        if (flatOnFloor == 0) {
            flatOnFloor = 4;
        }

        //выбор направления
        String direction = switch (flatOnFloor) {
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            case (4) -> "справа от лифта, вправо";
            default -> "";
        };

        //Подъезд
        int entranceOfFlat = (flatNumber / (floorAmount * 4));
        if (flatNumber % (floorAmount * 4) > 0) {
            entranceOfFlat++;
        }

        //Этаж, где квартира
        int floorOfFlat = (flatNumber - 1) / 4 % floorAmount + 1;

        String format = "%s кв. – %s подъезд, %s этаж, %s";
        return format.formatted(flatNumber, entranceOfFlat, floorOfFlat, direction);

    }
}