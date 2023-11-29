package main.java.com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

    }

    boolean isPalindrome(String inputString) {
        inputString = inputString.replace('.', ' ').replace(',', ' ')
                .replace('!', ' ').replace(" ", "");
        String reverseString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString += inputString.charAt(i);
        }
        return reverseString.equalsIgnoreCase(inputString);
    }
}
