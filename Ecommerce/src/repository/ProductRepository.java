package repository;

import java.util.ArrayList;
import java.util.List;

import models.Product;

public class ProductRepository {

    private List<Product> products =
            new ArrayList<>();

    public void addProduct(Product product) {

        products.add(product);
    }

    public List<Product> getAllProducts() {

        return products;
    }

    public Product findById(int productId) {

        return products.stream()
                .filter(p ->
                        p.getProductId()
                                == productId)
                .findFirst()
                .orElse(null);
    }

    public void deleteProduct(
            int productId) {

        products.removeIf(
                p ->
                        p.getProductId()
                                == productId
        );
    }
}
