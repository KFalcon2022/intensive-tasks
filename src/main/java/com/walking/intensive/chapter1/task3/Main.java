package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main
{
    public static void main(String[] args)
    {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = 1598; i < 2025; i++)
        {
            String leap;

            if (isLeap(i))
                leap = "високосный";
            else
                leap = "обычный";

            System.out.println(i + " - " + leap + " год");
        }
    }

    static boolean isLeap(int year)
    {
        //        Место для вашего кода
        if (year % 4 == 0)
        {
            if (year % 100 == 0 && (year / 100) % 4 != 0)
                return false;
            else
                return true;
        }

        return false; // Заглушка. При реализации - удалить
    }
}