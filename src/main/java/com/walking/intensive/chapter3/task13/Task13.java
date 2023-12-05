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
        int steps = 0;
        int currentWater = 0;

        for (int i = 0; i < plants.length; i++) {
            if (currentWater < plants[i]) {
                steps += i * 2;
                currentWater = wateringCanVolume;
            }

            currentWater -= plants[i];
            steps++;
        }

        return steps;
    }
}