package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println(getCountSteps(new int[]{1, 1, 1, 4, 2, 3}, 2));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        checkInputData(plants, wateringCanVolume);

        int steps = 0;
        int wateredPlantsCount = 0;
        int workingVolume;
        int i = 1;

        while (wateredPlantsCount < plants.length) {

            workingVolume = wateringCanVolume;
            steps += i - 1;


            while (plants[i - 1] <= workingVolume) {
                workingVolume -= plants[i - 1];
                steps++;
                wateredPlantsCount++;
                i++;
                if (wateredPlantsCount == plants.length) {
                    return steps;
                }
            }

            steps += i - 1;
        }

        return steps;
    }

    static void checkInputData(int[] plants, int wateringCanVolume) {
        for (int plant : plants) {
            if (plant < 0) {
                throw new IllegalArgumentException("Ошибка входных параметров");
            }
            if (plant > wateringCanVolume) {
                throw new IllegalArgumentException("Объема лейки должно быть достаточно для полива каждого цветка");
            }
        }
    }
}