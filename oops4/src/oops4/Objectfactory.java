package oops4;

public class Objectfactory {

    public static Object getObject(String name) {
        Object obj = null;

        if (name.equalsIgnoreCase("Employee")) {
            obj = new Employee();
        } 
        else if (name.equalsIgnoreCase("Manager")) {
            obj = new Manager();
        } 
        else {
            System.out.println("Invalid Type");
        }

        return obj;
    }
}

class Employee {
}

class Manager {
}

class Driver1 {
    public static void main(String[] args) {

        Object obj = Objectfactory.getObject("Employee");
        Manager mgr1 = (Manager) obj;
        

        System.out.println(obj);
    }
}