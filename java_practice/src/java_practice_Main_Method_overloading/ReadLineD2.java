package java_practice_Main_Method_overloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadLineD2 {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String  name = br.readLine();
		System.out.println(name);
	}

}
