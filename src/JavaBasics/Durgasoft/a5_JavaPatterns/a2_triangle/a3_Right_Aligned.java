package JavaBasics.Durgasoft.a5_JavaPatterns.a2_triangle;

public class a3_Right_Aligned {
    public static void main(String[] args) {
//        print_right_triangle_of_stars();
//        print_right_triangle_of_numbers();
//        print_right_triangle_of_numbers_anotherType();
//        print_right_triangle_of_alphabets();
        print_right_triangle_of_alphabets_anotherType();
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  *
                 **
                ***
               ****
              *****
             ******
            *******
           ********
          *********
         **********
     */
    private static void print_right_triangle_of_stars() {
        // Outer loop to move jvm to next line on every iteration
        for (int i=0; i<10; i++){
//         In this scenario, we've to think like JVM.
//         JVM always operate from left to right
//         So in this case, we'll to see the problem like "in every iteration, spaces are getting reduced by 1 and * are added by 1"
//         Thus we'll have to create 2 inner loops:
//            1. To handle spaces
//            2. To handle stars

            // Inner loop to handle spaces
            for (int j=0; j<(10-i); j++){
                System.out.print(" ");
            }
            // Inner loop to handle stars
            for (int k=0; k <=i; k++){
                System.out.print("*");
            }
            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
/* To print:
              1
             12
            123
           1234
          12345
         123456
        1234567
       12345678
      123456789
     12345678910
 */
    private static void print_right_triangle_of_numbers() {
        // Outer loop to move jvm to next line on every iteration
        for (int i=0; i<10; i++){
//         In this scenario, we've to think like JVM.
//         JVM always operate from left to right
//         So in this case, we'll to see the problem like "in every iteration, spaces are getting reduced by 1 and number is added by 1"
//         Thus we'll have to create 2 inner loops:
//            1. To handle spaces
//            2. To handle numbers

            // Inner loop to handle spaces
            for (int j=0; j<(10-i); j++){
                System.out.print(" ");
            }
            // Inner loop to handle numbers
            for (int k=0; k<=i; k++){
                System.out.print(k+1);
            }
            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                 1
                22
               333
              4444
             55555
            666666
           7777777
          88888888
         999999999
        10101010101010101010
     */
    private static void print_right_triangle_of_numbers_anotherType() {
        // Outer loop to move jvm to next line on every iteration
        for (int i = 0; i < 10; i++) {
//         In this scenario, we've to think like JVM.
//         JVM always operate from left to right
//         So in this case, we'll to see the problem like "in every iteration, spaces are getting reduced by 1 and number is repeated by 1 time"
//         Thus we'll have to create 2 inner loops:
//            1. To handle spaces
//            2. To handle numbers

            // Inner loop to handle spaces
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(" ");
            }
            // Inner loop to handle numbers
            for (int k = 0; k <= i; k++) {
                System.out.print(i + 1);    // This will make same number repeatedly printed k times
            }
            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  A
                 AB
                ABC
               ABCD
              ABCDE
             ABCDEF
            ABCDEFG
           ABCDEFGH
          ABCDEFGHI
         ABCDEFGHIJ
     */
    private static void print_right_triangle_of_alphabets() {
        // Outer loop to move jvm to next line on every iteration
        for (int i = 0; i < 10; i++) {
//         In this scenario, we've to think like JVM.
//         JVM always operate from left to right
//         So in this case, we'll to see the problem like "in every iteration, spaces are getting reduced by 1 and alphabet is increased by 1"
//         Thus we'll have to create 2 inner loops:
//            1. To handle spaces
//            2. To handle alphabets

            // Inner loop to handle spaces
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(" ");
            }
            // Inner loop to handle numbers
            for (int k = 0; k <= i; k++) {
                char currentCharacter = (char)(65+k);
                System.out.print(currentCharacter);
            }
            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  A
                 BB
                CCC
               DDDD
              EEEEE
             FFFFFF
            GGGGGGG
           HHHHHHHH
          IIIIIIIII
         JJJJJJJJJJ
     */
    private static void print_right_triangle_of_alphabets_anotherType() {
        // Outer loop to move jvm to next line on every iteration
        for (int i = 0; i < 10; i++) {
//         In this scenario, we've to think like JVM.
//         JVM always operate from left to right
//         So in this case, we'll to see the problem like "in every iteration, spaces are getting reduced by 1 and alphabet is increased by 1"
//         Thus we'll have to create 2 inner loops:
//            1. To handle spaces
//            2. To handle alphabets

            // Inner loop to handle spaces
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(" ");
            }
            // Inner loop to handle numbers
            for (int k = 0; k <= i; k++) {
                char currentCharacter = (char)(65+i);   // this will make same char repeatedly printed k times
                System.out.print(currentCharacter);
            }
            System.out.println();   // to move JVM to next line on every iteration
        }
    }
}

