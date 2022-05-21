package com.tochijava;

import java.text.NumberFormat;
import java.util.Scanner;

public class calculator {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to CLI Mortgage Calculator");
        System.out.println("Please Input the following data");

//        declare variables
        int principal = 0;
        float interest = 0.0F;
        int years = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Principal (1K - 1M): ");
            principal = Integer.parseInt(input.nextLine());

            if (principal >= 1000 && principal <= 10000000)
                break;

            System.out.println("Enter a valid value with 1K to 1M...");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest = Float.parseFloat(input.nextLine());

            if (interest >= 1 && interest <= 30)
                break;

            System.out.println("Enter a valid value with 1 to 30...");
        }

        while (true) {
            System.out.print("Period (Years): ");
            years = Integer.parseInt(input.nextLine());

            if (years >= 1 && years <= 30)
                break;

            System.out.println("Enter a valid value with 1 to 30...");
        }


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
