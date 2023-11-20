package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int floorAmount = 4;
        int entranceAmount = 3;

        for (int i = 1; i < 52; i++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, i));
        }

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int flatsOnFloor = 4;
        int flatsInEntrance = floorAmount * 4; // квартир в подъезде

        if (flatNumber > flatsInEntrance * entranceAmount) {
            return "Кв. " + flatNumber + " - такой квартиры в доме нет!";
        }

        int location = flatNumber % flatsOnFloor; // место на этаже

        int entrance = ((flatNumber - 1) / flatsInEntrance) + 1; // подъезд
        int floor = ((flatNumber - 1) % flatsInEntrance) / flatsOnFloor + 1; // этаж

        StringBuilder sb = new StringBuilder();
        sb.append(flatNumber)
                .append(" кв – ")
                .append(entrance)
                .append(" подъезд, ")
                .append(floor)
                .append(" этаж, ");

        switch (location) {
            case 1 -> sb.append("слева от лифта, влево");
            case 2 -> sb.append("слева от лифта, вправо");
            case 3 -> sb.append("справа от лифта, влево");
            default -> sb.append("справа от лифта, вправо");
        }

        return sb.toString(); // Заглушка. При реализации - удалить
    }
}