package com.walking.intensive.chapter2.task7;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(findMaxFriendlyNumber(-1_000));
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

                if (sum < Math.abs(N) && sum > maxSum) {
                    maxSum = sum;
                    maxNumber = n;
                }
            }
            return maxNumber;

        } catch (IllegalArgumentException e) {
            System.out.println("Значение N за пределами допустимого диапазона: " + e.getMessage());
            return 0;
        }
    }
}

