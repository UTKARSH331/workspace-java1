package models;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private String mobile;
    private String address;
    private String password;

    public Customer(
            int customerId,
            String name,
            String email,
            String mobile,
            String address,
            String password) {

        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        return "Customer ID : " + customerId +
                "\nName        : " + name +
                "\nEmail       : " + email +
                "\nMobile      : " + mobile +
                "\nAddress     : " + address;
    }
}
