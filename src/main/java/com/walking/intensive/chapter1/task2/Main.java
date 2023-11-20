package com.walking.intensive.chapter1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount, entranceAmount, flatNumber;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество этажей в доме: ");
        floorAmount = Integer.parseInt(reader.readLine());

        System.out.println("Введите количество подъездов в доме: ");
        entranceAmount = Integer.parseInt(reader.readLine());

        System.out.println("Введите номер квартиры: ");
        flatNumber = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        String flatPosition = null;

        if (entranceAmount * floorAmount * 4 < flatNumber) return "Такой квартиры в доме нет";

        int flatsOnTheEntrance = floorAmount * 4; //кол-во квартир в подъезде
        int entranceNumber = (flatNumber - 1) / flatsOnTheEntrance + 1; // номер подъезда
        int floorNumber = (flatNumber - 1) % flatsOnTheEntrance / 4 + 1; // номер этажа

        switch ((flatNumber - 1) % 4) {
            case 0 -> flatPosition = "-й этаж, слева от лифта, влево";
            case 1 -> flatPosition = "-й этаж, слева от лифта, вправо";
            case 2 -> flatPosition = "-й этаж, справа от лифта, влево";
            case 3 -> flatPosition = "-й этаж, справа от лифта, вправо";
        }
        return entranceNumber + "-й подъезд, " + floorNumber + flatPosition;
    }
}