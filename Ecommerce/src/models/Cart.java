package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int customerId;
    private List<CartItem> items = new ArrayList<>();

    public Cart(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return items.stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

