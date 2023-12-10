package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = new int[]{2, 2, 3, 3};
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
        int stepsCount = 0;
        int currentWaterValue = wateringCanVolume;

        for (int i = 0; i < plants.length; i++) {
            if (currentWaterValue >= plants[i]) {
                stepsCount += 1;
                currentWaterValue -= plants[i];
            }
            else {
                stepsCount += i * 2 + 1;
                currentWaterValue = wateringCanVolume;
                currentWaterValue -= plants[i];

            }
        }

        return stepsCount;
    }
}