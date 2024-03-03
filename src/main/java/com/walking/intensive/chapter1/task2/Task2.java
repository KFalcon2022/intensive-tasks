package com.walking.intensive.chapter1.task2;
import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream

        System.out.print("Введите число этажей в доме (только целые положительные значения): ");
        int floorAmount = sc.nextInt();

        System.out.print("Введите число подъездов в доме (только целые положительные значения): ");
        int entranceAmount = sc.nextInt();

        System.out.print("Введите номер квартиры (только целые положительные значения): ");
        int flatNumber = sc.nextInt();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        if (flatNumber < 1) {
            return "Такой квартиры не существует";
        }

        if (entranceAmount < 1) {
            return "В доме должен быть хоть один подъезд";
        }

        if (floorAmount < 1) {
            return "В доме должен быть хоть один этаж";
        }

        final int floorFlatsNum = 4,
                  entrance = ((flatNumber - 1) / floorAmount) / floorFlatsNum + 1,
                  floor = (int) Math.ceil((double) flatNumber / floorFlatsNum) - (entrance - 1) * floorAmount;

        if (entrance > entranceAmount) {
            return "Такой квартиры не существует";
        }

        String direction = switch (flatNumber % floorFlatsNum) {
            default -> "справа от лифта, вправо";
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
        };

        return flatNumber + " кв - " + entrance +
                " подъезд, " + floor + " этаж, " + direction;
    }
}