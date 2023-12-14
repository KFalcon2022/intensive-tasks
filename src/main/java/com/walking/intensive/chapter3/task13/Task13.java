package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = {2, 2, 3, 3};
        int wateringCanVolume = 5;

        System.out.println("Необходимое количество шагов: " + getCountSteps(plants, wateringCanVolume));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     * Логика работы:
     * 1. Проходим по всем растениям в массиве plants.
     * 2. Проверяем, хватает ли воды в лейке для полива текущего растения.
     * 3. Если воды не хватает, возвращаемся к реке, чтобы наполнить лейку.
     * 4. После полива каждого растения переходим к следующему, учитывая количество шагов.
     * 5. После полива последнего растения возвращаемся к начальной точке.
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int steps = 0; // Общее количество шагов
        int waterInCan = 0; // Текущее количество воды в лейке

        for (int i = 0; i < plants.length; i++) {
            if (waterInCan < plants[i]) {
                // Шаги, чтобы вернуться к реке и наполнить лейку
                steps += (i + 1) * 2;
                // Наполняем лейку полностью
                waterInCan = wateringCanVolume;
            }

            // Поливаем растение, и уменьшаем количество воды в лейке
            waterInCan -= plants[i];
            // Если это не последнее растение, делаем шаг к следующему
            if (i < plants.length - 1) {
                steps++;
            }
        }

        // Последний шаг - возвращение к начальной точке после полива последнего растения
        steps += plants.length;

        return steps;
    }
}