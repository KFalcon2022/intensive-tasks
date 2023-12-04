package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,4,2,3};
        System.out.println(getCountSteps(array, 4));
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
        int i = 0;
        while (i < plants.length) {
            if (waterInWatering >= plants[i]) {
                waterInWatering -= plants[i];
                i++;
                output++;
            } else {
                output += (i) * 2;
                waterInWatering = wateringCanVolume;
            }
        }
        return output;
    }
}