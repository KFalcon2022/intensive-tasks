package com.walking.intensive.chapter2.task7;

public class Main {
    public static void main(String[] args) {
        int max = 1000000;

        System.out.println("���������� ����� �� ���� ������������� �����, ����� ������� ����������� ����� ���� ��� ������������� �����, ������� �� ������� ������ " + max + ": " + findAmicableNumbers(max));
    }

    static int findAmicableNumbers(int max) {
        int first, second = 0, firstSum, secondSum, firstAmicable = 0, secondAmicable = 0;

        for (first = 0; first < max; first++) { // ���� ������������� ������������� ����� �� �������� �������� �����
            firstSum = getDividerSum(first);
            secondSum = getDividerSum(firstSum);

            if (first == secondSum) { //����������, ��������� �� ������ ����� ����� ��������� �������
                second = firstSum; //���� ��, �� ����������� ������� ����� �������� ����� ������� �����
            }

            if (first == secondSum && second == firstSum && first + second > firstAmicable + secondAmicable && second < max && first != second) { // ���������, ��������� �� ������ ����� ����� ��������� ������� �����, � ������ ����� ��������� �� ����� ��������� ������� �����
                firstAmicable = first; // ���� ��, ��������� ������������
                secondAmicable = second;
                 //System.out.println(firstAmicable + " " + secondAmicable); // ��� ��� ��������
            }
        }

        return Math.max(firstAmicable, secondAmicable);
    }

    static int getDividerSum(int limit) {
        int dividerSum = 0;

        for (int i = 1; i * i < limit; i++) {
            if (limit % i == 0) { // ���� �������� ������� �����
                if (i == 1 || i == limit / i) {
                    dividerSum += i; // ����� ��������� ������� �����
                } else {
                    dividerSum += i + limit / i;
                }
            }
        }
        return dividerSum;
    }
}