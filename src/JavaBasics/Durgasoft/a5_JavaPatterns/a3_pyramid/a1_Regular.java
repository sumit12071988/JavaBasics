package JavaBasics.Durgasoft.a5_JavaPatterns.a3_pyramid;

public class a1_Regular {
    public static void main(String[] args) {
//        print_stars();
//        print_numbers_variation1();
//        print_numbers_variation2();
//        print_characters_variation1();
        print_characters_variation2();
    }


    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *
          * * * * * * *
         * * * * * * * *
        * * * * * * * * *
       * * * * * * * * * *
     */
    private static void print_stars() {
//        Outer loop for 10 iterations
        for (int i=0; i<10; i++){
//            Here we'll have 2 inner loops to handle 2 things:
//            1. To handle Left side spaces
//            2. To handle *'s and spaces after each *
//
//            If we notice, 1st row has 9 spaces, *
//                          2nd row has 8 spaces, * space *

            // Inner loop to handle Left side spaces
            for (int j=0; j<10-i; j++){
                System.out.print(" ");
            }

            // Inner loop to handle *'s and spaces
            for (int k=0; k<=i; k++){
                System.out.print("* ");
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  1
                 1 2
                1 2 3
               1 2 3 4
              1 2 3 4 5
             1 2 3 4 5 6
            1 2 3 4 5 6 7
           1 2 3 4 5 6 7 8
          1 2 3 4 5 6 7 8 9
         1 2 3 4 5 6 7 8 9 10
     */
    private static void print_numbers_variation1() {
//        Outer loop for 10 iterations
        for (int i=0; i<10; i++){
//            Here we'll have 2 inner loops to handle 2 things:
//            1. To handle Left side spaces
//            2. To handle numbers and spaces after each number
//
//            If we notice, 1st row has 9 spaces, number
//                          2nd row has 8 spaces, number space next_number

            // Inner loop to handle Left side spaces
            for (int j=0; j<10-i; j++){
                System.out.print(" ");
            }

            // Inner loop to handle numbers and spaces
            for (int k=0; k<=i; k++){
                System.out.print((k+1)+" ");
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  1
                 2 2
                3 3 3
               4 4 4 4
              5 5 5 5 5
             6 6 6 6 6 6
            7 7 7 7 7 7 7
           8 8 8 8 8 8 8 8
          9 9 9 9 9 9 9 9 9
         10 10 10 10 10 10 10 10 10 10
     */
    private static void print_numbers_variation2() {
//        Outer loop for 10 iterations
        for (int i=0; i<10; i++){
//            Here we'll have 2 inner loops to handle 2 things:
//            1. To handle Left side spaces
//            2. To handle number and space
//
//            If we notice, 1st row has 9 spaces then 1
//                          2nd row has 8 spaces then 2 space 2

            // Inner loop to handle Left side spaces
            for (int j=0; j<10-i; j++){
                System.out.print(" ");
            }

            // Inner loop to handle numbers and spaces
            for (int k=0; k<=i; k++){
                System.out.print((i+1)+" ");
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  A
                 A B
                A B C
               A B C D
              A B C D E
             A B C D E F
            A B C D E F G
           A B C D E F G H
          A B C D E F G H I
         A B C D E F G H I J
     */
    private static void print_characters_variation1() {
//        Outer loop for 10 iterations
        for (int i=0; i<10; i++){
//            Here we'll have 2 inner loops to handle 2 things:
//            1. To handle Left side spaces
//            2. To handle numbers and spaces after each character
//
//            If we notice, 1st row has 9 spaces, A
//                          2nd row has 8 spaces, A space B

            // Inner loop to handle Left side spaces
            for (int j=0; j<10-i; j++){
                System.out.print(" ");
            }

            // Inner loop to handle characters and spaces
            for (int k=0; k<=i; k++){
                char currentChar = (char)(65+k);
                System.out.print(currentChar + " ");
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
                  A
                 B B
                C C C
               D D D D
              E E E E E
             F F F F F F
            G G G G G G G
           H H H H H H H H
          I I I I I I I I I
         J J J J J J J J J J
     */
    private static void print_characters_variation2() {
//        Outer loop for 10 iterations
        for (int i=0; i<10; i++){
//            Here we'll have 2 inner loops to handle 2 things:
//            1. To handle Left side spaces
//            2. To handle numbers and spaces after each character
//
//            If we notice, 1st row has 9 spaces, A
//                          2nd row has 8 spaces, B space B

            // Inner loop to handle Left side spaces
            for (int j=0; j<10-i; j++){
                System.out.print(" ");
            }

            // Inner loop to handle characters and spaces
            for (int k=0; k<=i; k++){
                char currentChar = (char)(65+i);
                System.out.print(currentChar + " ");
            }

            System.out.println();   // to move JVM to next line on every iteration
        }
    }
}
