package com.walking.intensive.chapter1.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 3;
        int entranceAmount = 3;
        int flatNumber = 36;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "слева от лифта, влево");
        map.put(2, "слева от лифта, вправо");
        map.put(3, "справа от лифта, влево");
        map.put(4, "справа от лифта, вправо");

        int flatAmount = floorAmount * entranceAmount * 4;

        if ((flatNumber > flatAmount) || (flatNumber < 0)) {
            return "Такой квартиры в доме нет.";
        }

        int count = 1;
        for (int entrance = 1; entrance < entranceAmount + 1; entrance++) {
            for (int floor = 1; floor < floorAmount + 1; floor++) {
                for (int flat = 1; flat < 5; flat++, count++) {
                    if (count == flatNumber) {
                        return String.format("%d кв - %d подъезд, %d этаж, %s", flatNumber, entrance, floor, map.get(flat));
                    }
                }
            }
        }
        return "Такой квартиры в доме нет.";
    }
}