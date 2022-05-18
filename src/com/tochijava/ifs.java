package com.tochijava;

import java.util.Scanner;

public class ifs {
    public static void main(String[] args) {
        /*
        * +
        * -
        * /
        * *
        * modulus
        * */

        /*
        * Operators
        *
        * <
        * >
        * <=
        * >=
        * ==
        * !=
        * */

        boolean isTrue = 3 > 1;
        System.out.println(isTrue);

        boolean isFalse = 1 > 3;
        System.out.println("isFalse " + isFalse);

        String s1 = "Hello 1";
        String s2 = "Hello 2";
        s2 += "!";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Strings Not Equal " + (s1 != s2));
        System.out.println("Strings Equals " + s1.equals(s2));

        /*
        * More Operators
        *
        * && and || or
        *
        * */

//        is 32 divisible by 3
        int num = 71;
        boolean grapefruit = (num % 8  == 0) || (num % 5 == 0);

        if (grapefruit) {
            System.out.println(num + " is divisible by 3 and 5");
        } else {
            System.out.println(num + " is not divisible by 3 and 5");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Temperature:");
        int temp = Integer.parseInt(input.nextLine());

        if (temp >= 70) {
            System.out.println("Water is Boiling");
        } else if (temp > 70) {
            System.out.println("Water is hot");
        } else if (temp >= 50) {
            System.out.println("Water is Warm!");
        } else if (temp >= 25) {
            System.out.println("Water is at Room Temperature");
        } else if (temp >= 18) {
            System.out.println("Water is Cold");
        } else {
            System.out.println("Water is Freezing!");
        }
    }
}
