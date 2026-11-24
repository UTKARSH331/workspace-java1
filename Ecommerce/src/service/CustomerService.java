package service;

import java.util.List;

import exception.CustomerNotFoundException;
import models.Customer;
import repository.CustomerRepository;

public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(
            CustomerRepository repository) {

        this.repository = repository;
    }

    public void registerCustomer(
            Customer customer) {

        if (repository.findById(
                customer.getCustomerId()) != null) {

            throw new IllegalArgumentException(
                    "Customer ID already exists."
            );
        }

        if (customer.getPassword() == null
                || customer.getPassword()
                .trim()
                .isEmpty()) {

            throw new IllegalArgumentException(
                    "Password cannot be empty."
            );
        }

        repository.addCustomer(customer);

        System.out.println(
                "Customer registered successfully."
        );
    }

    public Customer login(
            int customerId,
            String password) {

        Customer customer =
                repository.findByLogin(
                        customerId,
                        password
                );

        if (customer == null) {

            throw new CustomerNotFoundException(
                    "Invalid Customer ID or password."
            );
        }

        return customer;
    }

    public Customer getCustomer(
            int customerId) {

        Customer customer =
                repository.findById(
                        customerId
                );

        if (customer == null) {

            throw new CustomerNotFoundException(
                    "Customer with ID "
                            + customerId
                            + " does not exist."
            );
        }

        return customer;
    }

    public List<Customer> getAllCustomers() {

        return repository.getAllCustomers();
    }

    public void updateName(
            int customerId,
            String name) {

        Customer customer =
                getCustomer(customerId);

        if (name == null
                || name.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Name cannot be empty."
            );
        }

        customer.setName(name);

        System.out.println(
                "Customer name updated successfully."
        );
    }

    public void updateEmail(
            int customerId,
            String email) {

        Customer customer =
                getCustomer(customerId);

        if (email == null
                || email.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Email cannot be empty."
            );
        }

        customer.setEmail(email);

        System.out.println(
                "Customer email updated successfully."
        );
    }

    public void updateMobile(
            int customerId,
            String mobile) {

        Customer customer =
                getCustomer(customerId);

        if (mobile == null
                || mobile.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Mobile cannot be empty."
            );
        }

        customer.setMobile(mobile);

        System.out.println(
                "Customer mobile updated successfully."
        );
    }

    public void updateAddress(
            int customerId,
            String address) {

        Customer customer =
                getCustomer(customerId);

        if (address == null
                || address.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Address cannot be empty."
            );
        }

        customer.setAddress(address);

        System.out.println(
                "Customer address updated successfully."
        );
    }

    public void updatePassword(
            int customerId,
            String currentPassword,
            String newPassword) {

        Customer customer =
                getCustomer(customerId);

        if (!customer.getPassword()
                .equals(currentPassword)) {

            throw new IllegalArgumentException(
                    "Current password is incorrect."
            );
        }

        if (newPassword == null
                || newPassword.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "New password cannot be empty."
            );
        }

        customer.setPassword(newPassword);

        System.out.println(
                "Password updated successfully."
        );
    }

    public void deleteCustomer(
            int customerId) {

        getCustomer(customerId);

        repository.deleteCustomer(
                customerId
        );

        System.out.println(
                "Customer deleted successfully."
        );
    }
}
