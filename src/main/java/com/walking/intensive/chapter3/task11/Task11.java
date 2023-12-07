package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3};
        System.out.println(getSumSubarraysOddLength(array));
    }
    /**Логика кода основана на том, что каждый элемент массива входит
     * в определенное количество подмассивов нечетной длины.
     * Это количество зависит от позиции элемента в массиве.
     * Код рассчитывает это, используя свойства комбинаторики,
     * что позволяет избежать необходимости явно генерировать все подмассивы.
     * Таким образом, код не требует явного генерирования всех подмассивов.
     * Каждый элемент массива входит в подмассивы нечетной длины и
     * умножает каждый элемент на это количество для получения общей суммы.
     * (до этого я додумался не сам, мне показали)
     * */

    static int getSumSubarraysOddLength(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {

            int end = i + 1;
            int start = n - i;
            int totalSubarrays = start * end;
            int oddSubarrays = (totalSubarrays + 1) / 2;

            sum += array[i] * oddSubarrays;
        }
        return sum;
    }
}