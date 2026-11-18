/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIMANGELE
 */
public class Product implements IProduct {

    // Single array: stores the 3 product names
    private String[] products;

    // Two-dimensional array: rows = products, columns = months
    // selling[0][1] = Cozy Nights Monarch, month 2
    private int[][] selling;

    // Constructor: receives the data when we create a Product
    public Product(String[] products, int[][] selling) {
        this.products = products;
        this.selling = selling;
    }

    // Adds up the sales of ONE product over the 3 months
    private int GetProductTotal(int productNumber) {
        int total = 0;
        for (int month = 0; month < 3; month++) {
            total = total + selling[productNumber][month];
        }
        return total;
    }

    // Adds up ALL sales of ALL products
    public int GetTotalProductsSold() {
        int total = 0;
        for (int productNumber = 0; productNumber < 3; productNumber++) {
            total = total + GetProductTotal(productNumber);
        }
        return total;
    }

    // Average = total sales divided by 9 (3 products x 3 months)
    public double GetAverageProductSold() {
        double total = GetTotalProductsSold();
        return total / 9;
    }

    // Finds the product with the highest total sales
    public String GetMostPopularProduct() {
        int bestProduct = 0;   // start by assuming the first product is best

        for (int productNumber = 1; productNumber < 3; productNumber++) {
            if (GetProductTotal(productNumber) > GetProductTotal(bestProduct)) {
                bestProduct = productNumber;
            }
        }

        return products[bestProduct] + " (" + GetProductTotal(bestProduct) + ")";
    }
}


