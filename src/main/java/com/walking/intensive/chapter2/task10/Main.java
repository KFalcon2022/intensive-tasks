package com.walking.intensive.chapter2.task10;

public class Main {
    static final String PANGRAMM = "thequickbrownfoxjumpsoverthelazydogñúåøüåù¸ıòèõìÿãêèõôğàíöóçñêèõáóëîêäàâûïåéæå÷àş";

    public static void main(String[] args) {

        System.out.println(isPalindrome("wasitacaroracatisaw"));
        System.out.println(isPalindrome("!!Was it a ca_r o_r a c!at I sa!w?!"));
        System.out.println(isPalindrome("a_b!c@d$cba"));
        System.out.println(isPalindrome("àáâáà!àáâáà"));
        System.out.println(isPalindrome("cattac"));
        System.out.println(isPalindrome("!#!!!daaad!@!!!"));

    }

    static boolean isPalindrome(String s) {
        int counterRight=0;
        for (int i = 0; i < s.length(); i++) {
            if (PANGRAMM.indexOf(s.toLowerCase().charAt(i)) > 0) {
                for (int j = s.length() - counterRight - 1; j >= i; j--) {
                    counterRight++;
                    if (PANGRAMM.indexOf(s.toLowerCase().charAt(j)) > 0) {
                        if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j)) {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }
}