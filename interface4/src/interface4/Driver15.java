package interface4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate1 = (a) -> a<10;
		Supplier<Integer> supplier3 = () -> 1000+ new Random().nextInt(9800);
		System.out.println(supplier3.get());
		Consumer<Integer> consumer22 = (Email_id ) -> System.out.println(Email_id);
		consumer22.accept(121);
		Function<Integer, Integer> Sum11 = (amt) -> (amt) = amt - (amt*5/100);
		System.out.println(Sum11.apply(1000));

	}

}
