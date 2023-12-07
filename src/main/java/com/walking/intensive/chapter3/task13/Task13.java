package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 3};
        int water = 5;

        System.out.println(getCountSteps(array, water));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        if (isInputDataZero(plants, wateringCanVolume) || isWateringCanSmall(plants, wateringCanVolume)) {
            return -1;
        }
        int sum = 0;
        int remainingWater = 0;

        for (int i = 0; i < plants.length; i++) {
            if (i == 0) {
                remainingWater = wateringCanVolume;
            }

            if (remainingWater == wateringCanVolume && plants[i] <= remainingWater) {
                sum += i + 1;
                remainingWater -= plants[i];
            } else if (plants[i] <= remainingWater ) {
                sum += 1;
                remainingWater -= plants[i];
            } else {
                sum += i;
                remainingWater = wateringCanVolume;
                sum += i + 1;
                remainingWater -= plants[i];
            }
        }

        return sum;
    }

    static boolean isInputDataZero(int[] plants, int wateringCanVolume) {
        return plants.length == 0 || wateringCanVolume <= 0;
    }

    static boolean isWateringCanSmall(int[] plants, int wateringCanVolume) {
        for (int item : plants) {
            if (item > wateringCanVolume) {
                return true;
            }
        }

        return false;
    }
}
