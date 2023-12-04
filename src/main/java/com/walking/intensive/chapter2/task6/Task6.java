package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int digitOne = 2;
        int digitTwo = 10000000;
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
        while (digitTwo !=0) {
            int temp = digitOne % digitTwo;
            digitOne = digitTwo;
            digitTwo = temp;
        }
        return digitOne;
    }

    }

//    static int getNodByEuclideanAlgorithm(int m, int n) {
//        // Ваш код
//        return 0;
//    }

