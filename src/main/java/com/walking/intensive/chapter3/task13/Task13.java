package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */

public class Task13 {
    public static void main(String[] args) {
        int[] plants = {2, 2, 3, 3};
        int waterCapacity = 5;

        System.out.println("Необходимое количество шагов: " + getCountSteps(plants, waterCapacity));
    }
    /**
     * Получает количество шагов, необходимых для полива всех растений.
     *
     * @param plants        массив с количеством литров воды, необходимым каждому растению
     * @param waterCapacity объем лейки
     * @return общее количество шагов для полива всех растений
     */

    static int getCountSteps(int[] plants, int waterCapacity) {
        int steps = 0; // Общее количество шагов
        int currentWater = waterCapacity; // текущее количество воды в лейке

        for (int i = 0; i < plants.length; i++) {
            // Если в лейке недостаточно воды для полива текущего растения
            if (currentWater < plants[i]) {
                // Возвращаемся к реке и обратно
                steps += i * 2;
                // Наполняем лейку полностью
                currentWater = waterCapacity;
            }

            // Поливаем растение и уменьшаем объем воды в лейке
            currentWater -= plants[i];
            // Шаг к следующему растению
            steps++;
        }

        return steps;
    }
}