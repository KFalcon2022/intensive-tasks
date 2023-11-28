package com.walking.intensive.chapter2.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {    //n - по условию количество этажей

        System.out.println(getPascalTriangle(10));
    }

    static String getPascalTriangle(int n) {
        n--;                //количество этажей теперь будет от нуля
        int element = 0;
        StringBuilder rowBuilder;
        List<String> rowList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            rowBuilder = new StringBuilder();

            for (int k = 0; k <= i; k++) {
                element = getElement(k, i);

                if (k == i) {
                    rowBuilder.append(element);         //к последнему элементу не добавляем пробел
                } else {
                    rowBuilder.append(element).append(' ');
                }
                //теперь есть строка с элементами, где, например, на 10 этаже будет 10 элементов
            }

            rowList.add(rowBuilder.toString());        //заносим в список для последующей работы с ним
        }

        int lastRowLength = rowList.get(rowList.size() - 1).length(); //длина последней строки

        //теперь нужно центрировать строки

        //вариант 1 - самый обобщенный с точки зрения использования Iterator`а

        String interatorObject;
        ListIterator<String> iter = rowList.listIterator();
        while (iter.hasNext()) {
            interatorObject = iter.next();
            iter.set(padLeft(interatorObject, lastRowLength));
        }
/*

        //вариант 2 - самый просто выглядящий, но не до конца понятный в работе collect

        rowList = rowList.stream().map(x -> padLeft(x, lastRowLength))
                .collect(Collectors.toList());

        //вариант 3 - самый простой для Arraylist
        for (int i = 0; i < rowList.size() - 1; i++) {
            rowList.set(i, padLeft(rowList.get(i), lastRowLength));
        }
*/

        return String.join("\n", rowList);
    }

    private static String padLeft(String inputString, int width) {
        return String.format(
                "%" + (inputString.length() + (width - inputString.length()) / 2) + "s",
                inputString);
    }

    private static int getElement(int k, int n) { //вычисляем сочетания C из n по k - элементы таблицы

        return getFactorial(n) / (getFactorial(k) * getFactorial(n - k));
    }

    private static int getFactorial(int currentNumber) {

        return (currentNumber <= 1) ? 1 : currentNumber * getFactorial(currentNumber - 1);
    }
}