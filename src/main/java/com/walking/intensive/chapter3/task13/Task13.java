package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = {2, 2, 3, 3};
        int wateringCanVolume = 5;
        System.out.println(getCountSteps(plants, wateringCanVolume));
    }

    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int countSteps = 0;
        int currentWaterLevel = wateringCanVolume;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < currentWaterLevel) {
                countSteps++;
                currentWaterLevel -= plants[i];
            } else {
                countSteps += (2 * i + 1);
                currentWaterLevel = wateringCanVolume - plants[i];
            }
        }

        return countSteps;
    }
}