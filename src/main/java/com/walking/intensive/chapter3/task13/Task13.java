package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {

        int[] plants = {2, 2, 2, 2, 2};
        int wateringCanVolume = 5;
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

        if (plants.length < 1) {
            return 0;
        }

        int steps = 1;
        int waterBalance = wateringCanVolume - plants[0];

        for (int i = 1; i < plants.length; i++) {

            if (waterBalance >= plants[i]) {
                steps++;
                waterBalance -= plants[i];
            } else {
                steps += (2 * i + 1);
                waterBalance = wateringCanVolume - plants[i];
            }

        }
        return steps;
    }
}