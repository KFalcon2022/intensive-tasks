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

    public static int getDivisorsSum(int integer) {
        int result = 1;

        for (int i = 2; i < Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                result += i + integer / i;
            }
        }

        return result;
    }

    public static int getMaxFriendlyInt(int maxInteger) {
        int result = 0;
        int sum = 0;

        for (int i = 1; i <= maxInteger; i++) {
            for (int j = i + 1; j <= maxInteger; j++) {
                if ((i == getDivisorsSum(j)) && (getDivisorsSum(i) == j) && (i + j > sum)) {
                    sum = i + j;
                    result = Math.max(i, j);
                }
            }
        }

        return result;
    }
}