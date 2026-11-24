 package application;

import repository.CustomerRepository;
import repository.OrderRepository;
import repository.ProductRepository;

import service.CartService;
import service.CustomerService;
import service.OrderService;
import service.ProductService;

public class Main {

    public static void main(String[] args) {

        ProductRepository productRepository =
                new ProductRepository();

        CustomerRepository customerRepository =
                new CustomerRepository();

        OrderRepository orderRepository =
                new OrderRepository();

        ProductService productService =
                new ProductService(
                        productRepository
                );

        CustomerService customerService =
                new CustomerService(
                        customerRepository
                );

        CartService cartService =
                new CartService(
                        productService,
                        customerService
                );

        OrderService orderService =
                new OrderService(
                        orderRepository,
                        customerService,
                        cartService
                );

        MainMenu mainMenu =
                new MainMenu(
                        productService,
                        customerService,
                        cartService,
                        orderService
                );

        mainMenu.start();
    }
}
