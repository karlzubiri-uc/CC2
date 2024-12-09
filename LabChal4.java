//Zubiri, Karl Stephen V.
//CITCS 1N - A, CC2
//Laboratory Challenge 4

package com.zubirikarl.labchal4;

//Import scanner
import java.util.Scanner;
public class LabChal4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double amount, discount, discountValue, total;
        
        System.out.println("Grocery Store Discount Calculator");
        
        //Utilize the scanner to get user input.
        System.out.print("Enter the total purchase amount: ");
        amount = scanner.nextInt();
        
        //Code the conditions.
        discount = 0;
        if (amount >= 0 && amount <= 999) {
            discount = .0;
        } else if (amount >= 1000 && amount <= 5000){
            discount = .05;
        } else if (amount >= 5001 && amount <= 10000){
            discount = .10;
        } else if (amount > 10000) {
            discount = .15;
        }
        
        //Code the formulas for the calculation.
        discountValue = (discount * amount);
        total = (amount - discountValue);
        
        
        //Code the output prompt.
        System.out.printf("Price of purchased: PHP %.2f", amount);
        System.out.println("\nDiscount applied: " + (int) (discount * 100) + "%");
        System.out.printf("Final price: PHP %.2f", total);
        
        scanner.close(); //Close scanner to avoid resource leak
    }
}