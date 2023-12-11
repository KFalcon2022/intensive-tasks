package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 5, 8, 100, 7, 2, 0, -2, 3, 12, -100, 100};

        System.out.println(Arrays.toString(array));
        sortArrayQuick(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void sortArrayQuick(int[] array, int left, int right) {
        if (right - left == 2) { // Если в массиве два элемента, то, если нужно, меняем их местами и выходим из рекурсии
            if (array[left] > array[right]) {
                int temp = array[left];

                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }
        if (right - left < 2) { // Если в массиве 1 или 0 элемент, выходим из рекурсии

            return;
        }
        int supportElement = getSupportElementValue(array, left, right); // находим среднее арифметическое между меньшим и большим элементами массива
        int delimiter = getSupportElementPosition(array, left, right, supportElement); // Раскидываем меньшие элементы налево, большие направо, указываем, где делить массив

        sortArrayQuick(array, left, delimiter - 1); // Вызываем рекурсию для левой половины
        sortArrayQuick(array, delimiter, right); // Вызываем рекурсию для правой половины
    }

    static int getSupportElementValue(int[] array, int left, int right) { // Метод для определения опорного элемента
        int min = array[left];
        int max = array[left];

        for (int i = left + 1; i <= right; i++) {
            if (min > array[i]) {
                min = array[i]; // Находим минимальный элемент массива
            }
            if (max < array[i]) {
                max = array[i]; // находим максимальный элемент массива
            }
        }

        return (max + min) / 2; // Наш опорный элемент - среднее арифметическое мин и макс элементов массива
    }

    static int getSupportElementPosition(int[] array, int left, int right, int supportElementValue) {
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < supportElementValue) { // Пока элемент i меньше опорного, двигаем i направо
                i++;
            }
            while (array[j] > supportElementValue) { // Пока элемент j больше опорного, двигаем j налево
                j--;
            }
            if (i <= j) { // Если слева есть элемент больше опорного, а справа меньше - меняем их местами
                int temp = array[i];

                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        return i; // указываем позицию опорного элемента для разделения массива
    }
}