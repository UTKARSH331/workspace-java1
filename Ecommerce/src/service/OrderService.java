package service;

import java.util.ArrayList;
import java.util.List;

import exception.InsufficientStockException;
import exception.InvalidOrderStateException;
import models.Cart;
import models.CartItem;
import models.Order;
import models.OrderStatus;
import repository.OrderRepository;

public class OrderService {

    private OrderRepository orderRepository;
    private CustomerService customerService;
    private CartService cartService;

    private int orderSequence = 1000;

    public OrderService(
            OrderRepository orderRepository,
            CustomerService customerService,
            CartService cartService) {

        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.cartService = cartService;
    }

    public Order placeOrder(int customerId) {

        customerService.getCustomer(
                customerId
        );

        Cart cart =
                cartService.getCart(
                        customerId
                );

        if (cart.isEmpty()) {

            throw new InvalidOrderStateException(
                    "Cannot place order. Cart is empty."
            );
        }

        for (CartItem item :
                cart.getItems()) {

            if (item.getQuantity()
                    > item.getProduct()
                    .getQuantity()) {

                throw new InsufficientStockException(
                        "Insufficient stock for "
                                + item.getProduct()
                                .getProductName()
                );
            }
        }

        for (CartItem item :
                cart.getItems()) {

            int availableQuantity =
                    item.getProduct()
                            .getQuantity();

            int orderedQuantity =
                    item.getQuantity();

            item.getProduct().setQuantity(
                    availableQuantity
                            - orderedQuantity
            );
        }

        int orderId =
                ++orderSequence;

        List<CartItem> orderItems =
                new ArrayList<>(
                        cart.getItems()
                );

        double totalAmount =
                cart.getTotalAmount();

        Order order =
                new Order(
                        orderId,
                        customerId,
                        orderItems,
                        totalAmount
                );

        orderRepository.save(order);

        cartService.clearCart(
                customerId
        );

        System.out.println(
                "Order placed successfully."
        );

        return order;
    }

    public List<Order> getAllOrders() {

        return orderRepository.getAllOrders();
    }

    public List<Order> getOrdersByCustomer(
            int customerId) {

        customerService.getCustomer(
                customerId
        );

        return orderRepository
                .findByCustomerId(
                        customerId
                );
    }

    public Order getOrder(int orderId) {

        Order order =
                orderRepository.findById(
                        orderId
                );

        if (order == null) {

            throw new InvalidOrderStateException(
                    "Order with ID "
                            + orderId
                            + " does not exist."
            );
        }

        return order;
    }

    public void updateOrderStatus(
            int orderId,
            OrderStatus status) {

        Order order =
                getOrder(orderId);

        if (order.getOrderStatus()
                == OrderStatus.CANCELLED) {

            throw new InvalidOrderStateException(
                    "Cancelled order cannot be updated."
            );
        }

        if (order.getOrderStatus()
                == OrderStatus.DELIVERED) {

            throw new InvalidOrderStateException(
                    "Delivered order cannot be updated."
            );
        }

        order.setOrderStatus(status);

        System.out.println(
                "Order status updated successfully."
        );
    }

    public void cancelOrder(
            int orderId) {

        Order order =
                getOrder(orderId);

        if (order.getOrderStatus()
                == OrderStatus.CANCELLED) {

            throw new InvalidOrderStateException(
                    "Order is already cancelled."
            );
        }

        if (order.getOrderStatus()
                == OrderStatus.DELIVERED) {

            throw new InvalidOrderStateException(
                    "Delivered order cannot be cancelled."
            );
        }

        /*
         * Return ordered quantity to stock
         * when an order is cancelled.
         */
        for (CartItem item :
                order.getItems()) {

            int currentStock =
                    item.getProduct()
                            .getQuantity();

            int returnedQuantity =
                    item.getQuantity();

            item.getProduct().setQuantity(
                    currentStock
                            + returnedQuantity
            );
        }

        order.setOrderStatus(
                OrderStatus.CANCELLED
        );

        System.out.println(
                "Order cancelled successfully."
        );
    }
}
