package JavaBasics.Durgasoft.a4_Statements.SamplePrograms;

public class a2_even_or_odd {
    public static void main(String[] args) {
        evenOrOdd(11);
    }

    private static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
