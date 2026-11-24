package service;

import java.util.List;
import java.util.stream.Collectors;

import exception.InvalidQuantityException;
import exception.ProductNotFoundException;

import models.Product;

import repository.ProductRepository;

public class ProductService {

    private ProductRepository repository;

    public ProductService(
            ProductRepository repository) {

        this.repository = repository;
    }

    public void addProduct(
            Product product) {

        if (product.getQuantity() < 0) {

            throw new InvalidQuantityException(
                    "Quantity cannot be negative."
            );
        }

        if (product.getPrice() < 0) {

            throw new IllegalArgumentException(
                    "Price cannot be negative."
            );
        }

        if (repository.findById(
                product.getProductId()) != null) {

            throw new IllegalArgumentException(
                    "Product ID already exists."
            );
        }

        repository.addProduct(product);

        System.out.println(
                "Product added successfully."
        );
    }

    public List<Product> getAllProducts() {

        return repository.getAllProducts();
    }

    public Product getProduct(
            int productId) {

        Product product =
                repository.findById(productId);

        if (product == null) {

            throw new ProductNotFoundException(
                    "Product with ID "
                            + productId
                            + " does not exist."
            );
        }

        return product;
    }

    public List<Product> searchByName(
            String name) {

        return repository
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.getProductName()
                                        .toLowerCase()
                                        .contains(
                                                name.toLowerCase()
                                        )
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> searchByCategory(
            String category) {

        return repository
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.getCategory()
                                        .equalsIgnoreCase(
                                                category
                                        )
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> searchByBrand(
            String brand) {

        return repository
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.getBrand()
                                        .equalsIgnoreCase(
                                                brand
                                        )
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> searchByPriceRange(
            double min,
            double max) {

        if (min < 0 || max < 0) {

            throw new IllegalArgumentException(
                    "Price cannot be negative."
            );
        }

        if (min > max) {

            throw new IllegalArgumentException(
                    "Minimum price cannot be greater "
                            + "than maximum price."
            );
        }

        return repository
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.getPrice() >= min
                                        &&
                                p.getPrice() <= max
                )
                .collect(
                        Collectors.toList()
                );
    }

    public void updateProduct(
            Product updatedProduct) {

        Product product =
                getProduct(
                        updatedProduct.getProductId()
                );

        if (updatedProduct.getQuantity()
                < 0) {

            throw new InvalidQuantityException(
                    "Quantity cannot be negative."
            );
        }

        if (updatedProduct.getPrice()
                < 0) {

            throw new IllegalArgumentException(
                    "Price cannot be negative."
            );
        }

        product.setProductName(
                updatedProduct.getProductName()
        );

        product.setCategory(
                updatedProduct.getCategory()
        );

        product.setPrice(
                updatedProduct.getPrice()
        );

        product.setQuantity(
                updatedProduct.getQuantity()
        );

        product.setBrand(
                updatedProduct.getBrand()
        );

        System.out.println(
                "Product updated successfully."
        );
    }

    public void deleteProduct(
            int productId) {

        getProduct(productId);

        repository.deleteProduct(
                productId
        );

        System.out.println(
                "Product deleted successfully."
        );
    }
}
