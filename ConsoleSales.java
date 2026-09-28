/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject14;

/**
 *
 * @author lenovo
 */

      public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);   // call parent constructor
    }

    @Override
    public void printReport() {
        System.out.println("Console Type   : " + getConsoleType());
        System.out.println("Store Name     : " + getStore());
        System.out.println("Total Sales    : " + getTotalSales());
    }
}
