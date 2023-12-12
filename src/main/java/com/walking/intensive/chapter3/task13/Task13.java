package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
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
        int waterVolume = wateringCanVolume;
        int steps = 0;
        for (int i = 0; i < plants.length; i++, steps++) {
            if (plants[i] > waterVolume) {
                waterVolume = wateringCanVolume - plants[i];
                steps += i * 2;
            } else {
                waterVolume -= plants[i];
            }
        }
        return steps;
    }
}