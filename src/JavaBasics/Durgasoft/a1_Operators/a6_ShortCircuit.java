package JavaBasics.Durgasoft.a1_Operators;

public class a6_ShortCircuit {
    public static void main(String[] args) {

        //------- Using | ----------------------------------------------------------------------------------
        int a = 10 , b = 10;
        if (a++ == 10 | b++ == 10) {    // When compiler comes in this line, a=10, b=10
                                        // When compiler comes in this line, a=11, b=11
            System.out.println("Values of a and b using | : " + a + " | " + b);    // a=11, b=11
        }
        //------- Using || ---------------------------------------------------------------------------------
        int c = 10 , d = 10;
        if (c++ == 10 || d++ == 10) {    // When compiler comes in this line, c=10, d=10
                                         // When compiler comes in this line, c=11, d=10 (IGNORED DUE TO ||)
            System.out.println("Values of c and d using || : " + c + " | " + d);    // c=11, d=10
        }
        //------- Using & ----------------------------------------------------------------------------------
        int e = 10 , f = 10;
        if (e++ != 10 & f++ != 10) {    // When compiler comes in this line, e=10, f=10
                                        // When compiler comes in this line, e=11, f=11
        }else {
            System.out.println("Values of e and f using & : " + e + " | " + f);    // e=11, f=11
        }
        //------- Using && ---------------------------------------------------------------------------------
        int g = 10 , h = 10;
        if (g++ != 10 && h++ != 10) {   // When compiler comes in this line, g=10, h=10
                                        // When compiler comes in this line, g=11, h=10 (IGNORED DUE TO &&)
        }else {
            System.out.println("Values of g and h using &&: " + c + " | " + d);    // c=11, d=10
        }

    }
}
