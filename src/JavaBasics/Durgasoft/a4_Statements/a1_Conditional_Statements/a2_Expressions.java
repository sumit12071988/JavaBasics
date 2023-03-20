package JavaBasics.Durgasoft.a4_Statements.a1_Conditional_Statements;

public class a2_Expressions {
    public static void main(String[] args) {
        constant_expression_samples();
        variable_expression_samples(10, 20);
    }

    private static void constant_expression_samples() {
        // Example1
        if (10 == 10) {
            System.out.println("test");
        }

        // Example2
        if (true) {
            System.out.println("test");
        }

        // Example3
        int i = 10;
        if (i == 11) {
            System.out.println("test");
        }

        // Example4
        final int j = 101;
        if (j != 100) {
            System.out.println("test");
        }
    }

    private static void variable_expression_samples(int i, int j) {
        // Example1
        if (i < j) {
            System.out.println("test");
        }

        // Example2
        if (i == j) {
            System.out.println("test");
        }

        // Example3
        if (i == j || i < j) {
            System.out.println("test");
        }



    }
}
