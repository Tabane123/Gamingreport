/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject14;

/**
 *
 * @author lenovo
 */
class GamingConsoleReport {
    public static void displayFullReport(){
        // Single-dimensional array for city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Two-dimensional array for sales data
        // rows = cities, columns = PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        // Console names (for the header)
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // ========== DISPLAY THE REPORT ==========
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %8s %8s %8s%n", "", "PS5", "XBOX", "SWITCH");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %8d %8d %8d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        // ========== TOTALS FOR EACH CITY ==========
        System.out.println("\nCONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int[] cityTotals = new int[cities.length];
        int maxSales = 0;
        String cityWithMostSales = "";

        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;
            System.out.printf("%-18s %d%n", cities[i], total);

            // Track city with the most sales
            if (total > maxSales) {
                maxSales = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
    }
}

