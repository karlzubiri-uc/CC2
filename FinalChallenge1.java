//Zubiri, Karl Stephen V.
//CITCS 1N, CC2

package com.zubirikarl.finalchallenge1;

public class FinalChallenge1 {
    public static void main(String[] args) {
        // Stock levels and prices for 10 products 
        int[] stockLevels = {5, 3, 8, 6, 2, 10, 4, 7, 9, 1}; //Sample stocks
        double[] prices = {525.0, 1100.0, 750.0, 437.5, 1210.0, 475.0, 900.0, 712.5, 275.0, 600.0}; //Sample prices

        // Calculation of total value of all items
        double totalValue = 0.0;
        for (int i = 0; i < stockLevels.length; i++) {
            totalValue += stockLevels[i] * prices[i];
        }

        // Output the total value of the stock in PHP
        System.out.printf("Total value of all items in stock: PHP %.2f\n", totalValue);
    }
}
