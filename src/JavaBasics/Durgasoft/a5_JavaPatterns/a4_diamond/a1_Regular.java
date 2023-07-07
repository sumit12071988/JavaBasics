package JavaBasics.Durgasoft.a5_JavaPatterns.a4_diamond;

public class a1_Regular {
    public static void main(String[] args) {
        print_diamond_using_stars();
        System.out.println(2147812091L);
    }

    /*             i       spaces  *'s
           *       0       4       1
          * *      1       3       2
         * * *     2       2       3
        * * * *    3       1       4
       * * * * *   4       0       5
        * * * *    5       1       4
         * * *     6       2       3
          * *      7       3       2
           *       8       4       1
     */
    /*
        Solution: we'll need 2 outer loops:
        1. Outer Loop #1 will print incrementing stars
                   i       spaces  *'s
           *       0       4       1
          * *      1       3       2
         * * *     2       2       3
        * * * *    3       1       4
       * * * * *   4       0       5

        2. Outer loop #2 will print decrementing stars
                   i       spaces  *'s
        * * * *    0       1       4
         * * *     1       2       3
          * *      2       3       2
           *       3       4       1
     */
    private static void print_diamond_using_stars() {
        // Outer loop #1 to print increasing stars
        for (int i=0; i<5; i++){
            for (int j=0; j<(4-i); j++){
                System.out.print(" ");
            }
            for (int k=0; k<(i+1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Outer loop #2 to print decreasing stars
        for (int l=0; l<4; l++){
            for (int m=0; m<(l+1); m++){
                System.out.print(" ");
            }
            for (int n=0; n<(4-l); n++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}