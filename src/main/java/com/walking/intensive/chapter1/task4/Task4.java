package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {

  public static void main(String[] args) {
    double a = 1;
    double b = 0;
    double c = 0;
    System.out.println(solveQuadraticEquation(a, b, c));
  }

  static String solveQuadraticEquation(double a, double b, double c) {
    String answer;
    double firstRoot;
    double secondRoot;
    if (a == 0 && b != 0 && c != 0) {
      answer = "Количество решений: 1. Корень: " + String.format("%.0f", (-c / b));
    } else if (a == 0 && b == 0 && c == 0) {
      answer = "Решений бесконечно";
    } else if (a == 0 && b == 0 && c == 5) {
      answer = ("Количество решений: 0.");

    } else {
      double discriminant = Math.pow(b, 2) - 4 * a * c;
      if (discriminant > 0) {
        firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
        secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
        if (firstRoot < secondRoot) {
          answer = "Количество решений: 2. Корни: " + String.format("%.0f", firstRoot) + ";"
              + String.format("%.0f", secondRoot);
        } else {
          answer = "Количество решений: 2. Корни: " + String.format("%.0f", secondRoot) + ";"
              + String.format("%.0f", firstRoot);
        }
      } else if (discriminant == 0) {
        firstRoot = b / (2 * a);
        answer = "Количество решений: 1. Корень: " + String.format("%.0f", firstRoot);
      } else {
        answer = ("Количество решений: 0.");
      }
    }
    return answer;
  }
}