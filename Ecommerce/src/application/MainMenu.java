package application;

import java.util.Scanner;

import models.Customer;

import service.CartService;
import service.CustomerService;
import service.OrderService;
import service.ProductService;

public class MainMenu {

    private ProductService productService;
    private CustomerService customerService;
    private CartService cartService;
    private OrderService orderService;

    private Scanner scanner;

    private AdminMenu adminMenu;
    private CustomerMenu customerMenu;

    public MainMenu(
            ProductService productService,
            CustomerService customerService,
            CartService cartService,
            OrderService orderService) {

        this.productService = productService;
        this.customerService = customerService;
        this.cartService = cartService;
        this.orderService = orderService;

        scanner = new Scanner(System.in);

        adminMenu =
                new AdminMenu(
                        productService,
                        customerService,
                        cartService,
                        orderService
                );

        customerMenu =
                new CustomerMenu(
                        productService,
                        customerService,
                        cartService,
                        orderService
                );
    }

    public void start() {

        boolean running = true;

        while (running) {

            printMainMenu();

            int choice = readInt();

            try {

                switch (choice) {

                    case 1:

                        adminLogin();

                        break;

                    case 2:

                        customerLogin();

                        break;

                    case 3:

                        registerCustomer();

                        break;

                    case 0:

                        running = false;

                        System.out.println(
                                "\nThank you for using "
                                        + "E-Commerce Management System."
                        );

                        break;

                    default:

                        System.out.println(
                                "Invalid choice."
                        );
                }

            } catch (RuntimeException e) {

                System.out.println(
                        "\nError: "
                                + e.getMessage()
                );
            }
        }

        scanner.close();
    }

    private void printMainMenu() {

        System.out.println();

        System.out.println(
                "=========================================="
        );

        System.out.println(
                "       E-COMMERCE MANAGEMENT SYSTEM"
        );

        System.out.println(
                "=========================================="
        );

        System.out.println(
                "1. Admin Login"
        );

        System.out.println(
                "2. Customer Login"
        );

        System.out.println(
                "3. Register Customer"
        );

        System.out.println(
                "0. Exit"
        );

        System.out.println(
                "=========================================="
        );

        System.out.print(
                "Enter your choice: "
        );
    }

    private void adminLogin() {

        System.out.println();

        System.out.println(
                "---------- ADMIN LOGIN ----------"
        );

        System.out.print(
                "Username: "
        );

        String username =
                scanner.nextLine();

        System.out.print(
                "Password: "
        );

        String password =
                scanner.nextLine();

        if (username.equals("admin")
                && password.equals("admin123")) {

            System.out.println(
                    "\nAdmin login successful."
            );

            adminMenu.start();

        } else {

            System.out.println(
                    "\nInvalid admin username or password."
            );
        }
    }

    private void customerLogin() {

        System.out.println();

        System.out.println(
                "---------- CUSTOMER LOGIN ----------"
        );

        System.out.print(
                "Customer ID: "
        );

        int customerId = readInt();

        System.out.print(
                "Password: "
        );

        String password =
                scanner.nextLine();

        try {

            Customer customer =
                    customerService.login(
                            customerId,
                            password
                    );

            System.out.println();

            System.out.println(
                    "Customer login successful."
            );

            System.out.println(
                    "Welcome, "
                            + customer.getName()
                            + "!"
            );

            customerMenu.start(
                    customerId
            );

        } catch (RuntimeException e) {

            System.out.println(
                    "\nLogin failed: "
                            + e.getMessage()
            );
        }
    }

    private void registerCustomer() {

        System.out.println();

        System.out.println(
                "---------- CUSTOMER REGISTRATION ----------"
        );

        System.out.print(
                "Customer ID: "
        );

        int customerId = readInt();

        System.out.print(
                "Name: "
        );

        String name =
                scanner.nextLine();

        System.out.print(
                "Email: "
        );

        String email =
                scanner.nextLine();

        System.out.print(
                "Mobile: "
        );

        String mobile =
                scanner.nextLine();

        System.out.print(
                "Address: "
        );

        String address =
                scanner.nextLine();

        String password;

        String confirmPassword;

        while (true) {

            System.out.print(
                    "Password: "
            );

            password =
                    scanner.nextLine();

            System.out.print(
                    "Confirm Password: "
            );

            confirmPassword =
                    scanner.nextLine();

            if (password.isEmpty()) {

                System.out.println(
                        "Password cannot be empty."
                );

                continue;
            }

            if (!password.equals(
                    confirmPassword)) {

                System.out.println(
                        "Passwords do not match. "
                                + "Please try again."
                );

                continue;
            }

            break;
        }

        Customer customer =
                new Customer(
                        customerId,
                        name,
                        email,
                        mobile,
                        address,
                        password
                );

        customerService.registerCustomer(
                customer
        );
    }

    private int readInt() {

        while (true) {

            try {

                String input =
                        scanner.nextLine();

                return Integer.parseInt(
                        input.trim()
                );

            } catch (NumberFormatException e) {

                System.out.print(
                        "Please enter a valid number: "
                );
            }
        }
    }
}
