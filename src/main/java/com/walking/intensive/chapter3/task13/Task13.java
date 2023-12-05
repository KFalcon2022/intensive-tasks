package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = {1, 1, 1, 4, 2, 3};
        int wateringCanVolume = 4;

        if (isOpportunityWater(plants, wateringCanVolume))
            System.out.println(getCountSteps(plants, wateringCanVolume));
    }

    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int counter = 0; // количество шагов
        int index = 0;
        int amountWater = wateringCanVolume; // количество оставшейся воды в течение одного захода
        while (plants[plants.length - 1] != 0) {
            if (amountWater >= plants[index]) {
                amountWater -= plants[index];
                plants[index] = 0;
                index++;
                counter++;
            } else { // в ином случае иду обратно и сразу возвращаюсь на то же место, поэтому умножаем 2 на расстояние от реки до текущего индекса
                amountWater = wateringCanVolume;
                counter += 2 * index;
            }
        }

        return counter;
    }

    static boolean isOpportunityWater(int[] plants, int wateringCanVolume) {        // Проверяем, хватит ли объема лейки
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > wateringCanVolume) {
                return false; // т.е. объема лейки не хватит
            }
        }

        return true;
    }
}