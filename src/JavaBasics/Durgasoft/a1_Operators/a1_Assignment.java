package JavaBasics.Durgasoft.a1_Operators;

public class a1_Assignment {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);  // 5
        a += 2;                 // a = a+2 => 5+2 => 7
        System.out.println(a);  // 7
        a -= 2;                 // a = a-2 => 7-2  => 5
        System.out.println(a);  // 5
        a *= 2;                 // a = a*2 => 5*2 => 10
        System.out.println(a);  // 10
        a /= 2;                 // a = a/2 => 10/2 => 5
        System.out.println(a);  // 5
        a %= 2;                 // e = e%2 => 5%2 => Remainder of 5/2 => 1
        System.out.println(a);  // 1
    }
}
