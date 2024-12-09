    //Zubiri, Karl Stephen V.
//CITCS 1N - A, CC2

package com.zubirikarl.labchal6;

import java.util.Scanner;
public class LabChal6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalStudents, present, absent; //Declare variables
        char attendance;
        
        System.out.print("Enter the total number of students: "); //User input prompt
        totalStudents = scanner.nextInt();
        
        present = 0;
        absent = 0;
        
        for (int i = 1; i <= totalStudents; i++){ //Loop for recording the present and absent students
            System.out.print("Is student " + i + " present? (Y/N): ");
            attendance = scanner.next().charAt(0); //will get the index 0 of the character
            
            switch (attendance) { //Cases for user input (Yes or No)
                case 'Y':
                case 'y':
                    present++; //Increment for the addition of every present student
                    break;
                case 'N':
                case 'n':
                    absent++; //Increment for the addition of every absent student
                    break;
                default:
                    System.out.println("Invalid input. Assuming " + i + " is absent");
                    break;
            }
        }
        
        System.out.print("Total of present students: " + present);
        System.out.print("\nTotal of absent students: " + absent);
        
        scanner.close(); //Close scanner to avoid resource leak
        
    }
}
