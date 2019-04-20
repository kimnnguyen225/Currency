package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double value = .012;

        double pSum = value + value + value; //primitive Sum

        System.out.println("Sum of primitives: " + pSum);
        // to get a precise result, use BigDecimal and BigInteger
        // 1st must convert double type to a string type
        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        // create a BigDecimal instance named bigValue
        // and assign string value strValue to bigValue instance
        BigDecimal bigValue = new BigDecimal(strValue);
        // create bSum instance of BigDecimal class
        // then add bigValue 3 times using the .add() method
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals: " + bSum.toString());
    }
}
