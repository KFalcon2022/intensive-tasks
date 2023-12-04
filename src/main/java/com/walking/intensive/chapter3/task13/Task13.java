package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = {1, 1, 1, 4, 2, 3};
        int wateringCanVolume = 4;
        System.out.println(getCountSteps(plants, wateringCanVolume));
    }

    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int wateringCan = wateringCanVolume;
        int count = 0;

        for (int i = 0; i < plants.length; i++) {   //поливаем пока есть вода
            wateringCan = wateringCan - plants[i];
            count++;

            if (i == plants.length - 1) {           // когда полили последнюю грядку, заканчиваем работу
                return count;
            }

            if (wateringCan <= plants[i]) {         // вода закончилась
                count += i + 1;                     // идем к реке
                wateringCan = wateringCanVolume;    // наполняем лейку

                for (int j = 0; j <= i; j++) {      // возращаемя с водой
                    count++;
                }
            }
        }

        return count;
    }
}