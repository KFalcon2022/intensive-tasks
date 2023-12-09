package com.walking.intensive.chapter3.task12;

public class Main {
    public static void main(String[] args) {

        int[] answer = getNumberOfMovements("0010115");
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {

        int arrayLenght = baskets.length();
        int[] answer = new int[arrayLenght];
        char ball = '1';
        char noBall = '0';

        for (int i = 0; i < arrayLenght; i++) {
            if (baskets.charAt(i) == ball) {
                //встретившийся мячик пытаемся положить по всем корзинам
                for (int j = 0; j < arrayLenght; j++) {
                    answer[j] += Math.abs(i - j);
                }
            } else if (baskets.charAt(i) != noBall) {
                return new int[arrayLenght]; //возврат пустого значения, если встретилось не 0 и не 1
            }
        }

        return answer;
    }
}