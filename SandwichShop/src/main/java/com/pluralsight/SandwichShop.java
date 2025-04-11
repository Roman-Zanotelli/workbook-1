package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select A Sandwich\n- 1: Regular: base price $5.45\n- 2: Large: base price $8.95\n Select: ");
        if (!scanner.hasNextInt()){
            System.out.println("Invalid Input");
            return;
        }
        int selection = scanner.nextInt();
        float price = selection == 1 ? 5.45f : selection == 2 ? 8.95f : 0;
        if (price == 0) {
            System.out.println("Invalid Selection");
            return;
        }
        System.out.print("Enter Age: ");
        if (!scanner.hasNextInt()){
            System.out.println("Invalid Input");
            return;
        }
        int age = scanner.nextInt();

        float discount = age <= 17 ? .9f : age >= 65 ? .8f : 1;
        System.out.println("Total Price After Discount: " + discount * price);

    }
}
