package main.java.com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println(getSumSubarraysOddLength(new int[]{1, 4, 2, 5, 3}));
    }

    public static int getSumSubarraysOddLength(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
            for (int j = array.length - 1; j > i; j--) {
                if ((j - i) % 2 == 0) {
                    result += sumArray(i, j, array);
                }
            }
        }
        return result;
    }

    static int sumArray(int i, int j, int[] array) {
        int sumArray = 0;
        for (int k = i; k <= j; k++) {
            sumArray += array[k];
        }
        return sumArray;
    }
}