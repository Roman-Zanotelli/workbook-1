package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //1
        float bobSalary = 20, garySalary = 10, highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //2
        float carPrice = 20, truckPrice = 10;
        System.out.println("Lowest cost between cars/trucks is " + Math.min(carPrice, truckPrice));

        //3
        float rad = 7.25f;
        System.out.println("Circle area equals " + Math.PI * Math.pow(rad, 2));

        //4
        float origin = 5;
        System.out.println("Sqrt of origin equals " + Math.sqrt(origin));

        //5
        float a_x = 5, a_y = 10, b_x = 85, b_y = 50;
        System.out.println("Distance between point A and B equals " + Math.sqrt(Math.pow(a_x - b_x, 2) + Math.pow(a_y - b_y, 2)));

        //6
        float negative = -3.8f;
        System.out.println("Absolute value of negative value is " + Math.abs(negative));

        //7
        System.out.println("Random number between 0.0 and 1.0 is " + Math.random());
    }
}
