//Zubiri, Karl Stephen V.
//CITCS 1N - A

package com.zubirikarl.labchal7;

import java.util.Scanner;

public class LabChal7 {

    public static void main(String[] args) {
        // Initialize variables at the top
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        String password;
        boolean hasUpperCase;
        boolean hasNumber;

        while (!isValid) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            // To reset the flags for each password attempt
            hasUpperCase = false;
            hasNumber = false;

            // To check if password has at least 8 characters
            if (password.length() >= 8) {
                // Loop through each character in the password
                for (int i = 0; i < password.length(); i++) {
                    char c = password.charAt(i);

                    // To check for an uppercase letter
                    if (Character.isUpperCase(c)) {
                        hasUpperCase = true;
                    }

                    // To check for a number
                    if (Character.isDigit(c)) {
                        hasNumber = true;
                    }
                }

                // To confirm if all conditions are met
                if (hasUpperCase && hasNumber) {
                    System.out.println("Your password is valid!");
                    isValid = true;
                } else {
                    System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
                }
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
        // Close scanner
        scanner.close();
    }
}
