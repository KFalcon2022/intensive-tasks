/*��������� � ����� �� ������� ���� ���������, �������� �� ��������� ����� ����������. ���� ��������, �� ����� ��������
������� � ������ �������.
����� �������� 6 ����, ���������� ����������� ��������� ������� �� 000000 �� 999999.
����� ��������� ����������, ���� ����� ������ ���� ���� ����� ����� ��������� ���� ����.
������: 123411 � ���������� (1 + 2 + 3 = 4 + 1 + 1)
������� ����������� ��������� ����������� ������.
P.S. ����������� � ��� ��������� ������������� ������� � ����� ���� �������. ����������� �� ����� ��������� �������� ������ 1.
 */

package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {

        System.out.println(calculateProbability());
    }

    public static boolean isHappy(int n) {

        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;

        for (int i = 0; i < 6; i++) {
            if (i >= 3) {
                lastThreeDigitsSum += n % 10;
            } else {
                firstThreeDigitsSum += n % 10;
            }
            n /= 10;
        }
        return (firstThreeDigitsSum == lastThreeDigitsSum);
    }

    public static double calculateProbability() {

        double happyCount = 0;
        for (int i = 0; i <= 999999; i++) {
            if (isHappy(i)) {
                happyCount++;
            }
        }
        return happyCount / 1000000;
    }
}