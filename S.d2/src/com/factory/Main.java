package com.factory;

//Logistic Interface
interface Logistics {
 void send();
}

//Class implementing the Logistics Interface
class Road implements Logistics {
 @Override
 public void send() {
     System.out.println("Sending by road logic");
 }
}

//Class implementing the Logistics Interface
class Air implements Logistics {
 @Override
 public void send() {
     System.out.println("Sending by air logic");
 }
}

//Factory Class taking care of Logistics
class LogisticsFactory {
 public static Logistics getLogistics(String mode) {
     if (mode.equalsIgnoreCase("Air")) {
         return new Air();
     } else if (mode.equalsIgnoreCase("Road")) {
         return new Road();
     }
     throw new IllegalArgumentException("Unknown logistics mode: " + mode);
 }
}

//Class implementing the Logistics Services
/*
class LogisticsService {
    public void send(String mode) {
         
        desired object based on the mode 
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}
 
class Main {
    public static void main(String[] args) {
        LogisticsService service = new LogisticsService();
        service.send("Air");
        service.send("Road");
    }
}

*/
//Driver Code
class Main {
 public static void main(String[] args) {
	 
	 LogisticsFactory l1 = new LogisticsFactory();
	 Logistics service =  l1.getLogistics("Air");
	 Logistics service1 = l1.getLogistics("Road");
     service.send();
     service1.send();
 }
}