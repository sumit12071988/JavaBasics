package JavaBasics.Durgasoft.a5_JavaPatterns.a3_pyramid;

public class a4_Inverted {
    public static void main(String[] args) {
//        print_stars();
//        print_odd_number_of_stars();
//        print_even_number_of_stars();
//        print_numbers_way1();
//        print_numbers_way2();
//        print_alphabets_way1();
        print_alphabets_way2();
    }

    /* to print:            i   spaces   *'s    relation of *'s w.r.t i
     * * * * * * * * *      0      0      9     9-0    => 9-i
      * * * * * * * *       1      1      8     9-1
       * * * * * * *        2      2      7     9-2
        * * * * * *         3      3      6     9-3
         * * * * *          4      4      5     9-4
          * * * *           5      5      4     9-5
           * * *            6      6      3     9-6
            * *             7      7      2     9-7
             *              8      8      1     9-8
         */
    private static void print_stars() {
        // Outer loop to move JVM to new line
        for (int i=0; i<9; i++) {
            // Inner loop to handle increasing " "
            for (int j=0; j<i; j++) {   // nested loop max condition in relation to outer loop
                System.out.print(" ");
            }
            // Inner loop to handle decreasing *'s
            for (int k = 0; k < 9-i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // to move JVM to new line
        }
    }

    /* To print                     i   spaces  *'s
        * * * * * * * * * * *       0   0       11  => 11-(2*i)
         * * * * * * * * *          1   1       9
           * * * * * * *            2   2       7
             * * * * *              3   3       5
               * * *                4   4       3
                 *                  5   5       1
     */
    private static void print_odd_number_of_stars() {
        // Outer loop for moving JVM to new line
        for(int i=0; i<6; i++){

            // Inner loop for spaces
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }

            // Inner loop for *'s
            for(int k=0; k<(11-(2*i)); k++){
                System.out.print("* ");
            }

            System.out.println();   // moving JVM to new line
        }
    }

    /* To Print                 i   spaces  *'s  relation of * w.r.t i
        * * * * * * * * * *     0   0       10   10-(2*0) = 10  = 10-(2*i)
          * * * * * * * *       1   1       8    10-(2*1) = 8
            * * * * * *         2   2       6    10-(2*2) = 6
              * * * *           3   3       4    10-(2*3) = 4
                * *             4   4       2    10-(2*4) = 2
     */
    private static void print_even_number_of_stars() {
        // Outer loop for moving JVM to new line
        for(int i=0; i<5; i++){

            // Inner loop for spaces
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }

            // Inner loop for *'s
            for(int k=0; k<(10-(2*i)); k++){
                System.out.print("* ");
            }

            System.out.println();   // moving JVM to new line
        }
    }

    /* To print:
          1 2 3 4 5 6 7
           1 2 3 4 5 6
            1 2 3 4 5
             1 2 3 4
              1 2 3
               1 2
                1
     */
    private static void print_numbers_way1() {
        // Outer loop to move JVM to new line
        for (int i=0; i<9; i++) {
            // Inner loop to handle increasing " "
            for (int j=0; j<i; j++) {   // nested loop max condition in relation to outer loop
                System.out.print(" ");
            }
            // Inner loop to handle decreasing numbers
            for (int k = 0; k < 9-i; k++) {
                System.out.print(k+1+" ");
            }
            System.out.println(); // to move JVM to new line
        }
    }


    /*
        1 1 1 1 1 1 1 1 1
         2 2 2 2 2 2 2 2
          3 3 3 3 3 3 3
           4 4 4 4 4 4
            5 5 5 5 5
             6 6 6 6
              7 7 7
               8 8
                9
     */
    private static void print_numbers_way2() {
        // Outer loop to move JVM to new line
        for (int i=0; i<9; i++) {
            // Inner loop to handle increasing " "
            for (int j=0; j<i; j++) {   // nested loop max condition in relation to outer loop
                System.out.print(" ");
            }
            // Inner loop to handle decreasing numbers
            for (int k = 0; k < 9-i; k++) {
                System.out.print(i+1+" ");
            }
            System.out.println(); // to move JVM to new line
        }
    }

    /*
        A B C D E F G H I
         A B C D E F G H
          A B C D E F G
           A B C D E F
            A B C D E
             A B C D
              A B C
               A B
                A
     */
    private static void print_alphabets_way1() {
        // Outer loop to move JVM to new line
        for (int i=0; i<9; i++) {
            // Inner loop to handle increasing " "
            for (int j=0; j<i; j++) {   // nested loop max condition in relation to outer loop
                System.out.print(" ");
            }
            // Inner loop to handle decreasing alphabets
            for (int k = 0; k < 9-i; k++) {
                System.out.print((char)(65+k)+" ");
            }
            System.out.println(); // to move JVM to new line
        }
    }


    /*
        A A A A A A A A A
         B B B B B B B B
          C C C C C C C
           D D D D D D
            E E E E E
             F F F F
              G G G
               H H
                I
     */
    private static void print_alphabets_way2() {
        // Outer loop to move JVM to new line
        for (int i=0; i<9; i++) {
            // Inner loop to handle increasing " "
            for (int j=0; j<i; j++) {   // nested loop max condition in relation to outer loop
                System.out.print(" ");
            }
            // Inner loop to handle decreasing alphabets
            for (int k = 0; k < 9-i; k++) {
                System.out.print((char)(65+i)+" ");
            }
            System.out.println(); // to move JVM to new line
        }
    }
}
