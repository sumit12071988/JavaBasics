package JavaBasics.Durgasoft.a2_DataTypes;

public class a1_PrimitiveDataTypeRanges {
    public static void main(String[] args) {
//        System.out.println("boolean: "+ Boolean.MIN_VALUE+ " --> "+Boolean.MAX_VALUE);      // Constants MIN_VALUE and MAX_VALUE doesn't exist
        System.out.println("char: "+ Character.MIN_VALUE+ " --> "+Character.MAX_VALUE);       //   to ￿ (Some Invalid charaters)
        // ---------------------------------------------------------------------------
        System.out.println("byte: "+ Byte.MIN_VALUE+ " --> "+Byte.MAX_VALUE);                 // -128 to 127
        System.out.println("short: "+ Short.MIN_VALUE+ " --> "+Short.MAX_VALUE);              // -32768 to 32767
        System.out.println("int: "+ Integer.MIN_VALUE+ " --> "+Integer.MAX_VALUE);            // -2147483648 to 2147483647
        System.out.println("long: "+ Long.MIN_VALUE+ " --> "+Long.MAX_VALUE);                 // -9223372036854775808 to 9223372036854775807
        // ---------------------------------------------------------------------------
        System.out.println("float: "+ Float.MIN_VALUE+ " --> "+Float.MAX_VALUE);              // 1.4E-45 to 3.4028235E38
        System.out.println("double: "+ Double.MIN_VALUE+ " --> "+Double.MAX_VALUE);           // 4.9E-324 to 1.7976931348623157E308
    }
}
