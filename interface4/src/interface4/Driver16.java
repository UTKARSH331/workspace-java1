package interface4;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver16 {

	public static void main(String[] args, int amt) {
		// TODO Auto-generated method stub
		AllCalculatio all = (a,b) -> {int add = (a+b);};
		all.allCalculation(12, 10);
		AllCalculatio all1 = (x,y) -> {int sub = (x-y);};
		all1.allCalculation(12, 10);
		AllCalculatio all2 = (s,x) -> {int mul = (s*x);};
		all2.allCalculation(4, 7);
		AllCalculatio all3 = (x,y) -> {int power = (int) Math.pow(x, y);};
		all3.allCalculation(3, 2);
		
		
		Predicate<Integer> predicate = (a) -> a<1000;
		System.out.println(predicate.test(900));
		Supplier<Integer> supplier = () -> 1000 + new Random().nextInt(900);
		System.out.println(supplier.get());
		Consumer<Integer> consumer = (x) -> System.out.println(x);
		consumer.accept(supplier.get());
		int function2 = (amt ) = supplier.get()- (supplier.get() * 10/100);
		System.out.println(function2);
		Function<Integer, Integer> function1 = (amt1) -> (amt1) = amt1 - (amt1*10/100);
		System.out.println(function1.apply(10000));
		Supplier<LocalDateTime> LD = () -> LocalDateTime.now();
		System.out.println(LD.get());

	}
}
