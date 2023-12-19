package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println(getCountSteps(new int[]{7, 7, 7, 7, 7, 7, 7}, 8));
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
        int currentCapacity = wateringCanVolume;
        int[] wateredPlants = new int[plants.length];

        for (int i = 0; i < plants.length; i++) {
            // Поливаем текущее растение
            currentCapacity -= plants[i];


            // Проверяем, достаточно ли воды для полива следующего растения
            if (i < plants.length - 1 && currentCapacity < plants[i + 1]) {
                // Возвращаемся к реке и обратно к текущему растению
                steps += (i + 1) * 2;
                currentCapacity = wateringCanVolume;
            }

            // Идем к следующему растению
            steps++;
        }

        return steps;
    }
}