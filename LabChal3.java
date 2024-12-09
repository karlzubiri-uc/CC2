//Zubiri, Karl Stephen V.
//CITCS 1N - A
//CC2 - Lab Challenge 3


package com.zubirikarl.labchal3;

//Import Scanner
import java.util.Scanner;
public class LabChal3 {

    public static void main(String[] args) {
        Scanner myCalculator = new Scanner(System.in);//Declare Scanner
        
        double cost1, cost2, cost3, quantity1, quantity2, quantity3;
        double total1, total2, total3, subtotal, discount, salesTax, discountValue, discountedPrice, salesTaxValue, finalTotal;
    
        //Program Name
        System.out.println("\nGrocery Shopping Calculator");
    
        //Write the code for user input
        System.out.print("What's the price of the first product?: ");
        cost1 = myCalculator.nextInt();
        System.out.print("Enter the quantity: ");
        quantity1 = myCalculator.nextInt();
        System.out.print("What's the price of the second product?: ");
        cost2 = myCalculator.nextInt();
        System.out.print("Enter the quantity: ");
        quantity2 = myCalculator.nextInt();
        System.out.print("What's the price of the third product?: ");
        cost3 = myCalculator.nextInt();
        System.out.print("Enter the quantity: ");
        quantity3 = myCalculator.nextInt();
    
        //Code the values and formulas
        total1 = (cost1 * quantity1);
        total2 = (cost2 * quantity2);
        total3 = (cost3 * quantity3);
        subtotal = (total1 + total2 + total3);
        discount = .05;
        salesTax = .12;
        discountValue = (discount * subtotal);
        discountedPrice = (subtotal - discountValue);
        salesTaxValue = (salesTax * discountedPrice);
        finalTotal = (discountedPrice + salesTaxValue);
    
        //Code the result prompt
        System.out.println("You have bought the following: ");
        System.out.println("Item 1: " + cost1 + " x" + quantity1);
        System.out.println("Item 2: " + cost2 + " x" + quantity2);
        System.out.println("Item 3: " + cost3 + " x" + quantity3);
        System.out.printf("Subtotal: PHP %.2f\n", subtotal);
        System.out.printf("Discount: PHP %.2f\n", discountValue);
        System.out.printf("Sales Tax: PHP %.2f\n", salesTaxValue);  
        System.out.printf("Final Total: PHP %.2f\n", + finalTotal);
    
    }
}
