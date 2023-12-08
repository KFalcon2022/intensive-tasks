package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.print(getCountSteps(new int[]{7, 7, 7, 7, 7, 7, 7}, 8));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int wateringCan = wateringCanVolume;
        int stepsCount = 0;
        for (int i = 0; i < plants.length; i++) {
            if (wateringCan < plants[i]) {
                stepsCount += i * 2;
            }
            stepsCount++;
            wateringCan -= plants[i];
        }
        return stepsCount;
    }
}