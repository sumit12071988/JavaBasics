package JavaBasics.Durgasoft.a4_Statements.a1_Conditional_Statements;

public class a1_ClassVariables_and_LocalVariables_initializations {
//    static int j;   // No need to initialize j since it's a class variable and
//                    // class variables are pre-initialized with default values
    public static void main(String[] args) {
        int i = 10;
        int j = 0;      // Local variable must be initialized, else we'll get compilation error
        if (i == 10){
            j = 20;
        }
        System.out.println(j); // O/p: Compilation error
    }
}
