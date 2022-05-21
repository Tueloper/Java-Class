package com.tochijava;

import java.text.NumberFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        int is the variable type
//        age is the identifier
        /*Primitive types are storing simple values (numbers, char, boolean etc)*/
//        Reference types are for storing complex values
        byte age = 40;
        int count = 99908;
        long viewCount = 8_899_028_000_983_399L;
        float price = 10.87F;
        char letter = 'A';

//        this is a final constant and cannot not be changed
        final boolean isGroup = true;
        System.out.println(age);

//        reference types
        Date now = new Date();
        System.out.println(now);

//        integer class
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);

//        Math class
        int firstResult = (int)Math.ceil(1.1F);
        int second = Math.round(1.5F);
        System.out.println(firstResult);
        System.out.println(second);

//        number format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123876567897.998);
        System.out.println(result);
    }
}
