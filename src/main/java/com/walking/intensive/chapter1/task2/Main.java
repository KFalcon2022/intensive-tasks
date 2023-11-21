package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floorAmount = 9;
        int entranceAmount = 6;
        Scanner input = new Scanner(System.in);
        System.out.println("Номер вашей квартиры:");
        int flatNumber = input.nextInt();
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatSide = "";
        int entranceNumber = 0;
        int floorNumber = 0;
        int flatAmount = floorAmount * 4;

        if (flatNumber > flatAmount) {
            entranceNumber = 1 + (flatNumber - 1) / flatAmount;
            floorNumber = 1 + ((flatNumber - 1) - (entranceNumber - 1) * flatAmount) / 4;
        } else if (flatNumber < flatAmount) {
            entranceNumber = 1;
            floorNumber = 1 + (flatNumber - 1) / 4;
        } else if (flatNumber > flatAmount * entranceAmount) {
            System.out.println("Такой квартиры не существует!");
        }

        if ((flatNumber % 4) == 1) {
            flatSide = "слева от лифта, влево";
        } else if ((flatNumber % 4) == 2) {
            flatSide = "слева от лифта, вправо";
        } else if ((flatNumber % 4) == 3) {
            flatSide = "справа от лифта, влево";
        } else if ((flatNumber % 4) == 0) {
            flatSide = "справа от лифта, вправо";
        }

        return entranceNumber + " подъезд, " + floorNumber + " этаж, " + flatSide;
    }
}