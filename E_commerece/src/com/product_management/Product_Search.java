
package com.product_management;

import java.util.ArrayList;
import java.util.Scanner;

import com.product_management.Product_Management.Product;

public class Product_Search {

    private ArrayList<Product> products;

    public Product_Search(ArrayList<Product> products) {
        this.products = products;
    }

    public void searchProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Search by Product Name");
        System.out.println("2. Search by Category");
        System.out.println("3. Search by Brand");
        System.out.println("4. Search by Price Range");

        int choice = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        switch (choice) {

        case 1:
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            for (Product p : products) {
                if (p.getName().equalsIgnoreCase(name)) {
                    System.out.println(p);
                    found = true;
                }
            }
            break;

        case 2:
            System.out.print("Enter category: ");
            String category = sc.nextLine();

            for (Product p : products) {
                if (p.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(p);
                    found = true;
                }
            }
            break;

        case 3:
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            for (Product p : products) {
                if (p.getBrand().equalsIgnoreCase(brand)) {
                    System.out.println(p);
                    found = true;
                }
            }
            break;

        case 4:
            System.out.print("Enter minimum price: ");
            double min = sc.nextDouble();

            System.out.print("Enter maximum price: ");
            double max = sc.nextDouble();

            for (Product p : products) {
                if (p.getPrice() >= min && p.getPrice() <= max) {
                    System.out.println(p);
                    found = true;
                }
            }
            break;

        default:
            System.out.println("Invalid choice");
        }

        if (!found) {
            System.out.println("Product not found");
        }
    }
}

