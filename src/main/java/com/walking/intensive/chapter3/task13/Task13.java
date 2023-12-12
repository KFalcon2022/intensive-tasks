package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {

    public static void main(String[] args) {
        int[] plants = new int[] {7,7,7,7,7,7,7};
        int wateringCanVolume = 8;

        System.out.println(getCountSteps(plants, wateringCanVolume));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */

    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int countSteps = 0;
        int x = -1;
        int totalWaterVolume = 0;

        for (int plant: plants) {
            totalWaterVolume += plant;
        }

        int wateringCan = wateringCanVolume;

        while (totalWaterVolume > 0) {
            x++;
            countSteps++;

            while (wateringCan > 0 && plants[x] > 0) {
                wateringCan--;
                plants[x]--;
                totalWaterVolume--;
            }

            if (totalWaterVolume > 0 && (wateringCan == 0 || plants[x + 1] > wateringCan)) {
                while (x >= 0) {
                    x--;
                    countSteps++;
                }
                wateringCan = wateringCanVolume;
            }
        }

        return countSteps;
    }

/* Алгоритм, если выливать лейку до конца
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int stepsCount = 0;
        int x = -1;
        int neededWateringVolume = 0;

        for (int plant: plants) {
            neededWateringVolume += plant;
        }

        int wateringCan = wateringCanVolume;

        while (neededWateringVolume > 0) {
            x++;
            stepsCount++;

            while (wateringCan > 0 && plants[x] > 0) {
                wateringCan--;
                plants[x]--;
                neededWateringVolume--;
            }

            if (wateringCan == 0 && neededWateringVolume > 0) {
                while (x >= 0) {
                    x--;
                    stepsCount++;
                }
                wateringCan = wateringCanVolume;
            }
        }

        return stepsCount;
    }
    */
}