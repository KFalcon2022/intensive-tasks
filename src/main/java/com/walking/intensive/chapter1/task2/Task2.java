package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
//        int floorAmount = 7;
//        int entranceAmount = 5;
//       int flatNumber =141;
//        String flatLocation = getFlatLocation(floorAmount, entranceAmount, flatNumber);
//        System.out.println(flatLocation);
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int flatsOnFloorAmmount = 4;
        String result = "";
        if (flatNumber < 1 || flatNumber > floorAmount*entranceAmount*flatsOnFloorAmmount)
        {
            result = "Такой квартиры не существует";
        }
        else {
            int entranceNumber = ((flatNumber-1) / (floorAmount * flatsOnFloorAmmount)) + 1;
            int floorNumber = ((flatNumber-1) - (floorAmount * flatsOnFloorAmmount*(entranceNumber - 1)))/flatsOnFloorAmmount + 1;
            switch (flatNumber - (floorAmount * flatsOnFloorAmmount*(entranceNumber - 1))- (floorNumber -1)*flatsOnFloorAmmount){
                case 1: result = flatNumber + " кв - " + entranceNumber +" подъезд, " + floorNumber + " этаж, слева от лифта, влево"; break;
                case 2: result = flatNumber + " кв - " + entranceNumber +" подъезд, " + floorNumber + " этаж, слева от лифта, вправо"; break;
                case 3: result = flatNumber + " кв - " + entranceNumber +" подъезд, " + floorNumber + " этаж, справа от лифта, влево"; break;
                case 4: result = flatNumber + " кв - " + entranceNumber +" подъезд, " + floorNumber + " этаж, справа от лифта, вправо"; break;

            }

        }
        return result;
        // Заглушка. При реализации - удалить
    }
}