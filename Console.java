/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject14;

/**
 *
 * @author lenovo
 */
    public abstract class Console implements IConsole {
    private String consoleType;
    private String storeName;
    private int totalSales;

    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }

    @Override
    public String getStore() { return storeName; }

    @Override
    public int getTotalSales() { return totalSales; }

    // Abstract method – must be implemented by subclasses
    public abstract void printReport();
}

