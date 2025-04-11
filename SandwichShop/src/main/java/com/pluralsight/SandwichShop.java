package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select A Sandwich\n- 1: Regular: base price $5.45\n- 2: Large: base price $8.95\n Select: ");
        if (!scanner.hasNextInt()){ //check for invalid input
            System.out.println("Invalid Input");
            return;
        }
        int selection = scanner.nextInt();
        float price = selection == 1 ? 5.45f : selection == 2 ? 8.95f : 0; //calculates the price based of previous selection defaulting to 0 for invalid selections
        if (price == 0) { //check for invalid selection
            System.out.println("Invalid Selection");
            return;
        }
        System.out.print("Would you like to make your sandwich loaded?\n- Regular: +$1.00\n- Large: +$1.75\n Select (Y/N): ");
        String is_loaded = scanner.next();
        if (is_loaded.equalsIgnoreCase("Y") || is_loaded.equalsIgnoreCase("Yes")){ //check if the response was yes
            price += selection == 1 ? 1 : 1.75f; //checks which sandwich selection was previously made and adds the appropriate price increase
        } else if (!(is_loaded.equalsIgnoreCase("N") || is_loaded.equalsIgnoreCase("No"))){ //check if there was an invalid input
            System.out.println("Invalid Input");
            return;
        }
        System.out.print("Enter Age: ");
        if (!scanner.hasNextInt()){ //check for invalid input
            System.out.println("Invalid Input");
            return;
        }
        int age = scanner.nextInt();
        float discount = age <= 17 ? .9f : age >= 65 ? .8f : 1; //calculates the discount based off age range
        System.out.println("Total Price After Discount: " + discount * price);

    }
}
