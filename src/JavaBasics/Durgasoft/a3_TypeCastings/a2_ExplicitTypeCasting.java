package JavaBasics.Durgasoft.a3_TypeCastings;

public class a2_ExplicitTypeCasting {
    public static void main(String[] args) {
// ####### WHEN VALUE IS WITHIN RANGE OF LOWER DATATYPE ################################################################

        //------ int to byte -----------------------------------
        int a = 10;
//      byte b = i ;            // Compilation error
        byte b = (byte) a;      // Explicit Typecasting allowed.
        System.out.println("b: "+b);  // 10

        //------ int to short -----------------------------------
        int c = 10;
        short d = (short) c;
        System.out.println("d: "+d);

        //------ int to short | Another way ----------------------
        int e = 10;
        short f = (byte) e; // This is allowed since datatype inside cast operator()
                            // should be either same or lower than datatype on left side
        System.out.println("f: "+f);

        //------ char to short -----------------------------------
        char k = 'A';
        short l = (short)k;
        System.out.println("l: "+l);    // O/p: 65, since byte representation of A is 65

        //------ char to short | Another Way ----------------------
        char m = 'A';
        short n = (byte)m;          // Allowed since same or lower type inside cast operator() allowed
        System.out.println("n: "+n);    // O/p: 65, since byte representation of A is 65

        //------ byte to char -----------------------------------
        byte g = 65;
        char h = (char)g;   // byte and char are the lowest ends in the conversion chart
        System.out.println("h: "+h); // O/p: A, since char representation of 65 is A

        //------ char to byte -----------------------------------
        char i = 'A';
        byte j = (byte)i;   // byte and char are the lowest ends in the conversion chart
        System.out.println("j: "+j); // O/p: 65, since byte representation of A is 65

        //------ float to long ----------------------------------
        float o = 22.22f;
        long p = (long)o;   // same as left or lower than left
        System.out.println("p: "+p); // O/p: 22

        //------ float to long | Another way ----------------------------------
        float q = 22.22f;
        long r = (int)q;   // same as left or lower than left
        System.out.println("r: "+r); // O/p: 22

        //------ float to long | Another way ----------------------------------
        float s = 22.22f;
        long t = (byte)s;   // same as left or lower than left
        System.out.println("t: "+t); // O/p: 22

// ####### WHEN VALUE EXCEEDS RANGE OF LOWER DATATYPE ################################################################
        //------ int to byte ---------------------------------------------------
        int u = 130;
        byte v = (byte)u; // Here no compilation error as compiler won't know if the value is within range or not
        System.out.println("v: "+v); // O/p: -126
        // Calculation logic:
        // Max value of byte            = 127
        // Find the difference          ==> 130 - 127 = 3
        // Subtract 1 from the result   ==> 3 - 1 = 2
        // Add Min value of byte        ==> 2 + (-128) = -126

        //------- byte to byte -------------------------------------------------
        // Adding two bytes needs explicit typecasting irrespective of result within range or not

            // Scenario: When resultant byte exceeds byte range
            byte a1 = 60;
            byte a2 = 70;
            byte a3 = (byte) (a1+a2);
            System.out.println("a3: "+a3); // O/p: -76
                // Calculation logic
                // Max val in byte : 127
                // 130 - 127 = 3
                // 3 - 1 = 2
                // 2 + (-127) = -126

            // Scenario: When resultant byte DOESN'T exceed byte range
            byte a4 = 30;
            byte a5 = 30;
            byte a6 = (byte) (a4+a5);
            System.out.println("a6: "+a6); // O/p: 30

        // ------- Miscellaneous example ----------------------------------------------
        double d1 = 22.22; // Highest datatype

        byte b1 = (byte)d1; // Lowest datatype. this is valid
        System.out.println("b1: "+b1); // O/p: 22

        byte b2 = (byte)(short)(int)(long)(float)d1;    // Lowest datatype. this is valid.
                                                        // Here we're lowering down datatype one by one as per chart.
        System.out.println("b2: "+b2); // O/p: 22
    }
}
