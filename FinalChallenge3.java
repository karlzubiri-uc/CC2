//Zubiri, Karl Stephen V.
//CITCS 1N, CC2

package com.zubirikarl.finalchallenge3;

import java.util.Scanner;
public class FinalChallenge3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // To store student names
        String[] students = new String[5];
        // To store grades for 3 subjects
        double[][] grades = new double[5][3];

        // Student names
        System.out.println("Enter the names of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        // Grades for each student
        System.out.println("\nEnter grades for each student in 3 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Grades for " + students[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
        }

        // To calculate and display average grades
        System.out.println("\nStudent Average Grades:");
        for (int i = 0; i < 5; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += grades[i][j];
            }
            double average = total / 3;
            System.out.printf("%s: %.2f%n", students[i], average);
        }

        scanner.close(); //Close scanner
    }
}
