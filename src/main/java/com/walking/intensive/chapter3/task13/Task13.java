package com.walking.intensive.chapter3.task13;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 3};
        System.out.println(getCountSteps(array, 5));

    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int recentWaterVolume = wateringCanVolume;
        int stepCount = 0;
        for (int i = 0; i < plants.length; i++) {
            if (recentWaterVolume < plants[i]) {
                recentWaterVolume = wateringCanVolume;
                stepCount += i;
                i = 0;
            }
            stepCount++;
            recentWaterVolume -= plants[i];
            plants[i] = 0;
        }
        return stepCount;
    }
}