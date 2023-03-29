package JavaBasics.Durgasoft.a5_JavaPatterns.a3_pyramid;

public class a2_with_Even_sets {
    public static void main(String[] args) {
        print_even_number_of_stars();
        print_even_number_of_numbers_variation1();
        print_even_number_of_numbers_variation2();
        print_even_number_of_characters_variation1();
        print_even_number_of_characters_variation2();
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                 **
                ****
               ******
              ********
             **********
     */
    private static void print_even_number_of_stars() {
        for (int i = 0; i < 5; i++) {
                // Inner loop to handle spaces in front
                for (int j = 0; j < (5 - i); j++) {
                    System.out.print(" ");
                }

                // Find the even number from index in order to print * that many times
                int timesToPrint = (i + 1) * 2; // each iteration values: 2, 4, 6, 8, 10

                // Inner loop to handle *'s using timesToPrintStars as limit
                for (int k = 1; k <= timesToPrint; k++) {
                    System.out.print("*");
                }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             12
            1234
           123456
          12345678
         12345678910
     */
    private static void print_even_number_of_numbers_variation1() {
        for (int i = 0; i < 5; i++) {
            // Inner loop to handle spaces in front
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            // Find the even number from index in order to print * that many times
            int timesToPrint = (i + 1) * 2; // each iteration values: 2, 4, 6, 8, 10

            // Inner loop to handle *'s using timesToPrintStars as limit
            for (int k = 1; k <= timesToPrint; k++) {
                System.out.print(k);
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             11
            2222
           333333
          44444444
         5555555555
     */
    private static void print_even_number_of_numbers_variation2() {
        for (int i = 0; i < 5; i++) {
            // Inner loop to handle spaces in front
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            // Find the even number from index in order to print * that many times
            int timesToPrint = (i + 1) * 2; // each iteration values: 2, 4, 6, 8, 10

            // Inner loop to handle *'s using timesToPrintStars as limit
            for (int k = 1; k <= timesToPrint; k++) {
                System.out.print(i+1);
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             AB
            ABCD
           ABCDEF
          ABCDEFGH
         ABCDEFGHIJ
     */
    private static void print_even_number_of_characters_variation1() {
        for (int i = 0; i < 5; i++) {
            // Inner loop to handle spaces in front
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            // Find the even number from index in order to print * that many times
            int timesToPrint = (i + 1) * 2; // each iteration values: 2, 4, 6, 8, 10

            // Inner loop to handle characters printing using timesToPrint as limit
            for (int k = 1; k <= timesToPrint; k++) {
                char currentChar = (char)(64+k); // char(65) = A
                System.out.print(currentChar);
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             AA
            BBBB
           CCCCCC
          DDDDDDDD
         EEEEEEEEEE
     */
    private static void print_even_number_of_characters_variation2() {
        for (int i = 0; i < 5; i++) {
            // Inner loop to handle spaces in front
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            // Find the even number from index in order to print * that many times
            int timesToPrint = (i + 1) * 2; // each iteration values: 2, 4, 6, 8, 10

            // Inner loop to handle characters printing using timesToPrint as limit
            for (int k = 1; k <= timesToPrint; k++) {
                char currentChar = (char)(65+i);
                System.out.print(currentChar);
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
}
