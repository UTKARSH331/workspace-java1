package com.product_management;

import java.util.Scanner;

public class CustomerMenu {
	  public void showMenu() {

	        Scanner sc = new Scanner(System.in);

	        while (true) {

	            System.out.println("===== CUSTOMER MENU =====");
	            System.out.println("1. Register");
	            System.out.println("2. Login");
	            System.out.println("3. View Products");
	            System.out.println("4. Search Product");
	            System.out.println("5. Add Product to Cart");
	            System.out.println("6. View Cart");
	            System.out.println("7. Remove Product from Cart");
	            System.out.println("8. Place Order");
	            System.out.println("9. View My Orders");
	            System.out.println("10. Cancel Order");
	            System.out.println("11. Logout");

	            int choice = sc.nextInt();

	            switch (choice) {

	            case 1:
	                System.out.println("Register");
	                break;

	            case 2:
	                System.out.println("Login");
	                break;

	            case 3:
	                System.out.println("View Products");
	                break;

	            case 4:
	                System.out.println("Search Product");
	                break;

	            case 5:
	                System.out.println("Add Product to Cart");
	                break;

	            case 6:
	                System.out.println("View Cart");
	                break;

	            case 7:
	                System.out.println("Remove Product from Cart");
	                break;

	            case 8:
	                System.out.println("Place Order");
	                break;

	            case 9:
	                System.out.println("View My Orders");
	                break;

	            case 10:
	                System.out.println("Cancel Order");
	                break;

	            case 11:
	                return;

	            default:
	                System.out.println("Invalid choice");
	            }
	        }
	    }

}
