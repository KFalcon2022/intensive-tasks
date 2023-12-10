package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 2, 1, 5, 6, 3, 3};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortArray(array)));
    }

    static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; // Назначаем самый левый элемент массива минимальным

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) { //Сравниваем все последующие элементы с минимальным
                    minIndex = j; // Если элемент меньше минимального, то он новый минимальный.
                }
            }
            int temp = array[i]; // Временная переменная для сохранения первого элемента

            array[i] = array[minIndex]; // Первому элементу присваиваем значение минимального
            array[minIndex] = temp; // // И бывший минимальный элемент получает значение первого
        }

        return array;
    }
}