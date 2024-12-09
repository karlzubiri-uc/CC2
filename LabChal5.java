//Zubiri, Karl Stephen V.
//CC2, Lab Challenge 5

package com.zubirikarl.labchal5;

//Import scanner
import java.util.Scanner;
public class LabChal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Use the scanner
        
        //Declare variables
        boolean exit = false;
        int quantity, totalAmount, price1 = 100, price2 = 50, price3 = 30, price4 = 45, choice;
        
        //Make the loop for user input
        while (!exit) {
            System.out.println("\nMENU");
            System.out.println("1. Burger \t- PHP " + price1);
            System.out.println("2. Fries \t- PHP " + price2);
            System.out.println("3. Soda \t- PHP " + price3);
            System.out.println("4. Ice Cream \t- PHP " + price4);
            System.out.println("5. Exit");
            System.out.print("Please enter your order: ");
            choice = scanner.nextInt();
            
            switch (choice){ //Make the switch cases for the user choice
                case 1, 2, 3, 4:
                    System.out.print("How many would you like to order?: ");
                    quantity = scanner.nextInt();
                    if (quantity > 0 && choice == 1){
                        System.out.println("You've ordered " + quantity + ".");
                        totalAmount = quantity * price1;
                        System.out.println("The total amount is: " + totalAmount + " PHP");
                    } else if (quantity > 0 && choice == 2){
                        System.out.println("You've ordered " + quantity + ".");
                        totalAmount = quantity * price2;
                        System.out.println("The total amount is: " + totalAmount + " PHP");
                    } else if (quantity > 0 && choice == 3){
                        System.out.println("You've ordered " + quantity + ".");
                        totalAmount = quantity * price3;
                        System.out.println("The total amount is: " + totalAmount + " PHP");
                    } else if (quantity > 0 && choice == 4){
                        System.out.println("You've ordered " + quantity + ".");
                        totalAmount = quantity * price4;
                        System.out.println("The total amount is: " + totalAmount + " PHP");
                    } else {
                        System.out.println("Enter a valid quantity.");
                    }
                    break;
                case 5: 
                    System.out.println("Thank you for trusting our service!");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Error. Enter a valid choice.");
            }
        }
        
        scanner.close(); //Close the scanner to avoid resource leak  
    }
}
