package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(71 / 4);
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        if ((flatNumber < 1) || (flatNumber > (floorAmount * entranceAmount * 4))) {
            return ("Такой квартиры не существует");
        }
        int entranceFound = flatNumber / 4 + 1;
        int floorFound = entranceFound / entranceAmount
            return (flatNumber + " кв - " + (flatNumber / 4 + 1)/ entranceAmount); // Заглушка. При реализации - удалить
    }
}