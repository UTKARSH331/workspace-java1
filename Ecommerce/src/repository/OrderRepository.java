package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import models.Order;

public class OrderRepository {

    private List<Order> orders =
            new ArrayList<>();

    public void save(Order order) {

        orders.add(order);
    }

    public List<Order> getAllOrders() {

        return orders;
    }

    public Order findById(int orderId) {

        return orders.stream()
                .filter(o ->
                        o.getOrderId()
                                == orderId)
                .findFirst()
                .orElse(null);
    }

    public List<Order> findByCustomerId(
            int customerId) {

        return orders.stream()
                .filter(o ->
                        o.getCustomerId()
                                == customerId)
                .collect(Collectors.toList());
    }
}
