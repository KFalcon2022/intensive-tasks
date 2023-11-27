package com.walking.intensive.chapter2.task7;

public class Task7 {

    public static void main(String[] args) {

        System.out.println(findMaxFriendlyNumber(1184 + 1210);
    }

    public static int findMaxFriendlyNumber(int N) {
        try {
            if (Math.abs(N) >= 1_000_000) {
                throw new IllegalArgumentException("N должно быть меньше 1,000,000");
            }
            int maxSum = 0;
            int maxNumber = 0;
            for (int n = 1; n < Math.abs(N); n++) {
                int sum = 0;
                for (int i = 1; i <= n / 2; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }
                if (sum > n && sum < N) {
                    int pairSum = 0;
                    for (int i = 1; i <= sum / 2; i++) {
                        if (sum % i == 0) {
                            pairSum += i;
                        }
                    }
                    if (pairSum == n && sum > maxSum && sum < N) {
                        maxNumber = sum;
                            maxSum = n;
                    }
                }
            }
            if (maxNumber == 0) {
                throw new IllegalArgumentException("У заданного числа нет дружественных пар.");
            }
            return maxNumber;
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return 0;
        }
    }
}


