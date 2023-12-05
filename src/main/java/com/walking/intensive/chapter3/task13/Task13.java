package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println(getCountSteps(new int[]{2, 7, 8, 9}, 12));
    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {
        int result = 0;
        int index = 0;

        for (int i = 0; i <= plants.length; i = index) {

            result += index;
            int sum = 0;

            do {
                sum += plants[index];
                index++;
                result++;

                if (index == plants.length) {
                    return result;
                }
            }
            while ((sum + plants[index]) < wateringCanVolume);

            sum = 0;
            result += index;
        }
        return result;

    }
}
