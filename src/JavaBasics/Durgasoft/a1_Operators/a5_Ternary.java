package JavaBasics.Durgasoft.a1_Operators;

public class a5_Ternary {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 2;

        int maxVal = val1 > val2 ? val1 : val2;
        System.out.println(maxVal); // 10

        int minVal = val1 < val2 ? val1 : val2;
        System.out.println(minVal); // 2

        System.out.println( val1 > val2 ? true : false );   // true
        System.out.println( val1 < val2 ? true : false );   // false
    }
}
