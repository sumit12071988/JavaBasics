package JavaBasics.Durgasoft.a1_Operators;

public class a3_Boolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        System.out.println("a&b: "+(a & b));  // true
        System.out.println("a|b: "+(a | b));  // true
        System.out.println("a^b: "+(a ^ b));  // false

        a = true;
        b = false;
        System.out.println("a&b: "+(a & b));  // false
        System.out.println("a|b: "+(a | b));  // true
        System.out.println("a^b: "+(a ^ b));  // true

        a = false;
        b = true;
        System.out.println("a&b: "+(a & b));  // false
        System.out.println("a|b: "+(a | b));  // true
        System.out.println("a^b: "+(a ^ b));  // true

        a = false;
        b = false;
        System.out.println("a&b: "+(a & b));  // false
        System.out.println("a|b: "+(a | b));  // false
        System.out.println("a^b: "+(a ^ b));  // false

    }
}
