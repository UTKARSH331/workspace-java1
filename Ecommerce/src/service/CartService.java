package service;

import java.util.HashMap;
import java.util.Map;

import exception.InsufficientStockException;
import exception.InvalidQuantityException;
import exception.ProductNotFoundException;
import models.Cart;
import models.CartItem;
import models.Product;

public class CartService {

    private ProductService productService;
    private CustomerService customerService;

    private Map<Integer, Cart> carts =
            new HashMap<>();

    public CartService(
            ProductService productService,
            CustomerService customerService) {

        this.productService = productService;
        this.customerService = customerService;
    }

    private void validateCustomer(
            int customerId) {

        customerService.getCustomer(customerId);
    }

    private Cart getOrCreateCart(
            int customerId) {

        validateCustomer(customerId);

        if (!carts.containsKey(customerId)) {

            carts.put(
                    customerId,
                    new Cart(customerId)
            );
        }

        return carts.get(customerId);
    }

    public void addToCart(
            int customerId,
            int productId,
            int quantity) {

        if (quantity <= 0) {

            throw new InvalidQuantityException(
                    "Quantity must be greater than zero."
            );
        }

        Product product =
                productService.getProduct(productId);

        if (product.getQuantity() < quantity) {

            throw new InsufficientStockException(
                    "Only "
                            + product.getQuantity()
                            + " items available."
            );
        }

        Cart cart =
                getOrCreateCart(customerId);

        for (CartItem item :
                cart.getItems()) {

            if (item.getProduct()
                    .getProductId() == productId) {

                int newQuantity =
                        item.getQuantity()
                                + quantity;

                if (newQuantity >
                        product.getQuantity()) {

                    throw new InsufficientStockException(
                            "Requested quantity exceeds stock."
                    );
                }

                item.setQuantity(
                        newQuantity
                );

                System.out.println(
                        "Product quantity updated in cart."
                );

                return;
            }
        }

        cart.getItems().add(
                new CartItem(
                        product,
                        quantity
                )
        );

        System.out.println(
                "Product added to cart."
        );
    }

    public void removeFromCart(
            int customerId,
            int productId) {

        Cart cart =
                getOrCreateCart(customerId);

        boolean removed =
                cart.getItems()
                        .removeIf(
                                item ->
                                        item.getProduct()
                                                .getProductId()
                                                == productId
                        );

        if (!removed) {

            throw new ProductNotFoundException(
                    "Product is not available in cart."
            );
        }

        System.out.println(
                "Product removed from cart."
        );
    }

    public void updateQuantity(
            int customerId,
            int productId,
            int quantity) {

        if (quantity <= 0) {

            throw new InvalidQuantityException(
                    "Quantity must be greater than zero."
            );
        }

        Cart cart =
                getOrCreateCart(customerId);

        for (CartItem item :
                cart.getItems()) {

            if (item.getProduct()
                    .getProductId() == productId) {

                if (quantity >
                        item.getProduct().getQuantity()) {

                    throw new InsufficientStockException(
                            "Not enough stock."
                    );
                }

                item.setQuantity(quantity);

                System.out.println(
                        "Cart quantity updated."
                );

                return;
            }
        }

        throw new ProductNotFoundException(
                "Product is not available in cart."
        );
    }

    public Cart getCart(
            int customerId) {

        return getOrCreateCart(customerId);
    }

    public void clearCart(
            int customerId) {

        getOrCreateCart(customerId)
                .getItems()
                .clear();
    }
}
