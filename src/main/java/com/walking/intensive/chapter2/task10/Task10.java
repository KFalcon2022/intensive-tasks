package main.java.com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

    }

    boolean isPalindrome(String inputString) {
        inputString = inputString.toLowerCase();

        for (int i = 0, j = inputString.length() - 1; i < inputString.length() && j >= 0; i++, j--) {

            if (!Character.isLetter(inputString.charAt(i))) {
                j++;
                continue;
            }
            if (!Character.isLetter(inputString.charAt(j))) {
                i--;
                continue;
            }
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}