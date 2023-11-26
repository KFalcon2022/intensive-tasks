/*Добираясь в школу на трамвае Вова проверяет, является ли купленный билет счастливым. Если является, то нужно загадать
желание и съесть билетик.
Билет содержит 6 цифр, комбинации подбираются случайным образом от 000000 до 999999.
Билет считается счастливым, если сумма первых трех цифр равна сумме последних трех цифр.
Пример: 123411 – счастливый (1 + 2 + 3 = 4 + 1 + 1)
Найдите вероятность выпадения счастливого билета.
P.S. Вероятность – это отношение благоприятных исходов к числу всех исходов. Вероятность не может принимать значение больше 1.
 */

package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {

        System.out.println(calculateProbability());
    }

    public static boolean isHappy(int n) {

        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;

        for (int i = 0; i < 3; i++) {
            lastThreeDigitsSum += n % 10;
            n /= 10;
        }
        for (int i = 0; i < 3; i++) {
            firstThreeDigitsSum += n % 10;
            n /= 10;
        }

        return (firstThreeDigitsSum == lastThreeDigitsSum);
    }

    public static double calculateProbability(){

        double happyCount = 0;
        for (int i = 0; i<=999999; i++){
            if (isHappy(i)){
                happyCount++;
            }
        }
        return happyCount/999999;
    }
}