package com.vts.datatypes;

public class DataTypesSample {

    public static void main(String[] args){
        // byte datatype
        byte myByte = 12;
        // short datatype
        short myShort = 123;
        // int datatype
        int myInt =225;
        // long data type
        long myLong = -25;

        float myFloat = 143.00f;
        double myDouble = 123123.123d;


        System.out.println("myByte: "+myByte);
        System.out.println("myShort: "+myShort);
        System.out.println("myInt: "+myInt);
        System.out.println("myLong: "+myLong);
        System.out.println("myFloat: "+myFloat);
        System.out.println("myDouble: "+myDouble);

        int sumMyByteShort = myByte+myShort;
        System.out.println("myByte+myShort: "+sumMyByteShort);

        float sumMyLongFloat = myLong+myFloat;
        System.out.println("myLong+myFloat: "+sumMyLongFloat);

        float divMyLongFloat = myLong%myFloat;
        System.out.println("div myLong+myFloat: "+divMyLongFloat);




    }

}
