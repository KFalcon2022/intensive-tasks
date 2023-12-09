package com.walking.intensive.chapter3.task13;

public class Main {
    public static void main(String[] args) {

        System.out.println(getCountSteps(new int[]{7, 7, 7, 7, 7, 7, 7}, 5));

    }

    /**
     * Получить количество шагов необходимых для полива всех растений.
     *
     * @param plants            массив с количеством литров воды необходимому i-му растению
     * @param wateringCanVolume объем лейки
     * @return количество шагов необходимое для полива всех растений
     */
    static int getCountSteps(int[] plants, int wateringCanVolume) {

        for (int i = 0; i < plants.length; i++) {
            if (wateringCanVolume < plants[i]) {//полить невозможно
                return 0;
            }
        }

        int stepsAmount = 0;
        int plantPointer = 0; //указатель на ближайшее неполитое растение

        while (true) { //цикл по раундам: взяли воду, поливаем пока не кончится вода

            int waterAmount = wateringCanVolume;//налили воды в лейку

            while (plantPointer < plants.length && waterAmount > 0) { //поливаем, пока не кончатся растения или вода

                if (waterAmount >= plants[plantPointer]) {//хватает воды для полива
                    waterAmount -= plants[plantPointer]; //поливаем
                    plantPointer++; //переводим указатель на следующее не политое растение
                } else {
                    waterAmount = 0; //не хватет воды на след. растение, в гневе разливаем воду вокруг
                }
            }

            if (plantPointer < plants.length) {//еще есть неполитые, нужно вернуться к реке
                stepsAmount += 2 * plantPointer;
            } else {
                stepsAmount += plantPointer;
                break;
            }
        }
        return stepsAmount;
    }
}