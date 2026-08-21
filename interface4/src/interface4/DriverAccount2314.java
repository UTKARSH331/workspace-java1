package interface4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverAccount2314 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Account231 acc12 = new Account231("Utk", 121, "Btm");
		ObjectOutputStream oos1= new ObjectOutputStream(new FileOutputStream("acc12.ser"));
		oos1.writeObject(acc12);
		System.out.println("Drievr main() ...........acc12");

	}

}
