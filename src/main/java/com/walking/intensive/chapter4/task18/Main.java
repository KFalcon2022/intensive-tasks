package com.walking.intensive.chapter4.task18;

public class Main {
    public static void main(String[] args) {

        int[] answer = shakerSort(new int[]{9,8,7,6,5,4,3,2,1});
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static int[] shakerSort(int[] array) {

        int leftBorder = 0;
        int rightBorder = array.length-1;
        boolean reshuffle = true;//была перестановка

        while (reshuffle && leftBorder < rightBorder) {
            reshuffle = false;

            for (int i = leftBorder; i < rightBorder; i++) {
                if (array[i] > array[i + 1]) {
                    reshuffle = true;
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }

            rightBorder--;

            for (int i = rightBorder; i > leftBorder; i--) {
                if (array[i] < array[i - 1]) {
                    reshuffle = true;
                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                }
            }

            leftBorder++;

        }

        return array;
    }
}