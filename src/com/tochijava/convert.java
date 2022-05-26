/*
* Name: Tochukwu Ozurumba
* Student Id: A0023457787
* Description: This is a basic conversion calculator that will help convert your various units. Its an assignment done by Tochukwu Ozurumba.
*
* */
package com.tochijava;

import java.util.Scanner;

public class convert {
//    This is a global variable input, that is initialized once and used across all methods and functions
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Welcome print notes
        System.out.println("Welcome to CLI Conversion Calculator");
        System.out.println("This is not like your popular calculator. Please read carefully and understand the following instructions");
        System.out.println("Also please input details when asked to, thanks, have fun 😁.");

//        declaring variables
        int number = 0;
//        Introducing the various conversion units available
        System.out.println("Which of the following do you want to convert?");
        System.out.println("""
            1. Km - m\s
            2. m - Km\s
            3. cm - In\s
            4. In - cm\s
            5. Kg - lb\s
            6. lb - kg\s
            7. g - oz\s
            8. oz - g\s
            9. Cel - Fa\s
            10. Fa - Cel\s
            11. L - cups\s
            12. cups - L\s
            """
        );

        while (true) {
            System.out.print("Please pick the number of conversion: ");
            number = Integer.parseInt(input.nextLine());

            if (number >= 1 && number <= 12)
                break;

            System.out.println("Enter a valid number...");
        }

        String result;

//        check conversion number selection and process
        switch (number) {
            case 1 -> {
                double kmValidatedInput = getAndValidateInput("km");
                result = convertKilometerToMiles(kmValidatedInput);
            }
            case 2 -> {
                double milesValidatedInput = getAndValidateInput("miles");
                result = convertMilesToKilometer(milesValidatedInput);
            }
            case 3 -> {
                double centimeterValidatedInput = getAndValidateInput("cm");
                result = convertCentimeterToInches(centimeterValidatedInput);
            }
            case 4 -> {
                double inchesValidatedInput = getAndValidateInput("inches");
                result = convertInchesToCentimeter(inchesValidatedInput);
            }
            case 5 -> {
                double kilometerValidatedInput = getAndValidateInput("kg");
                result = convertKilogramToPounds(kilometerValidatedInput);
            }
            case 6 -> {
                double poundsValidatedInput = getAndValidateInput("lb");
                result = convertPoundsToKilogram(poundsValidatedInput);
            }
            case 7 -> {
                double gramsValidatedInput = getAndValidateInput("g");
                result = convertGramsToOz(gramsValidatedInput);
            }
            case 8 -> {
                double ozValidatedInput = getAndValidateInput("oz");
                result = convertOzToGrams(ozValidatedInput);
            }
            case 9 -> {
                double celsiusValidatedInput = getAndValidateInput("C");
                result = convertCelsiusToFaience(celsiusValidatedInput);
            }
            case 10 -> {
                double faienceValidatedInput = getAndValidateInput("F");
                result = convertFaienceToCelsius(faienceValidatedInput);
            }
            case 11 -> {
                double litreValidatedInput = getAndValidateInput("L");
                result = convertLitreToCups(litreValidatedInput);
            }
            case 12 -> {
                double cupValidatedInput = getAndValidateInput("cups");
                result = convertCupsToLitre(cupValidatedInput);
            }
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }

//        print the result after conversion
        System.out.println(result);
    }

    private static double getAndValidateInput(String unit) {
        double conversionValue;
        while (true) {
            System.out.print("Enter a value to convert in (" + unit + "): ");
            conversionValue = Double.parseDouble(input.nextLine());

            if (conversionValue >= 0 && conversionValue <= 100)
                break;

            System.out.println("Value Invalid, Enter a valid value to convert...");
        }

        return conversionValue;
    }

    private static String convertKilometerToMiles(double validatedInput) {
        return validatedInput * 0.62 + " miles";
    }

    private static String convertMilesToKilometer(double validatedInput) {
        return validatedInput * 1.61 + " km";
    }

    private static String convertCentimeterToInches(double validatedInput) {
        return validatedInput * 0.39 + " inches";
    }

    private static String convertInchesToCentimeter(double validatedInput) {
        return validatedInput * 2.54 + " cm";
    }

    private static String convertKilogramToPounds(double validatedInput) {
        return validatedInput * 2.2 + " lb";
    }

    private static String convertPoundsToKilogram(double validatedInput) {
        return validatedInput * 0.45 + " kg";
    }

    private static String convertGramsToOz(double validatedInput) {
        return validatedInput * 0.04 + " oz";
    }

    private static String convertOzToGrams(double validatedInput) {
        return validatedInput * 28.35 + " g";
    }

    private static String convertCelsiusToFaience(double validatedInput) {
        return (validatedInput * 9 / 5) + 32 + " F";
    }

    private static String convertFaienceToCelsius(double validatedInput) {
        return (validatedInput - 32) * 5 / 9 + " C";
    }

    private static String convertLitreToCups(double validatedInput) {
        return validatedInput * 4.17 + " cups";
    }

    private static String convertCupsToLitre(double validatedInput) {
        return validatedInput * 0.24 + " L";
    }
}
