//Karl Stephen V. Zubiri
//CITCS 1N - A, CC2, Lab Challenge 2
//September 7, 2024


package com.zubirikarl.labchal2;

//Import Scanner
import java.util.Scanner;
public class LabChal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Use Scanner
        
        //Declare variables
        int length, width, area, perimeter;
        
        
        //Prompt for user input
        System.out.println("Garden Area and Perimeter Calculator");     
      
        System.out.print("\nEnter the length (m): ");
        length = scanner.nextInt();

        System.out.print("Enter the width (m): ");
        width = scanner.nextInt();
        
        //Code the formula
        area = (length * width); 
        perimeter = 2 * (length + width);

        System.out.println("\n");

        //Code the output prompt
        System.out.println("Calculation Successful!");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
        scanner.close(); //Close scanner to avoid resource leak
    }
}
