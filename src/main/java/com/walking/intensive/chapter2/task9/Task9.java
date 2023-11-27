package com.walking.intensive.chapter2.task9;

public class Task9 {
    public static void main(String[] args) {
    getPascal(12);
    }
    public static void getPascal (int number){

    long position = 1;
        for(int i = 0; i < number; i++) {
        for(int whitespace = 1; whitespace < number - i; ++whitespace) {
            System.out.print("   ");
        }

        for(int j = 0; j <= i; j++) {
            if (j == 0 || i == 0)
                position = 1;
            else
                position = position * (i - j + 1) / j;

            System.out.printf("%6d", position);
        }

        System.out.println();
    }
}
}

