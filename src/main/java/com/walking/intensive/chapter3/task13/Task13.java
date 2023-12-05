package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = {1, 1, 1, 4, 2, 3};
        int[] plants1 = {2, 2, 3, 3};

        int wateringCanVolume = 4;
        int wateringCanVolume1 = 5;

        System.out.println(getCountSteps(plants, wateringCanVolume));
        System.out.println(getCountSteps(plants1, wateringCanVolume1));
    }

    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int waterVolume = wateringCanVolume;

        if (wateringCanVolume <= 0) { // V лейки должен быть натуральным числом
            return 0;
        }

        for (int plant : plants) { // если первоначальный V лейки меньше V одной из грядок возвращаем 0
            if (wateringCanVolume < plant) {
                return 0;
            }
        }

        for (int plant : plants) { // V воды, требуемый грядке, должен быть натуральным числом
            if (plant <= 0) {
                return 0;
            }
        }

        int quantityBeds = plants.length; // используем более одного раза
        int countSteps = 0;

        for (int i = 0; i < quantityBeds; i++) {
            waterVolume = waterVolume - plants[i];
            countSteps++;

            if (i == quantityBeds - 1) {
                return countSteps;
            }

            if (waterVolume <= plants[i]) { // сравниваем имеющийся V с V, требуемым для полива следующей грядки
                countSteps += i + 1;
                waterVolume = wateringCanVolume;

                for (int j = 0; j <= i; j++) { // идем к реке и обратно
                    countSteps++;
                }
            }
        }

        return countSteps;
    }
}