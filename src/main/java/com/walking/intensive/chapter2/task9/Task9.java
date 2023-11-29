package com.walking.intensive.chapter2.task9;

public class Task9 {
    public static void main(String[] args) {
        int n = 25; // Установка количества уровней треугольника Паскаля
        System.out.println(getPascalTriangle(n)); // Вывод треугольника на экран
    }

    // Метод для центрирования строки внутри строки определенной длины
    static String getCenteredRow(int maxRowLength, String row) {
        int paddingSize = (maxRowLength - row.length()) / 2; // Вычисление количества пробелов для вставки слева
        String padding = " ".repeat(paddingSize); // Создание строки с пробелами для левого отступа
        // Возвращение строки с пробелами слева, самой строки и пробелами справа
        // Если общая длина должна быть нечетной, добавляется дополнительный пробел справа
        return padding + row + padding + (maxRowLength % 2 != row.length() % 2 ? " " : "");
    }

    // Главный метод для генерации треугольника Паскаля
    static String getPascalTriangle(int n) {
        StringBuilder builder = new StringBuilder(); // Используется для построения всего треугольника
        int maxRowLength = calculateRowWidth(n - 1); // Вычисление длины самой длинной строки в треугольнике

        // Построение каждого уровня треугольника
        for (int i = 0; i < n; i++) {
            StringBuilder rowBuilder = new StringBuilder(); // Используется для построения отдельного уровня
            int number = 1; // Первое число в каждом уровне всегда 1
            // Построение строки с числами треугольника Паскаля
            for (int j = 0; j <= i; j++) {
                if (j > 0) rowBuilder.append(" "); // Добавление пробела между числами
                rowBuilder.append(number); // Добавление числа в строку
                // Расчет следующего числа в строке с использованием коэффициентов
                number = number * (i - j) / (j + 1);
            }
            // Центрирование построенной строки и добавление ее в общий треугольник
            String centeredRow = getCenteredRow(maxRowLength, rowBuilder.toString());
            builder.append(centeredRow).append("\n");
        }

        return builder.toString(); // Возвращение итогового треугольника в виде строки
    }

    // Метод для вычисления длины строки треугольника на определенном уровне
    static int calculateRowWidth(int row) {
        int number = 1; // Начинаем с первого числа
        int width = 1; // Начальная ширина строки
        // Вычисление ширины строки путем последовательного добавления длин чисел и пробелов между ними
        for (int i = 1; i <= row; i++) {
            number = number * (row - i + 1) / i;
            width += (int) (Math.log10(number) + 2); // Добавление длины числа и пробела после него
        }
        return width - 1; // Уменьшаем на один, так как после последнего числа пробел не ставится
    }
}