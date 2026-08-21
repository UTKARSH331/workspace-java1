package autoclosable.Exception.Handling.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("main.txt")); ){
			System.out.println("autocloseable ois in try block ");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
