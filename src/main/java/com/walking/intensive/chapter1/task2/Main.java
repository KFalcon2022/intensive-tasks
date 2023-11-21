package src.main.java.com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество подъездов: ");
        int entrancesQuantity = scanner.nextInt();

        System.out.print("Введите количество этажей: ");
        int floorsQuantity = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int apartNumber = scanner.nextInt();

        scanner.close();

        System.out.println(getRoomLocation(floorsQuantity, entrancesQuantity, apartNumber));
    }

    static String getRoomLocation(int floorsQuantity, int entrancesQuantity, int apartNumber) {
        int roomsPerFloor = 4;

        if ((apartNumber < 1) || (apartNumber > (roomsPerFloor * floorsQuantity * entrancesQuantity))) {
            return "Такой квартиры в доме нет";
        }

        String apartLoc = switch (apartNumber % roomsPerFloor) {
            case 0 -> "Справа от лифта, вправо";
            case 1 -> "Слева от лифта, влево";
            case 2 -> "Слева от лифта, вправо";
            case 3 -> "Справа от лифта, влево";
            default -> null;
        };

        int entranceNum = apartNumber / (roomsPerFloor * floorsQuantity);

        if (apartNumber % (roomsPerFloor * floorsQuantity) != 0) {
            entranceNum++;
        }

        int floorNum = apartNumber / roomsPerFloor - (entranceNum - 1) * floorsQuantity;

        if (apartNumber % roomsPerFloor != 0) {
            floorNum++;
        }

        return apartNumber + " кв - " + entranceNum + " подъезд, " + floorNum + " этаж, " + apartLoc;
    }
}
