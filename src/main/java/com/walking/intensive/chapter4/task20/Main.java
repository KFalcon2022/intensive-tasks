package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortHeap(array)));
    }

    static int[] sortHeap(int[] array) { // Метод для сортировки массива кучей
        int checkIndex = 0; // переменная для проверки, отсортирован ли массив

        while (checkIndex < array.length / 2 && ((array[checkIndex] < array[checkIndex * 2 + 1] && checkIndex * 2 + 1 < array.length) && (checkIndex * 2 + 2 < array.length && array[checkIndex] < array[checkIndex * 2 + 2]))) { // Идем по массиву, пока элементы соответствуют куче "наоборот"
            checkIndex++;
        }
        if (checkIndex == array.length / 2) {

            return array; // Если все i меньше 2*i+1 и 2*i+2, то массив уже отсортирован, вернуть массив
        }
        for (int i = array.length / 2 - 1; i >= 0; i--) { // начиная с конца первой половины массива
            makeHeap(array, i, array.length); // Строим кучу
        }
        for (int i = array.length - 1; i >= 0; i--) {
            swapElements(array, 0, i); // Меняем нулевой элемент кучи (самый большой) с последним элементом массива
            makeHeap(array, 0, i); // Строим кучу без последнего элемента (отсортированного)
        }

        return array; // Возвращаем отсортированный массив
    }

    static void makeHeap(int[] array, int i, int heapEnd) { // Метод для создания кучи
        int rootIndex = i; // обозначаем индекс корня
        int leftChild = 2 * i + 1; // обозначаем индекс левого потомка
        int rightChild = 2 * i + 2; // обозначаем индекс правого потомка

        if (leftChild < heapEnd && array[leftChild] > array[rootIndex]) { // Если индекс левого потомка входит длину массива и при его значение больше корневого
            rootIndex = leftChild; // назначаем новый корень для последующей рекурсии
        }
        if (rightChild < heapEnd && array[rightChild] > array[rootIndex]) {
            rootIndex = rightChild; // Аналогично проверяем правого потомка
        }
        if (rootIndex != i) { // Если какой-то потомок больше корня
            swapElements(array, i, rootIndex); // Меняем местами потомка с корнем
            makeHeap(array, rootIndex, heapEnd); // Запускаем метод для этого участка еще раз
        }
        // Если ничего не меняли, то выходим из рекурсии
    }

    static void swapElements(int[] array, int firstElementIndex, int secondElementIndex) { // Метод для перестановки элементов массива
        int temp = array[firstElementIndex];

        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = temp;
    }
}