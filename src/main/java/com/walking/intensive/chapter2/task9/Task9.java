package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        int n = 20; // Вы можете установить количество уровней треугольника
        System.out.println(getPascalTriangle(n));
    }

    static String getPascalTriangle(int n) {
        StringBuilder builder = new StringBuilder();
        // Рассчитываем максимальную ширину строки в треугольнике
        int maxRowWidth = calculateMaxRowWidth(n);
        for (int i = 0; i < n; i++) {
            int number = 1;
            // Расчет начальных пробелов для центровки строки
            int leadingSpaces = (maxRowWidth - calculateRowWidth(i)) / 2;
            builder.append(" ".repeat(leadingSpaces));

            for (int j = 0; j <= i; j++) {
                builder.append(number);
                number = number * (i - j) / (j + 1);
                // Добавляем пробелы после каждого числа, кроме последнего в строке
                if (j < i) {
                    builder.append(" ");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    // Расчет максимальной ширины строки в треугольнике
    static int calculateMaxRowWidth(int n) {
        int number = 1;
        int width = 1;
        // Перебираем числа для последнего уровня треугольника
        for (int i = 1; i < n; i++) {
            number = number * (n - i) / i;
            // Увеличиваем общую ширину на количество знаков в числе + пробел
            width += (int)(Math.log10(number) + 2);
        }
        return width;
    }

    // Расчет ширины текущей строки в треугольнике
    static int calculateRowWidth(int row) {
        int number = 1;
        int width = 1;
        // Перебираем числа для текущего уровня треугольника
        for (int i = 1; i <= row; i++) {
            number = number * (row - i + 1) / i;
            // Увеличиваем общую ширину на количество знаков в числе + пробел
            width += (int)(Math.log10(number) + 2);
        }
        // Уменьшаем на один, так как после последнего числа пробел не нужен
        return width - 1;
    }
}