package interface4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class  Driver34 {
	public static void main(String args[]) {
		Predicate<Integer> predicate = (a) -> a<100;
		System.out.println(predicate.test(80));
		System.out.println(predicate.test(232));
		System.out.println(predicate.test(11));
		Supplier<Integer> supplier = () -> 101;
		Supplier<String> supplier1 = () -> "Banglore";
		Supplier<Integer> supplier2 = () -> new Random().nextInt(9000);
		System.out.println(supplier.get());
		System.out.println(supplier1.get());
		System.out.println(supplier2.get());
		Consumer<Integer> consumer = (email_id) -> System.out.println(email_id);
		consumer.accept(343);
		consumer.accept(null);
		int a = 100;
		int consumer1 = 121;
		String conumer = "Arun";
		Consumer<String> consumer2 = (Email_Id) -> System.out.println(Email_Id);
		consumer2.accept("rajutkarsh545");
		Function<Integer, Integer> function2 = (amt) -> amt = amt - (amt*5/100);
		System.out.println(function2.apply(1000));
		Function<Integer, Integer> function33 = (amt) -> amt = amt - (amt*10/100);
		System.out.println(function33.apply(2000));
		Function<Integer, Integer> function23 = (amt) ->  amt = amt - (amt*5/100);
		System.out.println(function23.apply(3000));
		
		
	}

}
