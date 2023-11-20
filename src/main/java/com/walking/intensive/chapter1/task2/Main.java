package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        House house = new House(2, 3);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер искомой квартиры: ");
        int flatNumber = scanner.nextInt();
        scanner.close();
        System.out.println(house.getFlatLocation(flatNumber));
        System.out.println(house.getFlatAmount());
    }
}