//Zubiri, Karl Stephen V.
//CITCS 1N-A, Laboratory Challenge 1 - Creating a Simple Console-Based Invoice

package com.zubirikarl.labchal1;


public class LabChal1 {

   public static void main(String[] args) {
        // Store Information
        System.out.println("Welcome to \"Tech Gadgets Sore\" \n");
        System.out.println("1234 Technology Blvd\nInnovation City, 54321\n");
        
        //Itemized List
        System.out.println("Item\t\t\tQuantity\t\tPrice (PHP)");
        System.out.println("----------------------------------------------------------");
        System.out.println("Laptop\t\t\t1\t\tPHP39999");
        System.out.println("Wireless mouse \t\t2\t\tPHP999");
        System.out.println("USB-C Cable\t\t3\t\tPHP250");
        System.out.println("Headphones\t\t1\t\tPHP4599");
        
        //Total Amount
        System.out.print("\nTotal Amount Due: \t\t\tPHP");
        System.out.println(39999 + (2*999) + (3*250) + 4599);
        
        //Thank you message
        System.out.println("\nThank you for shopping with us!\nVisit us again!");
    }
}
