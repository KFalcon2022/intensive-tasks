package src.main.java.com.walking.intensive.chapter2.task8;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число строк треугольника Паскаля: ");
        int rowsAmount = scanner.nextInt();

        scanner.close();

        showPascalTriangle(rowsAmount);
    }

    public static void showPascalTriangle(int rowsAmount) {
        for (int n = 0; n < rowsAmount; n++) {
            System.out.println(pullIndent(n, rowsAmount) + getElements(n));
        }
    }

    public static String getElements(int rowNumber) {
        String elements = "";

        for (int i = 0; i <= rowNumber; i++) {
            elements += getFactorial(rowNumber).divide(getFactorial(i).multiply(getFactorial(rowNumber - i))) + " ";
        }

        return elements.substring(0, elements.length() - 1);
    }

    public static String pullIndent(int rowNumber, int rowsAmount) {
        String indent = "";

        for (int i = getElements(rowNumber).length() / 2; i < getElements(rowsAmount - 1).length() / 2; i++) {
            indent += " ";
        }

        return indent;
    }

    public static BigInteger getFactorial(int number) {
        if (number <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(number).multiply(getFactorial(number - 1));
        }
    }
}