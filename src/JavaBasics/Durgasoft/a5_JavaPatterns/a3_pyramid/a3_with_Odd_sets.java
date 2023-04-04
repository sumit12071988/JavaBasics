package JavaBasics.Durgasoft.a5_JavaPatterns.a3_pyramid;

public class a3_with_Odd_sets {
    public static void main(String[] args) {
//        print_odd_number_of_stars();
//        print_odd_number_of_numbers_variation1();
//        print_odd_number_of_numbers_variation2();
//        print_odd_number_of_characters_variation1();
        print_odd_number_of_characters_variation2();
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
            *
           ***
          *****
         *******
        *********
     */
    private static void print_odd_number_of_stars() {
//        Outer loop to cover 10 iterations
        for (int i=0; i<5; i++){
                // Inner loop to handle reducing spaces from left
                for (int j=0; j<(5-i); j++){
                    System.out.print(" ");
                }

                // Inner loop to handle odd no. of *'s
                //  for index 0, *
                //  for index 1, ***
                //  for index 2, *****
                int timesToPrint = (i*2)+1;
                for (int k=0; k<timesToPrint; k++){
                    System.out.print("*");
                }

            System.out.println();   // for moving JVM to next line
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             1
            123
           12345
          1234567
         123456789
     */
    private static void print_odd_number_of_numbers_variation1() {
//        Outer loop to cover 10 iterations
        for (int i=0; i<5; i++){
            // Inner loop to handle left spaces in a row
            for (int j=0; j<(5-i); j++){
                System.out.print(" ");
            }

            // Inner loop to handle odd no. of numbers in same row
            //  for index 0, 1
            //  for index 1, 123
            //  for index 2, 12345
            int timesToPrint = (i*2)+1;
            for (int k=0; k<timesToPrint; k++){
                System.out.print(k+1);
            }

            System.out.println();   // for moving JVM to next line
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             1
            222
           33333
          4444444
         555555555
     */
    private static void print_odd_number_of_numbers_variation2() {
//        Outer loop to cover 10 iterations
        for (int i=0; i<5; i++){
            // Inner loop to handle left spaces
            for (int j=0; j<(5-i); j++){
                System.out.print(" ");
            }

            // Inner loop to handle odd no. of numbers
            //  for index 0, 1
            //  for index 1, 222
            //  for index 2, 33333
            int timesToPrint = (i*2)+1;
            for (int k=0; k<timesToPrint; k++){
                System.out.print(i+1);
            }

            System.out.println();   // for moving JVM to next line
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             A
            ABC
           ABCDE
          ABCDEFG
         ABCDEFGHI
     */
    private static void print_odd_number_of_characters_variation1() {
//        Outer loop to cover 10 iterations
        for (int i=0; i<5; i++){
            // Inner loop to handle left spaces
            for (int j=0; j<(5-i); j++){
                System.out.print(" ");
            }

            // Inner loop to handle odd no. of numbers
            //  for index 0, A
            //  for index 1, BBB
            //  for index 2, CCCCC
            int timesToPrint = (i*2)+1;
            for (int k=0; k<timesToPrint; k++){
                char currentChar = (char)(65+k);
                System.out.print(currentChar);
            }

            System.out.println();   // for moving JVM to next line
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
             A
            BBB
           CCCCC
          DDDDDDD
         EEEEEEEEE
     */
    private static void print_odd_number_of_characters_variation2() {
//        Outer loop to cover 10 iterations
        for (int i=0; i<5; i++){
            // Inner loop to handle left spaces
            for (int j=0; j<(5-i); j++){
                System.out.print(" ");
            }

            // Inner loop to handle odd no. of numbers
            //  for index 0, A
            //  for index 1, BBB
            //  for index 2, CCCCC
            int timesToPrint = (i*2)+1;
            for (int k=0; k<timesToPrint; k++){
                char currentChar = (char)(65+i);
                System.out.print(currentChar);
            }

            System.out.println();   // for moving JVM to next line
        }
    }
}
