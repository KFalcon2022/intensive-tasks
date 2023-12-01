package com.walking.intensive.chapter2.task7;

/*КУРСОВАЯ ЗАДАЧА - ДРУЖЕСТВЕННАЯ ПАРА

Пятиклассник Ваня придумал забаву. Он ввел понятие "дружественной пары" чисел. Два различных натуральных числа n и m он
назвал дружественными, если сумма делителей числа n (включая 1, но исключая само n) равна числу m и наоборот.
Например, 220 и 284 – дружественные числа:
Cписок делителей для 220: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 и их сумма равна 284;
Cписок делителей для 284: 1, 2, 4, 71, 142 и сумма равна 220.
Максимальное дружественное число из пары не должно превышать N, где N число, вводимое в метод в качестве аргумента.
(N < 1 000 000)
Метод должен вернуть наибольшее число из пары дружественных чисел, сумма дружественных чисел которой максимальна среди
всех пар дружественных чисел, большее из которых меньше N.
P.S. Не использовать массивы и прочие темы, которые пока не были затронуты в курсе.

 */
public class Main {
    public static void main(String[] args) {

        int n1 = 220;
        int n2 = 285;
        int n3 = 1211;
        int n4 = 2925;
        int n5 = 5565;

        System.out.println(getMaxValueOfAmicablePairLessThanN(n1));
        System.out.println(getMaxValueOfAmicablePairLessThanN(n2));
        System.out.println(getMaxValueOfAmicablePairLessThanN(n3));
        System.out.println(getMaxValueOfAmicablePairLessThanN(n4));
        System.out.println(getMaxValueOfAmicablePairLessThanN(n5));
    }

    public static int getMaxValueOfAmicablePairLessThanN(int n) {

        for (int i = n - 1; i > 0; i--) { //

            //Ищем сумму делителей i, сравниваем ее с i на наличие дружественной пары, возвращаем i, если оно максимальное в паре
            int dividersSum = getDividersSum(i);

            if (i == getDividersSum(dividersSum) && i > dividersSum) {
                return i;
            }
        }
        return 0;
    }

    /**
     * поиск суммы делителей заданного n
     */
    public static int getDividersSum(int n) {

        int result = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }
}