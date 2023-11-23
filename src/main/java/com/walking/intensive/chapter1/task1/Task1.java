package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
ppublic class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 35;
        if (age < 0) {
            System.out.println("Вы еще не родились:)");
        } else if (age > 128) {
            System.out.println("Столько не живут:)");
        } else {
            getAgeString(age);
        }
    }
    static void getAgeString(int a) {
        int remOfDivBy100 = a % 100;
        int remOfDivBy10 = a % 10;
        switch (remOfDivBy100) {
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Вам " + a + " лет");
                break;
            default:
                switch (remOfDivBy10) {
                    case 1:
                        System.out.println("Вам " + a + " год");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Вам " + a + " года");
                        break;
                    default:
                        System.out.println("Вам " + a + " лет");
                }
        }
    }
}
