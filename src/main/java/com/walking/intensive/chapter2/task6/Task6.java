package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int digitOne = 18;
        int digitTwo = 12;
        System.out.println(getNoc(digitOne, digitTwo));
        System.out.println(getNod(digitOne, digitTwo));
    }

    static int getNoc(int digitOne, int digitTwo) {
        if (digitOne == 0 || digitTwo == 0) {
            return 0;
        }

        int digitOneAbs = Math.abs(digitOne);
        int digitTwoAbs = Math.abs(digitTwo);
        int digitMax = Math.max(digitOneAbs, digitTwoAbs);
        int digitMin = Math.min(digitOneAbs, digitTwoAbs);
        int noc = digitMax;
        while (noc % digitMin != 0) {
            noc += digitMax;
        }
        return noc;
    }

    static int getNod(int digitOne, int digitTwo) {
        while (digitOne != digitTwo) {
            if (digitOne > digitTwo) {
                digitOne = digitOne - digitTwo;
            } else {
                digitTwo = digitTwo - digitOne;
            }
        }
        return digitOne;

    }

//    static int getNodByEuclideanAlgorithm(int m, int n) {
//        // Ваш код
//        return 0;
//    }

}