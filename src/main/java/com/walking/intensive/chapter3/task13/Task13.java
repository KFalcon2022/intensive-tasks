package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href=" ">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {

    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {

        if (getPlantWateringMaxVolume(plants) > wateringCanVolume) {
            return 0;
        }

        int countSteps = 1;
        int watertRemainder = wateringCanVolume;

        for (int i = 0; i < plants.length - 1; i++) {
            watertRemainder -= plants[i];

            if (watertRemainder >= plants[i + 1]) {
                countSteps++;

            } else {
                countSteps += (i + 1) * 2 + 1;
                watertRemainder = wateringCanVolume;
            }
        }

        return countSteps;
    }

    static int getPlantWateringMaxVolume(int[] array) {
        int plantWateringMaxVolume = 0;

        for (int i : array) {

            if (i > plantWateringMaxVolume) {
                plantWateringMaxVolume = i;
            }
        }

        return plantWateringMaxVolume;
    }
}