package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3};
        System.out.println(getSumSubarraysOddLength(array));
    }

    /**
     * прохожусь по каждому елементу масива
     * генерирую все возможные подмасивы непарной длинны
     * делаю проверку? если масив выходит за границы основного масива, тогда прерываю расчёт
     * (мне подсказали без прирывания выдавало Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5)
     * сумирую елемемнты масива
     */

    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int subArrayLength = 1; subArrayLength <= n; subArrayLength += 2) {
                if (i + subArrayLength > n) {
                    break;
                }
                for (int j = i; j < i + subArrayLength; j++) {
                    sum += array[j];
                }
            }
        }
        return sum;
    }
}