package JavaBasics;

/**
 * @author Sumit
 * To understand increment and decrement operators
 */
public class IncrementAndDecrement {
    public static void main(String[] args) {
        // ++ : Increase the value of the operator by 1
        // -- : Decrease the value of the operator by 1

//************************************************************************************
        int i=1;
        int j=i++;  // post increment
                    // i.e value of i is first assigned to j and then incremented i by 1

        System.out.println(i);  //  O/p: 2
        System.out.println(j);  //  O/p: 1
//************************************************************************************
        int m=1;
        int n=++m;  //pre increment
                    //i.e value of m is first incremented by 1 and then assigned to n

        System.out.println(m);  //  O/p: 2
        System.out.println(n);  //  O/p: 2
//************************************************************************************
        int h=2;
        int g=h--;  //post decrement
                    //i.e value of h is first assigned to g and then decremented by 1
        System.out.println(h);  //  O/p: 1
        System.out.println(g);  //  O/p: 2
//************************************************************************************
        int k=2;
        int l=--k;  // pre decrement
                    //i.e value of k is first decremented by 1 and then assigned to l
        System.out.println(k);  //  O/p: 1
        System.out.println(l);  //  O/p: 1

        int q=0;
        int r=--q;
        System.out.println(k);  //  O/p: -1
        System.out.println(l);  //  O/p: -1

        int a,b,c =10;  // used if we want to assign same value to all 3 variables



    }
}
