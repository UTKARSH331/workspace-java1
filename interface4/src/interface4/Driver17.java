package interface4;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Driver17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> LD = () -> LocalDateTime.now();
		System.out.println(LD.get());

	}

}
