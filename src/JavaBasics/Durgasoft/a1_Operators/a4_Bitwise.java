package JavaBasics.Durgasoft.a1_Operators;

public class a4_Bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        // Since using bitwise operators,we need to convert them into bits
        // a = 10 = 1010
        // b =  2 = 0010

        // Then we compare a and b bit by bit, from right to left

        System.out.println((a & b));
        // a: 1010
        // b: 0010
        //------------
        //    0010 ==> Converting to decimal => 2

        System.out.println((a | b));
        // a: 1010
        // b: 0010
        //------------
        //    1010 ==> Converting to decimal => 10

        System.out.println((a ^ b));
        // a: 1010
        // b: 0010
        //------------
        //    1000 ==> Converting to decimal => 8

        System.out.println((a << b));
        // Convert a into 8 bit decimals
        // a in 4-bit = 1010 in, in 8-bits = 00001010
        // a << b means shift a for b times
        // 00001010 << 2 means remove 2 bits from left and add 2 0's in the right
        // thus 00001010 << 2 becomes 00101000
        // Convert 8-bit to 4-bit and then to decimals i.e. 101000 = 1*(2^5) + 0*(2^4) + 1*(2^3) + 0*(2^2) + 0*(2^1) + 0*(2^0) = 32+8 = 40

        System.out.println((a >> b));
        // Convert a into 8 bit decimals
        // a in 4-bit = 1010 in, in 8-bits = 00001010
        // a >> b means shift a for b times
        // 00001010 >> 2 means remove 2 bits from right and add 2 0's in the left
        // thus 00001010 << 2 becomes 00000010
        // Convert 8-bit to 4-bit and then to decimals i.e. 0010 = 2
    }
}
