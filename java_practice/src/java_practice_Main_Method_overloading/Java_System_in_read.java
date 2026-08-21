package java_practice_Main_Method_overloading;

import java.io.IOException;

public class Java_System_in_read {
	public static void main(String args[]) throws IOException {
		
		int x = System.in.read();
		System.out.println("X + System.in.read " + (char)x);
	}
}
