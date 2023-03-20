package JavaBasics.Durgasoft.a3_TypeCastings;

public class a1_ImplicitTypeCasting {
    public static void main(String[] args) {
        // ----- TYPE CASTING from byte to int | ALLOWED -------------------
        byte a = 10;
        int b = a;  // At this line:
                    // 1. During normal mode, COMPILER CHECKS TYPE CASTING COMPATIBILITY.
                    // 2. During runtime, JVM does actual TYPE CASTING.
        System.out.println(b);  // 10

        // ----- TYPE CASTING from long to float | ALLOWED ------------------
        long c = 10;
        float d = c;
        System.out.println(d); // 10.0

        // ----- TYPE CASTING from int to byte | NOT ALLOWED ----------------
        int e = 10;
//      byte f = e; // At this line, we'll get compilation error since, we're trying to type cast from
                    // higher data type (int) to lower data type (byte) which is not allowed

        // ----- TYPE CASTING from float to long | NOT ALLOWED --------------
        float g = 10.04f;
//      long h = g;    // Compilation error since attempting to convert
                       // higher data type (float) to lower data type (long)

        // ----- Assigning number exceeding data types range | NOT ALLOWED ----
//       byte i = 128;   // Compilation error since byte range is -128 to 127

        // ----- Additions of two data types --------
        byte j = 120;
        byte k = 100;
//      byte l = j+k; // Compilation error

        // ---- RULES FOR IMPLICIT CONVERSION DURING ADDITION -----------------
        //  byte + byte = int
        //  byte + short = int
        //  int + int = int
        //  byte + long = long
        //  int + long = long
        //  long + float = float
        //  float + double = double
    }
}
