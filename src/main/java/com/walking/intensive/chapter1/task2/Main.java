package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 2;
        int entranceAmount = 3;
        int flatNumber = 11;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        final int FLAT_AMOUNT_ON_THE_FLOOR = 4; // у нас есть фиксированное количество квартир на этаже

        // Общее количество квартир в доме
        int flatAmount = FLAT_AMOUNT_ON_THE_FLOOR * floorAmount * entranceAmount;

        // Задаём условия проверки корректности введённого номера квартиры
        if (flatNumber <= 0 || flatNumber > flatAmount) {
            return "Квартиры с указанным номером нет. Проверьте введённые данные.";

        } else {
            // Заводим переменную, в которую положим значение номера подъезда
            int entranceNumber;

            /*
            Для определения номера подъезда необходимо разделить номер квартиры на количество квартир в подъезде,
            также нам необходимо знать о наличии остатка после такого деления, чтобы корректно определить
            номер подъезда
            */
            int flatAmountInTheEntrance = FLAT_AMOUNT_ON_THE_FLOOR * floorAmount;
            int divisionForEntranceNumber = flatNumber / flatAmountInTheEntrance;
            int remainderOfDivisionForEntranceNumber = flatNumber % flatAmountInTheEntrance;

            // Если результат такого деления целое число, то этот результат и есть номер подъезда
            if (remainderOfDivisionForEntranceNumber == 0) {
                entranceNumber = divisionForEntranceNumber;
                /*
                Если в результате деления мы получаем остаток,
                то результат деления нужно инкрементировать, чтобы получить номер подъезда
                */
            } else {
                entranceNumber = ++divisionForEntranceNumber;
            }

            // Далее заводим переменную для этажа, на котором находится квартира
            int floorNumber;

            /*
            Чтобы определить номер этажа нам нужно из номера квартиры
            вычесть общее количество квартир в предыдущих подъездах: (entranceNumber - 1) * flatAmountInTheEntrance
            и полученную разность разделить на количество квартир на этаже.
            Также нам необходим остаток от деления номера квартиры на количество квартир на этаже.
             */
            int divisionForFloorNumber =
                    (flatNumber - (entranceNumber - 1) * flatAmountInTheEntrance) / FLAT_AMOUNT_ON_THE_FLOOR;
            int remainderOfDivisionOnFlatAmountOnTheFloor = flatNumber % FLAT_AMOUNT_ON_THE_FLOOR;

            if (remainderOfDivisionOnFlatAmountOnTheFloor == 0) {
                floorNumber = divisionForFloorNumber;
            } else {
                floorNumber = ++divisionForFloorNumber;
            }

            /*
            Теперь заведём строку, которая будет описывать расположение квартиры на этаже относительно лифта,
            значение котрой будет зависеть от остатка от деления номера квартиры на количество квартир на этаже
             _________________
            |                 |
            | 2             3 |
            |                 |
            | 1    _____    4 |
            |______|_|_|______|
            */
            String placeOnTheFloor;
            switch (remainderOfDivisionOnFlatAmountOnTheFloor) {
                case 1:
                    placeOnTheFloor = "первая квартира слева от лифта.";
                    break;
                case 2:
                    placeOnTheFloor = "вторая квартира слева от лифта.";
                    break;
                case 3:
                    placeOnTheFloor = "вторая квартира справа от лифта.";
                    break;
                default:
                    placeOnTheFloor = "первая квартира справа от лифта.";
            }
            return "Номер квартиры : " + flatNumber +
                    "\nНомер подъезда: " + entranceNumber +
                    "\nЭтаж: " + floorNumber +
                    "\nРасположение на этаже: " + placeOnTheFloor;
        }
    }
}