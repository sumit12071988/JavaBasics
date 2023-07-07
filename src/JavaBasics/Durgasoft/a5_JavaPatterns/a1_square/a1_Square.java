package JavaBasics.Durgasoft.a5_JavaPatterns.a1_square;

public class a1_Square {
//    public static void main(String[] args) {
////        printing_10_stars_in_rows_wise_and_column_wise();
////        printing_10_consecutive_numbers_row_wise();
////        printing_10_consecutive_numbers_column_wise();
////        printing_10_consecutive_alphabets_row_wise();
////        printing_10_consecutive_alphabets_column_wise();
//        printing_in_box_pattern();
//    }

    public static void main(String[] args) {

    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To Print:
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *  *
 */
    private static void printing_10_stars_in_rows_wise_and_column_wise() {
        for (int i=0; i<10; i++){           // rows handler
            for (int j=0; j<10; j++){       // column handler
                                            //      Actual printing part is handled by inner loop.
                                            //      Outer loop is to increment i & move JVM to next line
//                System.out.print("*");    // prints "*" --> 10 times in same line
                System.out.print("*\t");    // prints "* then TAB" --> 10 times in same line
            }
            System.out.println();           // moves JVM in next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* To Print:
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
        0	1	2	3	4	5	6	7	8	9
     */
    private static void printing_10_consecutive_numbers_row_wise() {
        for (int i=0; i<10; i++){           // rows handler
            for (int j=0; j<10; j++){       // column handler
                                            //      Actual printing part is handled by inner loop.
                                            //      Outer loop is to increment i & move JVM to next line
                                            // Actual printing part is handled by inner loop.
                                            // Outer loop is to increment i & move JVM to next line
                System.out.print(j+"\t");   // prints "current j then TAB" --> 10 times in same line
            }
            System.out.println();           // moves JVM in next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*  To Print:
        0	0	0	0	0	0	0	0	0	0
        1	1	1	1	1	1	1	1	1	1
        2	2	2	2	2	2	2	2	2	2
        3	3	3	3	3	3	3	3	3	3
        4	4	4	4	4	4	4	4	4	4
        5	5	5	5	5	5	5	5	5	5
        6	6	6	6	6	6	6	6	6	6
        7	7	7	7	7	7	7	7	7	7
        8	8	8	8	8	8	8	8	8	8
        9	9	9	9	9	9	9	9	9	9
     */
    private static void printing_10_consecutive_numbers_column_wise() {
        for (int i=0; i<10; i++){           // rows handler
            for (int j=0; j<10; j++){       // column handler
                                            //      Actual printing part is handled by inner loop.
                                            //      Outer loop is to increment i & move JVM to next line
                System.out.print(i+"\t");   // prints "current i then TAB" --> 10 times in same line
            }
            System.out.println();           // moves JVM in next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*  To print:
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
        A   B   C   D   E   F   G   H   I   J
    */
    private static void printing_10_consecutive_alphabets_row_wise() {
        for (int i=0; i<10; i++){           // rows handler
            for (int j=0; j<10; j++){       // column handler
                                            //      Actual printing part is handled by inner loop.
                                            //      Outer loop is to increment i & move JVM to next line
                char currentAlphabet = (char) (j+65);    // char(65) => A, char(66) => B ....
                System.out.print(currentAlphabet+"\t");  // prints "* then TAB" --> 10 times in same line
            }
            System.out.println();           // moves JVM in next line
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*  To Print:
        A	A	A	A	A	A	A	A	A	A
        B	B	B	B	B	B	B	B	B	B
        C	C	C	C	C	C	C	C	C	C
        D	D	D	D	D	D	D	D	D	D
        E	E	E	E	E	E	E	E	E	E
        F	F	F	F	F	F	F	F	F	F
        G	G	G	G	G	G	G	G	G	G
        H	H	H	H	H	H	H	H	H	H
        I	I	I	I	I	I	I	I	I	I
        J	J	J	J	J	J	J	J	J	J
     */
    private static void printing_10_consecutive_alphabets_column_wise() {
        for (int i=0; i<10; i++){           // rows handler
            for (int j=0; j<10; j++){       // column handler
                                            //      Actual printing part is handled by inner loop.
                                            //      Outer loop is to increment i & move JVM to next line
                char currentAlphabet = (char) (i+65);    // char(65) => A, char(66) => B ....
                System.out.print(currentAlphabet+"\t");  // prints "* then TAB" --> 10 times in same line
            }
            System.out.println();           // moves JVM in next line
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* To print:
        $  $  $  $
        $        $
        $        $
        $  $  $  $
     */
private static void printing_in_box_pattern() {
    //Create a outer loop to iterate with rows
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (i==0 || i ==3 || j==0 || j==3){
                System.out.print("$  ");
            }else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
}
