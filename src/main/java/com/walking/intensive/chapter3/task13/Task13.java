package com.walking.intensive.chapter3.task13;

/**
 * Условие: <a href="https://geometry-math.ru/Java-Watering-Plants.html">ПОЛИВ РАСТЕНИЙ</a>
 */
public class Task13 {
    public static void main(String[] args) {
        int[] plants = {2, 2, 1, 2, 5};
        int wateringCanVolume = 5;

        System.out.println("Количество шагов, нужное для полива всех растений: " + getCountSteps(plants, wateringCanVolume));
    }

    static int getCountSteps(int[] plants, int wateringCanVolume) {
        for (int i = 0; i < plants.length; i++){        // Делаем проверку, нет ли растения, требующего больше воды, чем мы можем нести в лейке
            if (wateringCanVolume < plants[i]){
                return 0;
            }
        }

        int currentPosition = -1;                           // Где мы сейчас
        int wateringCanCurrentVolume = wateringCanVolume;   // Сколько воды в лейке сейчас
        int counter = 0;                                    // Заводим счетчик

        while (currentPosition < plants.length - 1) {                        // Пока не польём последнее растение
            currentPosition++;                                               // Смотрим следующее растение

            if (wateringCanCurrentVolume >= plants[currentPosition]) {       // Если в лейке достаточно воды для полива
                wateringCanCurrentVolume -= plants[currentPosition];         // Поливаем растение
                counter++;                                                   // Увеличиваем счётчик (делаем шаг вперед)

            } else {                                                         // Если в лейке недостаточно воды для полива следующего растения
                counter += currentPosition * 2;                              // Идём к реке и возвращаемся на ту позицию, где были
                wateringCanCurrentVolume = wateringCanVolume;                // Теперь у нас полная лейка воды!
                currentPosition--;                                           // Сбрасываем позицию, типа посмотрели, надо заново глянуть
            }
        }

        return counter;
    }
}