package com.walking.intensive.chapter4.task17;

public class Main {
    public static void main(String[] args) {


        int[] answer = bubbleSort(new int[]{1, 5, 8, 9});
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static int[] bubbleSort(int[] array) {

        int rightBorder = array.length;
        boolean reshuffle = true;//была перестановка

        while (reshuffle && rightBorder > 0) {
            reshuffle = false;

            for (int i = 0; i < rightBorder - 1; i++) {
                if (array[i] > array[i + 1]) {
                    reshuffle = true;
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }

        return array;
    }
}