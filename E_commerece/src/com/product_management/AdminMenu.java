package com.product_management;

import java.util.Scanner;

public class AdminMenu {
	public void showMenu() {
		Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("===== ADMIN MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. View Customers");
            System.out.println("7. View All Orders");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.println("Add Product");
                break;

            case 2:
                System.out.println("View Products");
                break;

            case 3:
                System.out.println("Search Product");
                break;

            case 4:
                System.out.println("Update Product");
                break;

            case 5:
                System.out.println("Delete Product");
                break;

            case 6:
                System.out.println("View Customers");
                break;

            case 7:
                System.out.println("View All Orders");
                break;

            case 8:
                return;

            default:
                System.out.println("Invalid choice");
            }
        }
	}

}
