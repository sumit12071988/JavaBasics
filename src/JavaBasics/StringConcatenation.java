package JavaBasics;

/**
 * 
 * @author Sumit
 *This class is to understand String concatenation
 *
 */

public class StringConcatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String c ="Hello";
        String d = "Selenium";

        char e = 'a';                   // ASCII value = 97
        char f = 'b';                   // ASCII value = 98
        char g = '9';					// 9 is also a character

        System.out.println(c+d+a+b);    // O/p: HelloSelenium1020
        System.out.println(a+b+c+d);    // O/p: 30HelloSelenium
        System.out.println(c+d+(a+b));  // O/p: HelloSelenium30
        System.out.println(e+f+g);        // O/p: 252
                                        // When two characters are added, their ASCII key values are added

    }

}
