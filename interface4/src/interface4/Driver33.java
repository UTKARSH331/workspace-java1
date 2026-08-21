package interface4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = (a) -> a<100;
		System.out.println(predicate.test(80));
		System.out.println(predicate.test(120));
		Supplier<String > supplier1 = () -> "Banglore";
		System.out.println(supplier1.get());
		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(90000);
		System.out.println("your otp is : " + supplier2.get());
		Consumer<String > consumer = (email_Text) -> System.out.println("Email has been sent to  :" + email_Text);
		consumer.accept("rajutkarsh434@gmail.com" );
		Function<Integer, Integer> function = (amt) -> amt = amt-((amt*5)/100);
		function.apply(1000);
	}
}
