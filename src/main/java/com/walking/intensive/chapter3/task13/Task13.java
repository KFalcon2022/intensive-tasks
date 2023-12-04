package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println(getCountSteps(new int[]{7, 7, 7, 7, 7, 7, 7}, 8 ));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
       int count = 1;
       int waterResidue = wateringCanVolume;

        for (int i = 1; i < plants.length; i++) {
            if (waterResidue - plants[i - 1] < plants[i] ) {
                count += i * 2 + 1;
                waterResidue = wateringCanVolume;
            }
            else {
                count++;
                waterResidue -= plants [i - 1];
            }
        }

        return count;
    }
}