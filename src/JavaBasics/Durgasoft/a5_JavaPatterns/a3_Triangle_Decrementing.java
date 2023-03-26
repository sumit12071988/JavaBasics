package JavaBasics.Durgasoft.a5_JavaPatterns;

public class a3_Triangle_Decrementing {
    public static void main(String[] args) {
//        printing_decrementing_star_pattern_way1();
//        printing_decrementing_star_pattern_way2();
//        printing_decrementing_numbers_pattern_row_wise();
//        printing_decrementing_numbers_pattern_column_wise();
        printing_decrementing_alphabet_pattern_row_wise();
//        printing_repetitive_alphabets_row_wise();
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*  To Print:
         *	*	*	*	*	*	*	*	*	*
         *	*	*	*	*	*	*	*	*
         *	*	*	*	*	*	*	*
         *	*	*	*	*	*	*
         *	*	*	*	*	*
         *	*	*	*	*
         *	*	*	*
         *	*	*
         *	*
         *
     */
    private static void printing_decrementing_star_pattern_way1() {
        for (int i=0; i<10; i++){           // row handler
            for (int j=0; j<(10-i); j++){   // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print("*\t");    // prints "*" --> in same line
            }
            System.out.println();           // moves JVM to next line
        }
    }

    private static void printing_decrementing_star_pattern_way2() {
        for (int i=0; i<10; i++){           // row handler
            for (int j=10; j>i; j--){      // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print("*\t");    // prints "*" --> in same line
            }
            System.out.println();           // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        1	2	3	4	5	6	7	8	9	10
        1	2	3	4	5	6	7	8	9
        1	2	3	4	5	6	7	8
        1	2	3	4	5	6	7
        1	2	3	4	5	6
        1	2	3	4	5
        1	2	3	4
        1	2	3
        1	2
        1
     */
    private static void printing_decrementing_numbers_pattern_row_wise() {
        for (int i=0; i<10; i++){               // row handler
            for (int j=0; j<(10-i); j++){       // column handler
                                                //      Actual printing part is handled by inner loop
                                                //      Outer loop is to increment i & move JVM to next line
                System.out.print((j+1)+"\t");   // prints j+1 --> in same line
            }
            System.out.println();               // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        1	1	1	1	1	1	1	1	1	1
        2	2	2	2	2	2	2	2	2
        3	3	3	3	3	3	3	3
        4	4	4	4	4	4	4
        5	5	5	5	5	5
        6	6	6	6	6
        7	7	7	7
        8	8	8
        9	9
        10
     */
    private static void printing_decrementing_numbers_pattern_column_wise() {
        for (int i=0; i<10; i++){          // row handler
            for (int j=0; j<(10-i); j++){       // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print((i+1)+"\t");   // prints j --> in same line
            }
            System.out.println();           // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        A	B	C	D	E	F	G	H	I	J
        A	B	C	D	E	F	G	H	I
        A	B	C	D	E	F	G	H
        A	B	C	D	E	F	G
        A	B	C	D	E	F
        A	B	C	D	E
        A	B	C	D
        A	B	C
        A	B
        A
     */
    private static void printing_decrementing_alphabet_pattern_row_wise() {
        for (int i=0; i<10; i++){           // row handler
            for (int j=0; j<(10-i); j++){   // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                char currentAlphabet = (char)(65+j);
                System.out.print(currentAlphabet + "\t");
            }
            System.out.println();           // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        A   A   A   A   A   A   A   A   A   A
        B	B	B	B	B	B	B	B	B
        C	C	C	C	C	C	C	C
        D	D	D	D	D	D	D
        E	E	E	E	E	E
        F	F	F	F	F
        G	G	G	G
        H	H	H
        I	I
        J
     */
    private static void printing_repetitive_alphabets_row_wise() {
        for (int i=0; i<10; i++){       // row handler
            for (int j=0; j<(10-i); j++){    // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                char currentAlphabet = (char)(65+i);
                System.out.print(currentAlphabet + "\t");
            }
            System.out.println();           // moves JVM to next line
        }
    }

}
