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
        if (wateringCanVolume < 1) {
            System.out.println("Неверное значение объёма лейки");
            return 0;
        }

        if (plants.length < 1) {
            System.out.println("В грядке нет растений");
            return 0;
        }

        int waterRequirement = 0;

        for (int plant : plants) {
            waterRequirement += plant;
        }

        if (waterRequirement == 0) {
            System.out.println("Тут одни кактусы и сорняки, их не нужно поливать");
            return 0;
        }

        int stepsAmount = 0;
        int waterAmount = wateringCanVolume;

        for (int j = 0; j < plants.length; j++) {
            if (!(waterAmount == 0 || waterAmount < plants[j])) {
                stepsAmount++;

                if (plants[j] == 0) {
                    continue;
                } else {
                    while (plants[j] > 0) {
                        int waterBuffer = waterAmount;
                        waterAmount = getRemainingWaterInCan(waterAmount, plants[j]);
                        plants[j] = getRemainingWaterRequirement(waterBuffer, plants[j]);

                        if (plants[j] > 0) {
                            stepsAmount = stepsAmount + j * 2 + 2;
                            waterAmount = wateringCanVolume;
                        }
                    }
                }

            } else {
                stepsAmount = stepsAmount + j * 2 + 1;
                waterAmount = wateringCanVolume;

                while (plants[j] > 0) {
                    int waterBuffer = waterAmount;
                    waterAmount = getRemainingWaterInCan(waterAmount, plants[j]);
                    plants[j] = getRemainingWaterRequirement(waterBuffer, plants[j]);

                    if (plants[j] > 0) {
                        stepsAmount = stepsAmount + j * 2 + 2;
                        waterAmount = wateringCanVolume;
                    }
                }
            }
        }

        return stepsAmount;
    }

    public static int getRemainingWaterInCan(int waterAmount, int plantWaterRequirement) {
        int result = waterAmount - plantWaterRequirement;
        return Math.max(result, 0);
    }

    public static int getRemainingWaterRequirement(int waterAmount, int plantWaterRequirement) {
        int result = plantWaterRequirement - waterAmount;
        return Math.max(result, 0);
    }
}