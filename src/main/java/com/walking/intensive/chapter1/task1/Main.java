package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 121;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age > 127) {
            return "Давай не будем обманывать, сладкий пирожочек, напиши сколько тебе лет на самом деле.";
        }

        else {

            String ageString = Integer.toString(age);
            char caseMarker = ageString.charAt(ageString.length() - 1);
            String resultString;

            switch (caseMarker) {
                case '1':
                    resultString = "Вам " + ageString + " год.";
                    break;
                case '2':
                case '3':
                case '4':
                    resultString = "Вам " + ageString + " года.";
                    break;
                default:
                    resultString = "Вам " + ageString + " лет.";
                    break;
            }

            return resultString;
        }
    }
}