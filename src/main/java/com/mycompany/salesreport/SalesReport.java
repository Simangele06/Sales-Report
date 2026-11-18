/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author SIMANGELE
 */
import java.util.*;
public class SalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // A single Array
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        // A 2D Array
        int[][] selling = new int[3][3];

        // Ask the user for the sales of every product, month by month
        for (int productNumber = 0; productNumber < 3; productNumber++) {
            for (int month = 0; month < 3; month++) {
                System.out.print("Enter number of sales for month " + (month + 1)
                        + " for " + products[productNumber] + " mattress: ");
                selling[productNumber][month] = input.nextInt();
            }
            System.out.println();   // blank line between products
        }

        // Create the objects
        Product productSelling = new Product(products, selling);
        PrintProduct printer = new PrintProduct(productSelling);

        // Print the report
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("*****************************************");
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();
    }
}

        
    