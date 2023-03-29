package JavaBasics.Durgasoft.a5_JavaPatterns.a2_triangle;

public class a1_Left_Aligned_Increasing {
    public static void main(String[] args) {
//        printing_incrementing_star_pattern();
//        printing_incrementing_numbers_pattern_row_wise();
//        printing_incrementing_numbers_pattern_column_wise();
//        printing_incrementing_alphabet_pattern_row_wise();
        printing_repetitive_alphabets_row_wise();
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*  To Print:
         *
         *	*
         *	*	*
         *	*	*	*
         *	*	*	*	*
         *	*	*	*	*	*
         *	*	*	*	*	*	*
         *	*	*	*	*	*	*	*
         *	*	*	*	*	*	*	*	*
         *	*	*	*	*	*	*	*	*	*
     */
    private static void printing_incrementing_star_pattern() {
        for (int i=0; i<10; i++){           // row handler
            for (int j=0; j<=i; j++){       // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print("*\t");    // prints "*" --> in same line
            }
            System.out.println();           // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        1
        1	2
        1	2	3
        1	2	3	4
        1	2	3	4	5
        1	2	3	4	5	6
        1	2	3	4	5	6	7
        1	2	3	4	5	6	7	8
        1	2	3	4	5	6	7	8	9
        1	2	3	4	5	6	7	8	9	10
     */
    private static void printing_incrementing_numbers_pattern_row_wise() {
        for (int i=0; i<10; i++){          // row handler
            for (int j=0; j<=i; j++){       // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print((j+1)+"\t");   // prints j --> in same line
            }
            System.out.println();           // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        1
        2	2
        3	3	3
        4	4	4	4
        5	5	5	5	5
        6	6	6	6	6	6
        7	7	7	7	7	7	7
        8	8	8	8	8	8	8	8
        9	9	9	9	9	9	9	9	9
        10	10	10	10	10	10	10	10	10	10
     */
    private static void printing_incrementing_numbers_pattern_column_wise() {
        for (int i=0; i<10; i++){          // row handler
            for (int j=0; j<=i; j++){       // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print((i+1)+"\t");   // prints j --> in same line
            }
            System.out.println();           // moves JVM to next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To print:
        A
        A	B
        A	B	C
        A	B	C	D
        A	B	C	D	E
        A	B	C	D	E	F
        A	B	C	D	E	F	G
        A	B	C	D	E	F	G	H
        A	B	C	D	E	F	G	H	I
        A	B	C	D	E	F	G	H	I	J
     */
    private static void printing_incrementing_alphabet_pattern_row_wise() {
        for (int i=0; i<10; i++){           // row handler
            for (int j=0; j<=i; j++){       // column handler
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
        A
        B	B
        C	C	C
        D	D	D	D
        E	E	E	E	E
        F	F	F	F	F	F
        G	G	G	G	G	G	G
        H	H	H	H	H	H	H	H
        I	I	I	I	I	I	I	I	I
        J	J	J	J	J	J	J	J	J	J
     */
    private static void printing_repetitive_alphabets_row_wise() {
        for (int i=0; i<10; i++){       // row handler
            for (int j=0; j<=i; j++){    // column handler
                                            //      Actual printing part is handled by inner loop
                                            //      Outer loop is to increment i & move JVM to next line
                char currentAlphabet = (char)(65+i);
                System.out.print(currentAlphabet + "\t");
            }
            System.out.println();           // moves JVM to next line
        }
    }

}
