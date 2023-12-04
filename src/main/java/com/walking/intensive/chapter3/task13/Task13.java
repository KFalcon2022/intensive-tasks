package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 0, 0};
        System.out.println(getCountSteps(array, 3));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int output = 0;
        int waterInWatering = wateringCanVolume;
        for (int i = 1; i <= plants.length; i++) {
            if (waterInWatering >= plants[i - 1]) {
                waterInWatering -= plants[i - 1];
            } else {
                output += (i - 1) * 2;
            }
            output++;
        }
        return output;
    }
}