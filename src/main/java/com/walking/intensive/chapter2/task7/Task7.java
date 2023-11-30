package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(250));
    }

    static int getFriendlyPair(int m) {
        int maxNumber = 0, maxSum = 0, sum1 = 1, sum2 = 1;
        for (int i = m - 1; i > 0; i--) {   //проходим по всем числам от m-1 до 0
            for (int j = 2; j <= Math.sqrt(i); j++) {   //находим сумму множителей первого числа и записываем в sum1
                if (i % j == 0) {
                    sum1 += j;
                    sum1 += i / j;
                }
            }
            //если сумма числа i и сумма множителей числа i больше ранее найденой суммы дружественной пары - идем дальше.
            //если же сумма меньше - то нет смысла считать есть у числа i дружественное число, так как пара нам все равно не подходит.
            if (maxSum < i + sum1) {
                for (int j = 2; j <= Math.sqrt(sum1); j++) {    //сумма множителей второго числа и записываем в sum2
                    if (sum1 % j == 0) {
                        sum2 += j;
                        sum2 += sum1 / j;
                    }
                }
                /*
                 * Проверки(условие слишком громоздкое, мне не нравится, но работает)
                 * 1. Число i не равно сумме множителей числа i(sum1)
                 * 2. Сумма множителей числа sum1 = числу i
                 * 3. Максимальная найденная сумма чисел i и sum1 меньше, чем текущая сумма i и sum1
                 * 4. sum1(сумма множителей числа i) меньше, чем m
                 * 5. sum2(сумма множителей числа sum1) меньше, чем m
                 * Если все условия истины - перезаписываем максимальную сумму и максимальное значение
                 */
                if (sum1 != i && sum2 == i && maxSum < sum1 + i && sum1 < m && sum2 < m) {
                    maxSum = sum1 + i;
                    maxNumber = Math.max(sum1, i);
                }
            }
            sum2 = 1;
            sum1 = 1;
        }
        return maxNumber;
    }
}