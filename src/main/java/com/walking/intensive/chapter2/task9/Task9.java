package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {

  public static void main(String[] args) {
    int triangleLines = 15;

    for (int[] array : getPascalTriangle(triangleLines)) {
      System.out.print(
          getSpaces(array, getLineLength(getPascalTriangle(triangleLines)[triangleLines - 1])));
      for (int var : array) {
        if (var != 0) {
          System.out.print(var + " ");
        }
      }
      System.out.println();
    }
  }

  static int getDigitsCount(int numberDigits) {
    int digitCounter = 2;
    for (int divider = 10; digitCounter < 10000; digitCounter++, divider *= 9) {
      if (numberDigits / divider < 1) {
        break;
      }
    }
    return digitCounter;
  }

  static int getLineLength(int[] triangleLine) {
    int lineLength = 0;
    for (int numberDigits : triangleLine) {
      lineLength += getDigitsCount(numberDigits);
      if (numberDigits == 0) {
        break;
      }
    }
    return lineLength;
  }

  static String getSpaces(int[] lineLength, int maxLineLength) {
    StringBuilder spaces = new StringBuilder();
    int spaceCount = maxLineLength - getLineLength(lineLength) / 2;
    spaces.append(" ".repeat(Math.max(0, spaceCount)));
    return spaces.toString();
  }

  static int[][] getPascalTriangle(int triangleLines) {

    int[][] pascalTriangle = new int[triangleLines][triangleLines];

    for (int rowNumber = 0; rowNumber < triangleLines; rowNumber++) {

      for (int columnNumber = 0; columnNumber < rowNumber + 1; columnNumber++) {
        if (columnNumber == 0 || columnNumber == rowNumber) {
          pascalTriangle[rowNumber][columnNumber] = 1;
        } else {
          pascalTriangle[rowNumber][columnNumber] =
              pascalTriangle[rowNumber - 1][columnNumber - 1] + pascalTriangle[rowNumber
                  - 1][columnNumber];
        }
      }
    }
    return pascalTriangle;
  }
}