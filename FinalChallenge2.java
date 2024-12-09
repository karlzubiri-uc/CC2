//Zubiri, Karl Stpehen V.
//CITCS 1N, CC2

package com.zubirikarl.finalchallenge2;

public class FinalChallenge2 {

    public static void main(String[] args) {
        // Number of cities and days
        int cities = 3;
        int days = 7;

        // Array of city names
        String[] cityNames = {"Baguio City", "Metro Manila", "Cebu"};

        // 2D array to store temperature data for 3 cities over 7 days
        double[][] temperatures = {
            {22, 21, 23, 24, 25, 22, 21}, // Temperatures for Baguio City
            {30, 31, 32, 29, 28, 30, 31}, // Temperatures for Metro Manila
            {28, 29, 30, 31, 30, 29, 28}  // Temperatures for Cebu
        };

        // Loop to calculate and display average temperature for each city
        for (int i = 0; i < cities; i++) {
            double sum = 0;
            double highest = temperatures[i][0];

            // To calculate the sum of temperatures and find the highest temperature for each city
            for (int j = 0; j < days; j++) {
                sum += temperatures[i][j];
                if (temperatures[i][j] > highest) {
                    highest = temperatures[i][j];
                }
            }

            // To calculate average temperature for each city
            double average = sum / days;

            // To print results
            System.out.println("\n" + cityNames[i] + ":");
            System.out.printf("Average Temperature: %.2f\n", average);
            System.out.println("Highest Temperature: " + highest);
        }
    }
}
