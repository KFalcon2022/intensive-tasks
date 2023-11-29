package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {

  public static void main(String[] args) {
    double a = 2;
    double b = 3;
    double c = -5;
    System.out.println(solveQuadraticEquation(a, b, c));
  }

  static String solveQuadraticEquation(double a, double b, double c) {

    if (a == 0 && b != 0 && c != 0) {
      return "Количество решений: 1. Корень: " + (int) (-c / b);
    }

    if (a == 0 && b == 0 && c == 0) {
      return "Количество решений бесконечно.";
    }

    if (a == 0 && b == 0) {
      return "Количество решений: 0.";
    }

    double discriminant = Math.pow(b, 2) - 4 * a * c;
    if (discriminant > 0) {
      double firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
      double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
      return firstRoot < secondRoot ? "Количество решений: 2. Корни: " + (int) firstRoot + ";"
          + (int) secondRoot
          : "Количество решений: 2. Корни: " + (int) secondRoot + ";" + (int) firstRoot;
    }

    if (discriminant == 0) {
      return "Количество решений: 1. Корень: " + (int) (b / (2 * a));
    }

    return ("Количество решений: 0.");
  }
}
