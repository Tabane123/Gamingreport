/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject14;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;



public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== NUMBER 1 ELECTRONICS =====");
            System.out.println("1. View Full Gaming Console Report (Question 1 - Arrays)");
            System.out.println("2. Enter New Console Sales (Question 2 - OOP)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    // Run Question 1 (Arrays)

                    GamingConsoleReport.displayFullReport();
                    break;

                case 2:
                    // Run Question 2 (Select option + OOP)
                    System.out.println("\n----- Enter New Console Sales -----");
                    System.out.println("Select Console Type:");
                    System.out.println("1. PS5");
                    System.out.println("2. XBOX");
                    System.out.println("3. NINTENDO SWITCH");
                    System.out.print("Enter your choice (1-3): ");

                    int consoleChoice = scanner.nextInt();
                    scanner.nextLine();

                    String consoleType;
                    switch (consoleChoice) {
                        case 1: consoleType = "PS5"; break;
                        case 2: consoleType = "XBOX"; break;
                        case 3: consoleType = "NINTENDO SWITCH"; break;
                        default:
                            System.out.println("Invalid choice! Defaulting to PS5.");
                            consoleType = "PS5";
                    }

                    System.out.print("Enter Store Name: ");
                    String storeName = scanner.nextLine();

                    System.out.print("Enter Total Amount of Sales: ");
                    int totalSales = scanner.nextInt();

                    ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
                    sales.printReport();
                    break;

                case 3:
                    System.out.println("Thank you for using Number 1 Electronics system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}

