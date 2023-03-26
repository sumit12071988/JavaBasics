package JavaBasics.Durgasoft.a4_Statements.a1_Conditional_Statements;

public class a6_TransferStatements {
    public static void main(String[] args) {
//        break_in_loop();
//        continue_in_loop();
//        break_in_nested_loop();
//        continue_inside_nested_loop();
        labeled_break_inside_nested_loop();
//        labeled_continue_inside_nested_loop();
    }
    private static void break_in_loop() {
        System.out.println("Before Loop");
        for (int i=0; i<10; i++){
            if(i==5){
                System.out.println("Before Break");
                break;  // This will break loop iteration and come out
//                System.out.println("After Break");  // compiler declares any statements after break, as UNREACHABLE STATEMENT
            }
            System.out.println(i);          // O/p: 0, 1, 2, 3, 4
        }
        System.out.println("After Loop");
    }

    private static void continue_in_loop(){
        System.out.println("Before Loop");
        for (int i=0; i<10; i++){
            if(i==5){
                System.out.println("Before Continue");
                continue;   // Continue just SKIPS entire iteration of for loop when condition i==5. Continue will make JVM skip i=5 and CONTINUE wit i=6..9
//                System.out.println("After Continue");   // compiler declares any statements after continue, as UNREACHABLE STATEMENT
            }
            System.out.println(i);  // O/p: 0, 1, 2, 3, 4, 6, 7, 8, 9
        }
        System.out.println("After Loop");
    }



    private static void break_inside_nested_loop() {
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (j==4){
                    break;  // Adding break in inner loop with make execution come out of inner loop
                }
                System.out.println(i+" "+j);
            }
        }
    }

    private static void continue_inside_nested_loop() {
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    continue;  // Adding continue in inner loop with make execution SKIP that particular iteration in
                }              //  INNER LOOP and CONTINUE with next iteration in INNER LOOP
                System.out.println(i+" "+j);
            }
        }
    }

    private static void labeled_break_inside_nested_loop() {
        l1: for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    break l1;   // Adding labeled break instructs JVM to:
                                // 1. BREAK current INNER LOOP
                                // 2. MOVE JVM to OUTER LOOP where labeled break is specified
                                // 3. BREAK OUTER LOOP
                }
                System.out.println(i+" "+j);
            }
        }
    }

    private static void labeled_continue_inside_nested_loop() {
        l1: for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    continue l1;    // Adding labeled break instructs JVM to
                                    // 1. SKIP iteration with j=3 in INNER LOOP
                                    // 2. MOVE JVM to OUTER LOOP where labeled continue is specified
                                    // 3. SKIP iteration with i=0 in OUTER LOOP
                                    // 4. Increment i by 1 for next iteration and so on
                }
                System.out.println(i+" "+j);
            }
        }
    }





}
