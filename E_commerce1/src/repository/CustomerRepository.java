package repository;

import java.util.ArrayList;
import java.util.List;

import Models.Customer;

public class CustomerRepository {
       private List<Customer > customers = new ArrayList<>();

	public void addCustomer (Customer customer) {
		//super();
		 customers.add(customer);
	}
	public List<Customer> getAllCustomers(){
		return customers;
	}
	public Customer findById(int customerId) {
		return customers.stream().filter(c -> c.getCustomerId() == customerId).findFirst().orElse(null);
	}
	public Customer findByIdandPassword(int customerId, String password) {
		return customers.stream().filter(c -> c.getCustomerId() == customerId && c.getPassword() == password).findFirst().orElse(null);
	}
	public void deleteCustomerId(int customerId) {
		customers.removeIf(c -> c.getCustomerId() == customerId);
	}
	
       
}
