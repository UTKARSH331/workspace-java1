package com.adapter.design.pattern.p2;
// // object creation accroding to Striver

interface PaymentGateway {
    void pay(String orderId, double amount);
}

// Adaptee
class RazorpayAPI {
    public void makePayment(String invoiceId, double amountInRupees) {
        System.out.println(
            "Paid Rs." + amountInRupees +
            " using Razorpay for invoice: " + invoiceId
        );
    }
}

// Adapter
class RazorpayAdapter implements PaymentGateway {

    private RazorpayAPI razorpayAPI;

    // Object created inside the constructor
    public RazorpayAdapter() {
        this.razorpayAPI = new RazorpayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        razorpayAPI.makePayment(orderId, amount);
    }
}

// Client
class CheckoutService {
    private PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String orderId, double amount) {
        paymentGateway.pay(orderId, amount);
    }
}

// Main
public class Main1 {
    public static void main(String[] args) {

        PaymentGateway adapter = new RazorpayAdapter();

        CheckoutService checkoutService =
            new CheckoutService(adapter);

        checkoutService.checkout("12", 1780);
    }
}

