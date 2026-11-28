package com.adapter.design.pattern.p4;
// object creation accroding to CA

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

    // Receives an existing object through constructor
    public RazorpayAdapter(RazorpayAPI api) {
        this.razorpayAPI = api;
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
public class Main {
    public static void main(String[] args) {

        // Create Adaptee object outside
        RazorpayAPI razorpayAPI = new RazorpayAPI();

        // Pass Adaptee object to Adapter
        PaymentGateway adapter =
            new RazorpayAdapter(razorpayAPI);

        // Pass Adapter to Client
        CheckoutService checkoutService =
            new CheckoutService(adapter);

        checkoutService.checkout("12", 1780);
    }
}

