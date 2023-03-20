package JavaBasics.Durgasoft.a4_Statements.a1_Conditional_Statements;

public class a4_Switch {
    public static void main(String[] args) {
        normalSwitch(12);
        enhancedSwitch(12);
        using_final_variables_as_case_values();
        using_case_values_exceeding_datatype_range();
    }

    private static void normalSwitch(int i) {
        switch (i) {

            case 5:
                System.out.println("Five");
                break;

            case 10:
                System.out.println("Ten");
                break;

            case 15:
                System.out.println("Fifteen");
                break;

            case 20:
                System.out.println("Twenty");
                break;

            default:
                System.out.println("Value of i is not matching with any options");
                break;
        }
    }

    private static void enhancedSwitch(int i) {
        switch (i) {
            case 5 -> System.out.println("Five");
            case 10 -> System.out.println("Ten");
            case 15 -> System.out.println("Fifteen");
            case 20 -> System.out.println("Twenty");
            default -> System.out.println("Value of i is not matching with any options");
        }
    }

    private static void using_final_variables_as_case_values() {
       final int i = 5, j = 10, k = 15, l = 20;
        switch (10){
            case i -> System.out.println("Five");
            case j -> System.out.println("Ten");
            case k -> System.out.println("Fifteen");
            case l -> System.out.println("Twenty");
            default -> System.out.println("Result doesn't matches with any available options");
        }
    }

    private static void using_case_values_exceeding_datatype_range() {
        byte b = 126;
//        switch (b){
//            case 126 -> System.out.println("126");
//            case 128 -> System.out.println("128");  // case option not allowed since option value exceeds datatype "byte" range
//            default -> System.out.println("No switch cases matching");
//        }
    }



}
