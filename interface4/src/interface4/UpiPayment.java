package interface4;

public class UpiPayment implements Ipayment, IRefund {

    @Override
    public void doSomething() {
        System.out.println("doSomething in UpiPayment");
    }

    public static void main(String[] args) {
        UpiPayment u1 = new UpiPayment();
        u1.doSomething();
    }
}