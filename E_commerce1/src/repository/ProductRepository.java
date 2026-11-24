package repository;

import java.util.ArrayList;
import java.util.List;

import Models.Product;

public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	public void saveProducts(Product product) {
		products.add(product);
	}
	public List<Product > getAllProducts(){
		return products;
	}
	public Product findById(int productId) {
		return products.stream().filter(p -> p.getProductId() == productId).findFirst().orElse(null);
	}
	public void deleteById(int productId) {
		products.removeIf(p -> p.getProductId() == productId);
	}

}
