package com.tochijava;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        int[] newArray = { 1, 2, 3, 4, 5, 4, 2, 1, 9 };
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

//        multidimensional arrays
        int[][] multi = new int[2][3];
        System.out.println(Arrays.deepToString(multi));
    }
}
