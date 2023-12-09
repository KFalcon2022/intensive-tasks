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
        int sum = 0;
        int remainingWater = 0;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < remainingWater) {
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
}
