package application;

import java.util.List;
import java.util.Scanner;

import models.Cart;
import models.Customer;
import models.Order;
import models.OrderStatus;
import models.Product;

import service.CartService;
import service.CustomerService;
import service.OrderService;
import service.ProductService;

public class AdminMenu {

    private ProductService productService;
    private CustomerService customerService;
    private CartService cartService;
    private OrderService orderService;

    private Scanner scanner;

    public AdminMenu(
            ProductService productService,
            CustomerService customerService,
            CartService cartService,
            OrderService orderService) {

        this.productService = productService;
        this.customerService = customerService;
        this.cartService = cartService;
        this.orderService = orderService;

        scanner = new Scanner(System.in);
    }

    public void start() {

        boolean running = true;

        while (running) {

            printMenu();

            int choice = readInt();

            try {

                switch (choice) {

                    case 1:

                        addProduct();

                        break;

                    case 2:

                        viewAllProducts();

                        break;

                    case 3:

                        viewProduct();

                        break;

                    case 4:

                        updateProduct();

                        break;

                    case 5:

                        deleteProduct();

                        break;

                    case 6:

                        viewAllCustomers();

                        break;

                    case 7:

                        viewCustomer();

                        break;

                    case 8:

                        updateCustomer();

                        break;

                    case 9:

                        deleteCustomer();

                        break;

                    case 10:

                        viewAllOrders();

                        break;

                    case 11:

                        viewOrder();

                        break;

                    case 12:

                        updateOrderStatus();

                        break;

                    case 13:

                        cancelOrder();

                        break;

                    case 14:

                        searchProducts();

                        break;

                    case 0:

                        running = false;

                        System.out.println(
                                "Returning to main menu..."
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
    }

    private void printMenu() {

        System.out.println();
        System.out.println(
                "=========================================="
        );

        System.out.println(
                "              ADMIN MENU"
        );

        System.out.println(
                "=========================================="
        );

        System.out.println(
                "PRODUCT MANAGEMENT"
        );

        System.out.println(
                "1. Add Product"
        );

        System.out.println(
                "2. View All Products"
        );

        System.out.println(
                "3. View Product"
        );

        System.out.println(
                "4. Update Product"
        );

        System.out.println(
                "5. Delete Product"
        );

        System.out.println();

        System.out.println(
                "CUSTOMER MANAGEMENT"
        );

        System.out.println(
                "6. View All Customers"
        );

        System.out.println(
                "7. View Customer"
        );

        System.out.println(
                "8. Update Customer"
        );

        System.out.println(
                "9. Delete Customer"
        );

        System.out.println();

        System.out.println(
                "ORDER MANAGEMENT"
        );

        System.out.println(
                "10. View All Orders"
        );

        System.out.println(
                "11. View Order"
        );

        System.out.println(
                "12. Update Order Status"
        );

        System.out.println(
                "13. Cancel Order"
        );

        System.out.println();

        System.out.println(
                "14. Search Products"
        );

        System.out.println(
                "0. Back"
        );

        System.out.println(
                "=========================================="
        );

        System.out.print(
                "Enter your choice: "
        );
    }

    // ==========================================
    // PRODUCT MANAGEMENT
    // ==========================================

    private void addProduct() {

        System.out.println();
        System.out.println(
                "---------- ADD PRODUCT ----------"
        );

        System.out.print(
                "Product ID: "
        );

        int productId = readInt();

        System.out.print(
                "Product Name: "
        );

        String productName =
                scanner.nextLine();

        System.out.print(
                "Category: "
        );

        String category =
                scanner.nextLine();

        System.out.print(
                "Price: "
        );

        double price = readDouble();

        System.out.print(
                "Quantity: "
        );

        int quantity = readInt();

        System.out.print(
                "Brand: "
        );

        String brand =
                scanner.nextLine();

        Product product =
                new Product(
                        productId,
                        productName,
                        category,
                        price,
                        quantity,
                        brand
                );

        productService.addProduct(
                product
        );
    }

    private void viewAllProducts() {

        System.out.println();
        System.out.println(
                "---------- ALL PRODUCTS ----------"
        );

        List<Product> products =
                productService.getAllProducts();

        if (products.isEmpty()) {

            System.out.println(
                    "No products available."
            );

            return;
        }

        for (Product product : products) {

            System.out.println();
            System.out.println(product);

            System.out.println(
                    "------------------------------------------"
            );
        }
    }

    private void viewProduct() {

        System.out.print(
                "Enter Product ID: "
        );

        int productId = readInt();

        Product product =
                productService.getProduct(
                        productId
                );

        System.out.println();
        System.out.println(product);
    }

    private void updateProduct() {

        System.out.print(
                "Enter Product ID: "
        );

        int productId = readInt();

        productService.getProduct(
                productId
        );

        System.out.print(
                "New Product Name: "
        );

        String productName =
                scanner.nextLine();

        System.out.print(
                "New Category: "
        );

        String category =
                scanner.nextLine();

        System.out.print(
                "New Price: "
        );

        double price = readDouble();

        System.out.print(
                "New Quantity: "
        );

        int quantity = readInt();

        System.out.print(
                "New Brand: "
        );

        String brand =
                scanner.nextLine();

        Product updatedProduct =
                new Product(
                        productId,
                        productName,
                        category,
                        price,
                        quantity,
                        brand
                );

        productService.updateProduct(
                updatedProduct
        );
    }

    private void deleteProduct() {

        System.out.print(
                "Enter Product ID: "
        );

        int productId = readInt();

        System.out.print(
                "Are you sure? (Y/N): "
        );

        String confirmation =
                scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {

            productService.deleteProduct(
                    productId
            );

        } else {

            System.out.println(
                    "Product deletion cancelled."
            );
        }
    }

    private void searchProducts() {

        System.out.println();
        System.out.println(
                "---------- SEARCH PRODUCTS ----------"
        );

        System.out.println(
                "1. Search by Name"
        );

        System.out.println(
                "2. Search by Category"
        );

        System.out.println(
                "3. Search by Brand"
        );

        System.out.println(
                "4. Search by Price Range"
        );

        System.out.println(
                "0. Back"
        );

        System.out.print(
                "Choice: "
        );

        int choice = readInt();

        List<Product> products = null;

        switch (choice) {

            case 1:

                System.out.print(
                        "Enter product name: "
                );

                products =
                        productService.searchByName(
                                scanner.nextLine()
                        );

                break;

            case 2:

                System.out.print(
                        "Enter category: "
                );

                products =
                        productService.searchByCategory(
                                scanner.nextLine()
                        );

                break;

            case 3:

                System.out.print(
                        "Enter brand: "
                );

                products =
                        productService.searchByBrand(
                                scanner.nextLine()
                        );

                break;

            case 4:

                System.out.print(
                        "Minimum price: "
                );

                double min = readDouble();

                System.out.print(
                        "Maximum price: "
                );

                double max = readDouble();

                products =
                        productService.searchByPriceRange(
                                min,
                                max
                        );

                break;

            case 0:

                return;

            default:

                System.out.println(
                        "Invalid choice."
                );

                return;
        }

        displayProducts(products);
    }

    private void displayProducts(
            List<Product> products) {

        System.out.println();

        if (products == null
                || products.isEmpty()) {

            System.out.println(
                    "No products found."
            );

            return;
        }

        for (Product product : products) {

            System.out.println(product);

            System.out.println(
                    "------------------------------------------"
            );
        }
    }

    // ==========================================
    // CUSTOMER MANAGEMENT
    // ==========================================

    private void viewAllCustomers() {

        System.out.println();
        System.out.println(
                "---------- ALL CUSTOMERS ----------"
        );

        List<Customer> customers =
                customerService.getAllCustomers();

        if (customers.isEmpty()) {

            System.out.println(
                    "No customers registered."
            );

            return;
        }

        for (Customer customer : customers) {

            System.out.println();
            System.out.println(customer);

            System.out.println(
                    "------------------------------------------"
            );
        }
    }

    private void viewCustomer() {

        System.out.print(
                "Enter Customer ID: "
        );

        int customerId = readInt();

        Customer customer =
                customerService.getCustomer(
                        customerId
                );

        System.out.println();
        System.out.println(customer);
    }

    private void updateCustomer() {

        System.out.print(
                "Enter Customer ID: "
        );

        int customerId = readInt();

        customerService.getCustomer(
                customerId
        );

        System.out.println();

        System.out.println(
                "1. Update Name"
        );

        System.out.println(
                "2. Update Email"
        );

        System.out.println(
                "3. Update Mobile"
        );

        System.out.println(
                "4. Update Address"
        );

        System.out.println(
                "0. Back"
        );

        System.out.print(
                "Choice: "
        );

        int choice = readInt();

        switch (choice) {

            case 1:

                System.out.print(
                        "New name: "
                );

                customerService.updateName(
                        customerId,
                        scanner.nextLine()
                );

                break;

            case 2:

                System.out.print(
                        "New email: "
                );

                customerService.updateEmail(
                        customerId,
                        scanner.nextLine()
                );

                break;

            case 3:

                System.out.print(
                        "New mobile: "
                );

                customerService.updateMobile(
                        customerId,
                        scanner.nextLine()
                );

                break;

            case 4:

                System.out.print(
                        "New address: "
                );

                customerService.updateAddress(
                        customerId,
                        scanner.nextLine()
                );

                break;

            case 0:

                break;

            default:

                System.out.println(
                        "Invalid choice."
                );
        }
    }

    private void deleteCustomer() {

        System.out.print(
                "Enter Customer ID: "
        );

        int customerId = readInt();

        System.out.print(
                "Are you sure? (Y/N): "
        );

        String confirmation =
                scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {

            customerService.deleteCustomer(
                    customerId
            );

        } else {

            System.out.println(
                    "Customer deletion cancelled."
            );
        }
    }

    // ==========================================
    // ORDER MANAGEMENT
    // ==========================================

    private void viewAllOrders() {

        System.out.println();
        System.out.println(
                "---------- ALL ORDERS ----------"
        );

        List<Order> orders =
                orderService.getAllOrders();

        if (orders.isEmpty()) {

            System.out.println(
                    "No orders available."
            );

            return;
        }

        for (Order order : orders) {

            System.out.println();
            System.out.println(order);

            System.out.println(
                    "------------------------------------------"
            );
        }
    }

    private void viewOrder() {

        System.out.print(
                "Enter Order ID: "
        );

        int orderId = readInt();

        Order order =
                orderService.getOrder(
                        orderId
                );

        System.out.println();
        System.out.println(order);

        System.out.println();
        System.out.println(
                "Order Items:"
        );

        order.getItems().forEach(
                item ->
                        System.out.println(item)
        );
    }

    private void updateOrderStatus() {

        System.out.print(
                "Enter Order ID: "
        );

        int orderId = readInt();

        orderService.getOrder(
                orderId
        );

        System.out.println();

        System.out.println(
                "1. CONFIRMED"
        );

        System.out.println(
                "2. SHIPPED"
        );

        System.out.println(
                "3. DELIVERED"
        );

        System.out.println(
                "4. CANCELLED"
        );

        System.out.print(
                "Select new status: "
        );

        int choice = readInt();

        OrderStatus status;

        switch (choice) {

            case 1:

                status =
                        OrderStatus.CONFIRMED;

                break;

            case 2:

                status =
                        OrderStatus.SHIPPED;

                break;

            case 3:

                status =
                        OrderStatus.DELIVERED;

                break;

            case 4:

                status =
                        OrderStatus.CANCELLED;

                break;

            default:

                System.out.println(
                        "Invalid status."
                );

                return;
        }

        if (status == OrderStatus.CANCELLED) {

            orderService.cancelOrder(
                    orderId
            );

        } else {

            orderService.updateOrderStatus(
                    orderId,
                    status
            );
        }
    }

    private void cancelOrder() {

        System.out.print(
                "Enter Order ID: "
        );

        int orderId = readInt();

        System.out.print(
                "Are you sure you want to cancel "
                        + "this order? (Y/N): "
        );

        String confirmation =
                scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {

            orderService.cancelOrder(
                    orderId
            );

        } else {

            System.out.println(
                    "Order cancellation cancelled."
            );
        }
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

    private double readDouble() {

        while (true) {

            try {

                String input =
                        scanner.nextLine();

                return Double.parseDouble(
                        input.trim()
                );

            } catch (NumberFormatException e) {

                System.out.print(
                        "Please enter a valid amount: "
                );
            }
        }
    }
}
