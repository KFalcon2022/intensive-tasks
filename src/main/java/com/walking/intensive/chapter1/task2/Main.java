package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int floor = 3;
        int entrance = 3;
        int flatNumber = 36;
        System.out.println(getFlatLocation(floor, entrance, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flats = 1;
        String relust = "";

        for (int i = 1; i <= entranceAmount ; i++) {                //по подъездам

            for (int j = 1; j <= floorAmount; j++) {                //по этажам

                for (int k = 1; k <= 4 ; k++) {                     //по квартирам

                    if(flats == flatNumber){

                        relust = switch (k) {
                            case 1 -> String.format("%d - кв, %d - подъезд, %d - этаж, слева от лифта, влево", flats, i, j);
                            case 2 -> String.format("%d - кв, %d - подъезд, %d - этаж, слева от лифта, вправо", flats, i, j);
                            case 3 -> String.format("%d - кв, %d - подъезд, %d - этаж, справа от лифта, влево", flats, i, j);
                            case 4 -> String.format("%d - кв, %d - подъезд, %d - этаж, справа от лифта, вправо", flats, i, j);
                            default -> throw new IllegalStateException("Unexpected value: " + k);
                        };
                    }
                    flats++;
                }
            }
        }
        return relust;
    }
}