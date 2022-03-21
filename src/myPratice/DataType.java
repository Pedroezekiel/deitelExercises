package myPratice;

public class DataType {
    public static void main(String[] args) {
        int myValue = 10000;

        int minIntVAlue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("minIntVAlue=" + minIntVAlue);
        System.out.println("maxIntValue=" + maxIntValue);
        System.out.println("Busted Max Value=" + (maxIntValue + 3));
        System.out.println("Busted min Value=" + (minIntVAlue - 4));

        int myMaxIntTest = 2_147_483_647;

        byte mintByteValue =Byte.MAX_VALUE;
        byte maxByteValue =Byte.MIN_VALUE;
        System.out.println("byte mini Value="+mintByteValue);
        System.out.println("byte max value="+maxByteValue);

        short mintShortValue =Short.MAX_VALUE;
        short maxShortValue =Short.MIN_VALUE;
        System.out.println("short mini Value="+mintShortValue);
        System.out.println("short max value="+maxShortValue);

        long longValue=100;
        long minlongValue =Long.MAX_VALUE;
        long maxlongValue =Long.MIN_VALUE;
        System.out.println("long mini Value="+minlongValue);
        System.out.println("long max value="+maxlongValue);
        long bigLongValue = 2_147_483_6473L;
        System.out.println((bigLongValue));
        short bigShortValue = 32767;
    }
    }
