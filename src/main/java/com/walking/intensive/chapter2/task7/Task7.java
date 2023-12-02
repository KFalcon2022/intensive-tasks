package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

        System.out.println(getFriendlyPair(1_000_000));

    }

    static int getFriendlyPair(int m){
        if (m < 0 || m > 1_000_000) {

            return m;
        }

        int result = 0;
        int firstFriendlyNumber, secondFriendlyNumber;
        int firstSumFriendlyNumber = 0;

        for (int i = m - 1; i > 0; i--) {
            int tempFirstNum = i;
            int tempSecondNum = getSumOfDivisors(tempFirstNum);
            int tempSecondNumToEqual = 0;
            if (tempFirstNum != tempSecondNum) {
                tempSecondNumToEqual  = getSumOfDivisors(tempSecondNum);
            }
            int tempSumMaxFriendlyPair;

            if (tempFirstNum == tempSecondNumToEqual) {
                if (isMaxFriendlyNumInRange(tempFirstNum, tempSecondNum, m)) {
                    tempSumMaxFriendlyPair = tempFirstNum + tempSecondNum;

                    if (tempSumMaxFriendlyPair > firstSumFriendlyNumber) {
                        firstFriendlyNumber = tempFirstNum;
                        secondFriendlyNumber = tempSecondNum;
                        firstSumFriendlyNumber = firstFriendlyNumber + secondFriendlyNumber;
                        result = Math.max(firstFriendlyNumber, secondFriendlyNumber);
                    }
                }
            }
        }

        return result;
    }

    public static boolean isMaxFriendlyNumInRange(int firstNum, int secondNum, int maxNum) {

        return (Math.max(firstNum, secondNum) < maxNum);
    }

    public static int getSumOfDivisors(int index) {
        int sum = 0;
        for (int i = index - 1; i > 0; i--) {
            if(index % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
