package com.tochijava;

import java.text.NumberFormat;
import java.util.Scanner;

public class calculator {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to CLI Mortgage Calculator");
        System.out.println("Please Input the following data");

        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = Integer.parseInt(input.nextLine());

        System.out.print("Annual Interest Rate: ");
        float interest = Float.parseFloat(input.nextLine());

        System.out.print("Period (Years): ");
        int years = Integer.parseInt(input.nextLine());

//        format interest per month in percentage
        double monthlyInterest = formatInterest(interest);
        int monthlyYears = convertYears(years);

//          calculate mortgage
        double calValue = calculateMortgagePercent(principal, monthlyInterest, monthlyYears);

        System.out.println("Mortgage: " + formatCurrency(calValue));
    }

    private static double formatInterest(float percent) {
        return percent / PERCENT / MONTHS_IN_YEAR;
    }

    private static int convertYears(int year) {
        return year * MONTHS_IN_YEAR;
    }

    private static double calculateMortgagePercent(int principal, double interest, int years) {
       return principal
        * (interest * Math.pow(1 + interest, years)
        / Math.pow(1 + interest, years) - 1);
    }

    private static String formatCurrency(double mortgageInterest) {
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgageInterest);
        return mortgageFormat;
    }
}
