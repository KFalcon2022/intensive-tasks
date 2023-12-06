package src.main.java.com.walking.intensive.chapter2.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите максимальное дружественное число (меньше 1 000 000): ");
        int friendlyIntLimit = scanner.nextInt();

        scanner.close();

        if (friendlyIntLimit >= 1000000) {
            System.out.println("Вы ввели число более 1 000 000.");
        } else {
            System.out.printf("Наибольшее число из пары дружественных чисел до %d: %d", friendlyIntLimit, getMaxFriendlyNumber(friendlyIntLimit));
        }
    }

    public static int getMaxFriendlyNumber(int maxInteger) {
        int maxSum = 0;
        int result = 0;

        for (int i = 1; i <= maxInteger; i++) {
            int friendlyNumberCandidate = getDivisorsSum(i);

            if (isFriendlyPair(i, maxInteger) && i + friendlyNumberCandidate > maxSum && friendlyNumberCandidate < maxInteger) {
                maxSum = i + friendlyNumberCandidate;
                result = Math.max(i, friendlyNumberCandidate);
            }
        }

        return result;
    }

    public static int getDivisorsSum(int number) {
        int result = 1;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (i == Math.sqrt(number)) {
                    result += i;
                } else {
                    result += i + number / i;
                }
            }
        }

        return result;
    }

    public static boolean isFriendlyPair(int number, int maxInteger) {
        int friendlyNumberCandidate = getDivisorsSum(number);
        return number != friendlyNumberCandidate && number == getDivisorsSum(friendlyNumberCandidate);
    }
}