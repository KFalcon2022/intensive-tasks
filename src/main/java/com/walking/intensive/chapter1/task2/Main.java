package com.walking.intensive.chapter1.task2;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(4, 4, 47));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int FLAT_MAX_NUMBER = floorAmount * entranceAmount * 4;
        int entranceNumber =  (flatNumber-1) / (FLAT_MAX_NUMBER/ entranceAmount)+1;
        int floorNumber = (((flatNumber-1) % (floorAmount*4)+1)-1) / 4 +1;
        int place = ((flatNumber-1) % (floorAmount*4)+1) - 4*(floorNumber-1);
        String placeFlat = switch (place){
            case 1 ->  "слева от лифта, влево";
            case 2 ->  "слева от лифта, вправо";
            case 3 ->  "справа от лифта, влево";
            case 4 ->  "справа от лифта, вправо";
            default ->  null;
            };
        String result = String.format("%d кв - %d подъезд, %d этаж, %s", flatNumber, entranceNumber, floorNumber, placeFlat );

            return result;
        }
    }
