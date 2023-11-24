public class Main {
    public static void main(String[] args) {
// Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
        int age = 32;

        getAgeString(возраст);
    }

    static String getAgeString(int age) {
// Место для вашего кода
        статическая пустая строка getAgeString(возраст ввода) {

            if (age < 0) {
                System.out.println("Неверный возраст.");
            } else if (age % 10 == 1 && age != 11) {
                System.out.println("Вам " + age + " год.");
            } еще, если (возраст % 10>= 2 && возраст % 10 <= 4 && возраст!= 12 && возраст!= 13 && возраст!= 14) {
                System.out.println("Вам " + age + " года.");
            } else {
                System.out.println("Вам " + age + " лет.");
            }

            return null;