//Zubiri, Karl Stephen V.
//CITCS 1N - A, CC2
package com.zubirikarl.finalchallenge5;

import javax.swing.*;

// Exception for Insufficient Funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Exception for Invalid Quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

public class FinalChallenge5 {

    // Banking System Implementation
    static class BankingSystem {
        private double balance;

        public BankingSystem(double initialBalance) {
            this.balance = initialBalance;
        }

        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Withdrawal denied! Insufficient funds in your account.");
            }
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful! Remaining balance: PHP" + balance);
        }
    }

    // Shopping Cart Implementation
    static class ShoppingCart {
        private int stock;

        public ShoppingCart(int stock) {
            this.stock = stock;
        }

        public void addProduct(int quantity) throws InvalidQuantityException {
            if (quantity < 0) {
                throw new InvalidQuantityException("Error: Quantity cannot be negative.");
            } else if (quantity > stock) {
                throw new InvalidQuantityException("Error: Quantity exceeds available stock.");
            }
            stock -= quantity;
            JOptionPane.showMessageDialog(null, "Product added to cart! Remaining stock: " + stock);
        }
    }

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Banking System", "Shopping Cart", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, 
                    "Select a program to run:",
                    "Exception Handling Lab",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice == 2 || choice == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }

            switch (choice) {
                case 0 -> runBankingSystem();
                case 1 -> runShoppingCart();
            }
        }
    }

    private static void runBankingSystem() {
        double initialBalance = 10000.0; // Initial balance
        BankingSystem account = new BankingSystem(initialBalance);
        JOptionPane.showMessageDialog(null, "Welcome to the Banking System! Your balance: PHP" + initialBalance);

        try {
            String input = JOptionPane.showInputDialog("Enter withdrawal amount:");
            if (input != null) {
                double amount = Double.parseDouble(input);
                account.withdraw(amount);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (InsufficientFundsException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void runShoppingCart() {
        int initialStock = 20; // Initial stock
        ShoppingCart cart = new ShoppingCart(initialStock);
        JOptionPane.showMessageDialog(null, "Welcome to the Online Shopping Cart! Available stock: " + initialStock);

        try {
            String input = JOptionPane.showInputDialog("Enter quantity to add to cart:");
            if (input != null) {
                int quantity = Integer.parseInt(input);
                cart.addProduct(quantity);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidQuantityException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
