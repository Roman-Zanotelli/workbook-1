package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float first = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float second = scanner.nextFloat();
        //System.out.print("Possible calculations:\n(A)dd\n(S)ubtract \n(M)ultiply \n(D)ivide\nPlease select an option: ");
        System.out.print("Test: ");
        String option = scanner.next();
        System.out.println(first + " * " + second + " = " + first * second);
    }
}
