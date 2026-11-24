package application;

import java.util.List;
import java.util.Scanner;

import models.Cart;
import models.CartItem;
import models.Order;
import models.Product;

import service.CartService;
import service.CustomerService;
import service.OrderService;
import service.ProductService;

public class CustomerMenu {

    private ProductService productService;
    private CustomerService customerService;
    private CartService cartService;
    private OrderService orderService;

    private Scanner scanner;

    public CustomerMenu(
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

    public void start(int customerId) {

        boolean running = true;

        while (running) {

            printMenu(customerId);

            int choice = readInt();

            try {

                switch (choice) {

                    case 1:

                        viewProducts();

                        break;

                    case 2:

                        searchProducts();

                        break;

                    case 3:

                        addToCart(customerId);

                        break;

                    case 4:

                        viewCart(customerId);

                        break;

                    case 5:

                        updateCartQuantity(
                                customerId
                        );

                        break;

                    case 6:

                        removeFromCart(
                                customerId
                        );

                        break;

                    case 7:

                        clearCart(customerId);

                        break;

                    case 8:

                        placeOrder(customerId);

                        break;

                    case 9:

                        viewOrderHistory(
                                customerId
                        );

                        break;

                    case 10:

                        viewOrder();

                        break;

                    case 11:

                        updateProfile(
                                customerId
                        );

                        break;

                    case 0:

                        running = false;

                        System.out.println(
                                "Logged out successfully."
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

    private void printMenu(
            int customerId) {

        System.out.println();

        System.out.println(
                "=========================================="
        );

        System.out.println(
                "           CUSTOMER OPERATIONS"
        );

        System.out.println(
                "Customer ID: "
                        + customerId
        );

        System.out.println(
                "=========================================="
        );

        System.out.println(
                "1. View Products"
        );

        System.out.println(
                "2. Search Products"
        );

        System.out.println(
                "3. Add to Cart"
        );

        System.out.println(
                "4. View Cart"
        );

        System.out.println(
                "5. Update Cart Quantity"
        );

        System.out.println(
                "6. Remove from Cart"
        );

        System.out.println(
                "7. Clear Cart"
        );

        System.out.println(
                "8. Place Order"
        );

        System.out.println(
                "9. View Order History"
        );

        System.out.println(
                "10. View Order"
        );

        System.out.println(
                "11. Update Profile"
        );

        System.out.println(
                "0. Logout"
        );

        System.out.println(
                "=========================================="
        );

        System.out.print(
                "Enter your choice: "
        );
    }

    private void viewProducts() {

        System.out.println();

        System.out.println(
                "---------- AVAILABLE PRODUCTS ----------"
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

                double min =
                        readDouble();

                System.out.print(
                        "Maximum price: "
                );

                double max =
                        readDouble();

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

    private void addToCart(
            int customerId) {

        System.out.print(
                "Enter Product ID: "
        );

        int productId = readInt();

        System.out.print(
                "Enter Quantity: "
        );

        int quantity = readInt();

        cartService.addToCart(
                customerId,
                productId,
                quantity
        );
    }

    private void viewCart(
            int customerId) {

        System.out.println();

        System.out.println(
                "---------- MY CART ----------"
        );

        Cart cart =
                cartService.getCart(
                        customerId
                );

        if (cart.isEmpty()) {

            System.out.println(
                    "Your cart is empty."
            );

            return;
        }

        for (CartItem item :
                cart.getItems()) {

            System.out.println(item);
        }

        System.out.println();

        System.out.println(
                "Total Amount: ₹"
                        + cart.getTotalAmount()
        );
    }

    private void updateCartQuantity(
            int customerId) {

        System.out.print(
                "Enter Product ID: "
        );

        int productId = readInt();

        System.out.print(
                "Enter New Quantity: "
        );

        int quantity = readInt();

        cartService.updateQuantity(
                customerId,
                productId,
                quantity
        );
    }

    private void removeFromCart(
            int customerId) {

        System.out.print(
                "Enter Product ID: "
        );

        int productId = readInt();

        cartService.removeFromCart(
                customerId,
                productId
        );
    }

    private void clearCart(
            int customerId) {

        System.out.print(
                "Are you sure you want to "
                        + "clear your cart? (Y/N): "
        );

        String confirmation =
                scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {

            cartService.clearCart(
                    customerId
            );

            System.out.println(
                    "Cart cleared successfully."
            );

        } else {

            System.out.println(
                    "Cart clearing cancelled."
            );
        }
    }

    private void placeOrder(
            int customerId) {

        Cart cart =
                cartService.getCart(
                        customerId
                );

        if (cart.isEmpty()) {

            System.out.println(
                    "Your cart is empty."
            );

            return;
        }

        System.out.println();

        System.out.println(
                "---------- ORDER SUMMARY ----------"
        );

        for (CartItem item :
                cart.getItems()) {

            System.out.println(item);
        }

        System.out.println();

        System.out.println(
                "Total Amount: ₹"
                        + cart.getTotalAmount()
        );

        System.out.print(
                "Confirm order? (Y/N): "
        );

        String confirmation =
                scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {

            Order order =
                    orderService.placeOrder(
                            customerId
                    );

            System.out.println();

            System.out.println(
                    "Order placed successfully."
            );

            System.out.println(order);

        } else {

            System.out.println(
                    "Order placement cancelled."
            );
        }
    }

    private void viewOrderHistory(
            int customerId) {

        System.out.println();

        System.out.println(
                "---------- ORDER HISTORY ----------"
        );

        List<Order> orders =
                orderService
                        .getOrdersByCustomer(
                                customerId
                        );

        if (orders.isEmpty()) {

            System.out.println(
                    "No orders found."
            );

            return;
        }

        for (Order order :
                orders) {

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

        for (CartItem item :
                order.getItems()) {

            System.out.println(item);
        }
    }

    private void updateProfile(
            int customerId) {

        boolean running = true;

        while (running) {

            System.out.println();

            System.out.println(
                    "---------- UPDATE PROFILE ----------"
            );

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
                    "5. Change Password"
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

                case 5:

                    changePassword(
                            customerId
                    );

                    break;

                case 0:

                    running = false;

                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }
        }
    }

    private void changePassword(
            int customerId) {

        System.out.print(
                "Current Password: "
        );

        String currentPassword =
                scanner.nextLine();

        System.out.print(
                "New Password: "
        );

        String newPassword =
                scanner.nextLine();

        System.out.print(
                "Confirm New Password: "
        );

        String confirmPassword =
                scanner.nextLine();

        if (!newPassword.equals(
                confirmPassword)) {

            System.out.println(
                    "New passwords do not match."
            );

            return;
        }

        customerService.updatePassword(
                customerId,
                currentPassword,
                newPassword
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
