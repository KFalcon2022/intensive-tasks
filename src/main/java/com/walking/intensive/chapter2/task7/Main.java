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
            System.out.printf("Наибольшее число из пары дружественных чисел до %d: %d", friendlyIntLimit, getMaxFriendlyInt(friendlyIntLimit));
        }
    }

    public static int getDivisorsSum(int number) {
        int result = 1;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                result += i + number / i;
            }
        }

        return result;
    }

    public static int getMaxFriendlyInt(int maxInteger) {
        int maxSum = 0;
        int result = 0;

        for (int i = 1; i <= maxInteger; i++) {
            int divisorSum = getDivisorsSum(i);

            if (isFriendlyPair(i, maxInteger) && i + divisorSum > maxSum) {
                maxSum = i + divisorSum;
                result = Math.max(i, divisorSum);
            }
        }

        return result;
    }

    public static boolean isFriendlyPair(int number, int maxInteger) {
        return number != getDivisorsSum(number) && number == getDivisorsSum(getDivisorsSum(number)) && getDivisorsSum(number) < maxInteger;
    }
}