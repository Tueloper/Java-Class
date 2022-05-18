package com.tochijava;

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
        boolean isGroup = true;
        System.out.println(age);

//        reference types
        Date now = new Date();
        System.out.println(now);
    }
}
