package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            int[] numbers = {10, 11, 1, 5, 8, 16, -4};

            System.out.println(Arrays.toString(sortArray(numbers)));
        }

        public static int[] sortArray(int[] numbers) {
            boolean swap = true;

            while (swap) {
                swap = false;
                for (int i = 0; i < numbers.length - 1; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        swap = true;
                        int tmp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = tmp;
                    }
                }
            }

            return numbers;
        }
    }