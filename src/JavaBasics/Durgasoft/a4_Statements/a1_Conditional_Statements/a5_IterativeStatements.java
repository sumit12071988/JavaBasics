package JavaBasics.Durgasoft.a4_Statements.a1_Conditional_Statements;

import java.util.Arrays;
import java.util.List;

public class a5_IterativeStatements {
    public static void main(String[] args) {
//        for_loop_sample();
//        for_loop_without_initialization();
//        for_loop_with_any_statement_in_place_of_initialization();
//        for_loop_with_single_declaration_and_multiple_initializations_in_expression1();
//        for_loop_with_empty_condition();
//        for_loop_with_true_as_condition();
//        for_loop_with_false_as_condition();
//        for_loop_with_OR_as_condition();
//        for_loop_without_increment_or_decrement_operator();
//        for_loop_with_any_statement_in_place_of_increment_or_decrement_operator();
//        for_loop_using_Arraylist();
////        ----------------------------------------------------------------------------------
//        forEach_loop_sample();
//        forEach_streams_loop_sample();
////        ----------------------------------------------------------------------------------
//        while_loop_sample();
//        while_loop_with_variable_expression();
//        while_loop_with_constant_expression();
////        ----------------------------------------------------------------------------------
//        doWhile_loop_sample();
//        doWhile_loop_with_constant_expression();
//        doWhile_loop_with_variable_expression();
    }

    private static void for_loop_sample() {
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
    }
    private static void for_loop_without_initialization() {
        int i=0;
        for (; i<10; i++){          // Allowed as long as initialization done beforehand
            System.out.println(i);
        }
    }
    private static void for_loop_with_any_statement_in_place_of_initialization() {
        int i=0;
        for (System.out.println("Expression1"); i<10; i++){   // Allowed as long as initialization done beforehand
            System.out.println(i); // JVM executes Expression1 just ONCE, then starts iterations
        }
    }
    private static void for_loop_with_single_declaration_and_multiple_initializations_in_expression1() {
        for (int i=0, j =0; i<10 && j <10; i++,j++){
            System.out.println("i: "+i+" | j: "+j);
        }
    }

    private static void expression1_with_multiple_declarations_and_multiple_initializations() {
        for (int i=0, j =0; i<10 && j <10; i++,j++){
            System.out.println("i: "+i+" | j: "+j);
        }
    }

    private static void for_loop_with_empty_condition() {
        for (int i=0; ; i++){   // Allowed but results in INFINITE LOOP
            System.out.println(i);
        }
//        System.out.println("test");   // This won't work as the conditional expression if EMPTY is considered as true
                                        // which is a CONSTANT EXPRESSION which is evaluated by compiler.
                                        // Thus, compiler will flag it as UNREACHABLE STATEMENT
    }

    private static void for_loop_with_true_as_condition() {
        for (int i=0; true; i++){   // Allowed but results in INFINITE LOOP
            System.out.println(i);
        }
//        System.out.println("test");   // This won't work as the conditional expression is a CONSTANT EXPRESSION which is evaluated by compiler
                                        // Thus, compiler will flag it as UNREACHABLE STATEMENT
    }

    private static void for_loop_with_false_as_condition() {
//        for (int i=0; false; i++){   // Compiler considers loop body UNREACHABLE
//            System.out.println(i);
//        }
//        System.out.println("test");
    }

    private static void for_loop_with_OR_as_condition() {
        for (int i=0; i<=0 || i>=0 ; i++){  // Always true. Thus results in INFINITE LOOP
            System.out.println(i);
        }
        System.out.println("test"); // Compiler won't be able to tell if this is an UNREACHABLE STATEMENT or not,
                                    // since the Conditional expression (i<=0 || i>=0) is a VARIABLE EXPRESSION and
                                    // variable expression is always evaluated by JVM
    }

    private static void for_loop_without_increment_or_decrement_operator() {
        for (int i =0; i<10;){      // Infinite loop with O/p: 0
            System.out.println(i);
        }
    }

    private static void for_loop_with_any_statement_in_place_of_increment_or_decrement_operator() {
        for (int i =0; i<10; System.out.println("Testing")){      // expression3 is executed by the end of each iteration
            System.out.println(i);
            i++;
        }
    }
    // -------------------------------------------------------------------------
    private static void for_loop_using_Arraylist() {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        for (int i=0; i<arr.size(); i++){   // initialization ; condition ; increment/ decrement
            System.out.println("Array Element Picked: "+ arr.get(i));
        }
    }
    // -------------------------------------------------------------------------
    private static void forEach_loop_sample() {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        for( int ele : arr){
            System.out.println("Array Element Picked: "+ele);
        }
    }
    // -------------------------------------------------------------------------
    private static void forEach_streams_loop_sample() {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        arr.forEach( ele -> System.out.println("Array Element Picked: "+ele));
    }
    // -------------------------------------------------------------------------
    private static void while_loop_sample() {
        int i = 0;                  // initialization
        while (i<10){               // condition
            System.out.println(i);
            i++;                    // increment/ decrement
        }
    }

    private static void while_loop_with_constant_expression() {
        System.out.println("Before Loop");
        while(true){                            // Conditional expression here is a CONSTANT EXPRESSION, thus evaluated by compiler
            System.out.println("During Loop");  // Since Compiler notices above loop as INFINITE LOOP, thus next line of code is
        }                                       //      declared as UNREACHABLE STATEMENT
//        System.out.println("After Loop");     // Compiler declares this code as UNREACHABLE STATEMENT
    }

    private static void while_loop_with_variable_expression() {
        System.out.println("Before Loop");
        int i=0;
        while (i<=0 || i>=0){                   // Conditional expression here is a VARIABLE EXPRESSION, thus evaluated by JVM
            System.out.println("Inside Loop");  // Thus, even though loop is INFINITE LOOP, compiler won't raise any compilation error
            i=i+1;                              // for subsequent code as UNREACHABLE STATEMENT
        }
        System.out.println("After Loop");
    }
    // -------------------------------------------------------------------------
    private static void doWhile_loop_sample() {
        int i=0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
    private static void doWhile_loop_with_constant_expression() {
        System.out.println("Before Loop");
        int i = 0;
        do {
            System.out.println("Inside Loop");
            i++;
        }while (true);                      // Conditional expression here is a CONSTANT EXPRESSION, thus evaluated by compiler
//        System.out.println("After Loop"); // Since Compiler notices above loop as INFINITE LOOP, thus next line of code is
    }                                       //      declared as UNREACHABLE STATEMENT
    private static void doWhile_loop_with_variable_expression() {
        System.out.println("Before Loop");
        int i = 0;
        do {
            System.out.println("Inside Loop");
            i++;
        }while (i <=0 || i>=0);             // Conditional expression here is a VARIABLE EXPRESSION, thus evaluated by JVM
        System.out.println("After Loop");   // Thus, even though loop is INFINITE LOOP, compiler won't raise any compilation error
    }                                       // for subsequent code as UNREACHABLE STATEMENT


}
