package JavaBasics.Durgasoft.a4_Statements.SamplePrograms;

public class a1_biggest_of_3_numbers {
    public static void main(String[] args) {
        biggestOf3numbers(10, 10, 20);
    }

    private static void biggestOf3numbers(int a, int b, int c) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        if(a == b && a == c){
            System.out.println(" All are same. Cannot find biggest");
        } else if (a == b && a > c) {
            System.out.println(" Both a and b are same and biggest");
        } else if (b == c && b > a) {
            System.out.println("Both b and c are same and biggest");
        } else if (a > b && a > c) {
            System.out.println("a is biggest");
        } else if (b > c) {
            System.out.println("b is biggest");
        }else {
            System.out.println("c is biggest");
        }

    }
}
