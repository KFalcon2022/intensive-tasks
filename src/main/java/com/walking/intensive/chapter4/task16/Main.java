package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 3, 4, 8, 2, 1};

        System.out.println(Arrays.toString(selectionSort(numbers)));
    }

    public static int[] selectionSort(int[] numbers) {
        int lengthArray = numbers.length;

        for (int i = 0; i < lengthArray - 1; i++) {
            int min = numbers[i];
            int indexMin = i;
            for (int j = i + 1; j < lengthArray; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexMin = j;
                }
            }
            swap(numbers, i, indexMin);
        }

        return numbers;
    }

    private static void swap(int[] numbers, int a, int b) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }
}
/*
 ����� �� ��������� ����� ��������� ��� ����� ����������,
 � ������ ��������� ��� ������ ����� ���� � ����� selectionSort
 ����� ��� ���������� � �� ���� �� ������� ������� ��� �� ��������)
*/
