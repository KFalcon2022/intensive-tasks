package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {

    }

    static boolean isLeap(int year) {
        if(year%400==0){
            return true;
        } else if(year%100==0){
            return false;
        } else if(year%4==0){
            return true;
        } else {
            return false;
        }
    }
}