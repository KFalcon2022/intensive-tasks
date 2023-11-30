package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {

  public static void main(String[] args) {
    double sideA = 3;
    double sideB = 6;
    double sideC = 5;

    if (checkExistence(sideA, sideB, sideC)) {
      System.out.printf("Площадь треугольника по формуле Герона = %.2f.\n",
          getAreaByHeron(sideA, sideB, sideC));

      System.out.print("Длины высот треугольника: ");
      for (double i : getHeights(sideA, sideB, sideC)) {
        System.out.printf("%.0f ", i);
      }
      System.out.println();

      System.out.print("Длины медиан треугольника: ");
      for (double i : getMedians(sideA, sideB, sideC)) {
        System.out.printf("%.2f ", i);
      }
      System.out.println();

      System.out.print("Длины медиан треугольника: ");
      for (double i : getMedians(sideA, sideB, sideC)) {
        System.out.printf("%.2f ", i);
      }
      System.out.println();

      System.out.print("Длины биссектрис треугольника: ");
      for (double i : getBisectors(sideA, sideB, sideC)) {
        System.out.printf("%.2f ", i);
      }
      System.out.println();

      System.out.print("Углы треугольника: ");
      for (double i : getAngles(sideA, sideB, sideC)) {
        System.out.printf("%.2f ", i);
      }
      System.out.println();

      System.out.printf("Длина радиуса вписанной в треугольник окружности: %.2f\n",
          getInscribedCircleRadius(sideA, sideB, sideC));
      System.out.printf("Длина радиуса описанной вокруг треугольника окружности: %.2f\n",
          getCircusRadius(sideA, sideB, sideC));
      System.out.printf("Площадь треугольника черезе синус и косинус: %.2f\n",
          getAreaAdvanced(sideA, sideB, sideC));
    } else {
      System.out.println("Треугольник вырожденным и не существует");
    }
  }

  static boolean checkExistence(double a, double b, double c) {
    return a + b > c && b + c > a && a + c > b;
  }

  static double getAreaByHeron(double a, double b, double c) {
    double semiPerimeter = 0.5 * (a + b + c);
    return Math.sqrt(
        semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
  }

  static double[] getHeights(double a, double b, double c) {
    double heightA = 2 * getAreaByHeron(a, b, c) / a;
    double heightB = 2 * getAreaByHeron(a, b, c) / b;
    double heightC = 2 * getAreaByHeron(a, b, c) / c;
    double[] heightArr = {heightA, heightB, heightC};
    Arrays.sort(heightArr);
    return heightArr;
  }

  static double[] getMedians(double a, double b, double c) {
    double medianA =
        (0.5) * Math.sqrt((2 * Math.pow(b, 2)) + (2 * Math.pow(c, 2)) - Math.pow(a, 2));
    double medianB =
        (0.5) * Math.sqrt((2 * Math.pow(a, 2)) + (2 * Math.pow(c, 2)) - Math.pow(b, 2));
    double medianC =
        (0.5) * Math.sqrt((2 * Math.pow(a, 2)) + (2 * Math.pow(b, 2)) - Math.pow(c, 2));
    double[] medianArr = {medianA, medianB, medianC};
    Arrays.sort(medianArr);
    return medianArr;
  }

  static double[] getBisectors(double a, double b, double c) {
    double bisectorA = Math.sqrt((b * c) * (a + b + c) * (b + c - a)) / (b + c);
    double bisectorB = Math.sqrt((a * c) * (a + b + c) * (a + c - b)) / (a + c);
    double bisectorC = Math.sqrt((a * b) * (a + b + c) * (a + b - c)) / (a + b);
    double[] bisectorArr = {bisectorA, bisectorB, bisectorC};
    Arrays.sort(bisectorArr);
    return bisectorArr;
  }

  static double[] getAngles(double a, double b, double c) {
    double angleA = Math.abs(Math.toDegrees(
        Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))));
    double angleC = Math.abs(Math.toDegrees(
        Math.acos((Math.pow(b, 2) + Math.pow(a, 2) - Math.pow(c, 2)) / (2 * b * a))));
    double angleB = 180 - (angleA + angleC);
    double[] angleArr = {angleA, angleB, angleC};
    Arrays.sort(angleArr);
    return angleArr;
  }

  static double getInscribedCircleRadius(double a, double b, double c) {
    double semiPerimeter = 0.5 * (a + b + c);
    return Math.sqrt(
        (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c) / semiPerimeter);
  }

  static double getCircusRadius(double a, double b, double c) {
    double semiPerimeter = 0.5 * (a + b + c);
    return (a * b * c) / (4 * Math.sqrt(
        semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c)));
  }

  static double getAreaAdvanced(double a, double b, double c) {
    double cosA = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
    double sinA = Math.sqrt(1 - Math.pow(cosA, 2));
    return 0.5 * a * c * sinA;
  }
}