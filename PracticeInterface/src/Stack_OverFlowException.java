public class Stack_OverFlowException {

    public static void main(String[] args) {
        Stack_OverFlowException s1 = new Stack_OverFlowException();
        s1.doSomething();
    }

    public void doSomething() {
        System.out.println("doSomething");
        doSomething1();
    }

    public void doSomething1() {
        System.out.println("doSomething1");
        doSomething();
    }
}