package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {
        int max = 1000000;

        System.out.println("���������� ����� �� ���� ������������� �����, ����� ������� ����������� ����� ���� ��� ������������� �����, ������� �� ������� ������ " + max + ": " + findAmicableNumbers(max));
    }
    static int findAmicableNumbers(int max) {
        int first, second = 0, firstSum = 0, secondSum = 0, firstAmicable = 0, secondAmicable = 0;
        for (first = 0; first < max; first++) { // ���� ������������� ������������� ����� �� �������� �������� �����
            for (int i = 1; i * i < first; i++) {
                if (first % i == 0) { // ���� �������� ������� �����
                    if (i == 1 || i == first / i) {
                        firstSum += i; // ����� ��������� ������� �����
                    } else {
                        firstSum += i + first / i;
                    }
                }
            }
            for (int i = 1; i * i < firstSum; i++) {
                if (firstSum % i == 0) { //���� �������� ������� �����
                    if (i == 1 || i == firstSum / i) {
                        secondSum += i;
                    } else {
                        secondSum += i + firstSum / i;
                    }
                }
                if (first == secondSum) { //����������, ��������� �� ������ ����� ����� ��������� �������
                    second = firstSum; //���� ��, �� ����������� ������� ����� �������� ����� ������� �����
                }
            }
            if (first == secondSum && second == firstSum && first + second > firstAmicable + secondAmicable && second < max) { // ���������, ��������� �� ������ ����� ����� ��������� ������� �����, � ������ ����� ��������� �� ����� ��������� ������� �����
                firstAmicable = first; // ���� ��, ��������� ������������
                secondAmicable = second;
                System.out.println(firstAmicable + " " + secondAmicable); // ��� ��� ��������
            }
            firstSum = 0;
            secondSum = 0;
        }
        return Math.max(firstAmicable, secondAmicable);
    }
}