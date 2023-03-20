package JavaBasics.Durgasoft.a4_Statements.a1_Conditional_Statements;

public class a3_Local_variable_initialization_using_if_elseIf_else {
    public static void main(String[] args) {
        local_variable_initialization_using_If();
        local_variable_initialization_using_If_elseIf_else();
        local_variable_initialization_using_finalVariables();
        local_variable_initialization_using_ALWAYS_TRUE_condition();
    }

    private static void local_variable_initialization_using_If() {
        int i = 30;     // Local variable is initialized. Thus, no issues
        int j;          // When compiler comes here, it gets suspicious whether j will be initialized before its getting assigned or not
        if (i == 10){
            j = 20;     // When compiler notices that j is being initialized, but still not sure if during execution this condition is false,
                        // then j will be left un-initialized.
        }
//        System.out.println(j); // Here compiler notices j is getting assigned and initialization chances are 50-50, then raised compilation error
    }

    private static void local_variable_initialization_using_If_elseIf_else() {
        int i = 30;             // Local variable is initialized. Thus, no issues
        int j;                  // When compiler comes here, it gets suspicious whether j will be initialized before its getting assigned or not
        if (i == 10) {
            j = 20;             // Compiler notices j is being initialized in this "if" part but still there are chances of j remaining un-initialized
                                // if condition fails
        } else if (i == 20) {
            j = 40;             // Compiler notices j is being initialized in this "if" part but still there are chances of j remaining un-initialized
                                // if condition fails
        } else
            j=30;               // Compiler notices j is being initialized in else part as well.
                                // Now compiler is confident that there is no chance of j remaining un-initialized
        System.out.println(j);  // Here compiler won't raise compilation error
    }

    private static void local_variable_initialization_using_finalVariables() {
        final int i = 10;       // Local variable is a CONSTANT and initialized. Thus, no issues
        int j;                  // When compiler comes here, it gets suspicious whether j will be initialized before its getting assigned or not

        if (i == 10){           // Since "i" is a CONSTANT, compiler will replace i with constant value i.e. 10,
            // thus compiler reads this expression as if (10 == 10) which is ALWAYS TRUE
            j = 20;             // Thus, compiler is assured j WILL be initialized
        }

        System.out.println(j);  // Here compiler won't raise compilation error
    }

    private static void local_variable_initialization_using_ALWAYS_TRUE_condition() {
        int i = 10;
        int j;
        if(true){   // Compiler is assured that this condition will be ALWAYS TRUE
            j = 20; // Compiler is assured that j variable will be initialized always
        }
        System.out.println(j);  // Here compiler won't raise compilation error
    }


}
