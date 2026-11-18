/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIMANGELE
 */
public class PrintProduct {
    


    private Product productSelling;

    public PrintProduct(Product productSelling) {
        this.productSelling = productSelling;
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + productSelling.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        // (int) removes the decimals, so 17.0 prints as 17
        System.out.println("AVERAGE PRODUCT SALES: " + (int) productSelling.GetAverageProductSold());
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + productSelling.GetMostPopularProduct());
    }
}

