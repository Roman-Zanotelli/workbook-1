package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Name: ");
        String name = scanner.next();
        System.out.print("Please Enter Hrs: ");
        float hrs_worked = scanner.nextFloat();
        System.out.print("Please Enter Rate: ");
        float pay_rate = scanner.nextFloat();
        System.out.println(name + " has grossed a total income of: $" + hrs_worked * pay_rate );
    }
}
