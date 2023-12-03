package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] b = {1,4,2,5,3,7,6,3,4,5,6,7};
        System.out.println(getSumSubarraysOddLength(b));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;
        for (int i = 1; i <= array.length ; i+=2) {
            sum += getAllSumSubArraysFixedLength(array, i);
        }
        return sum;
    }

    static int getAllSumSubArraysFixedLength(int[] arr, int k) {
        final int n = arr.length;
        int[] work = new int[k + 2];
        init(k, work, n);

        int j = 0;
        while (true) {
            getSumInfo(arr, work, k);
            while( work[j] + 1 == work[j + 1]) {
                if(work[j] != j) {
                    work[j] = j;
                }
                j += 1;
            }
            if(j >= k){
                break;
            } else {
                work[j] = work[j] + 1;
                j = 0;
            }
        }
        return 0;
    }

    private static void init(int k, int[] work, int n) {
        for (int i = 0; i < k; i++) {
            work[i] = i;
        }
        work[k] = n;
        work[k + 1] = 0;
    }

    private static int getSumInfo(int[] data ,int[] work,  int k) {
        int sum = 0;
        System.out.print("[");
        for (int i = 0; i < k; i++) {
            System.out.print(data[work[i]]);
            sum += data[work[i]];
            if(k> 1 && i + 1 < k ){
                System.out.print(", ");
            }
        }
        System.out.println("] = "+ sum);
        return sum;
    }
}