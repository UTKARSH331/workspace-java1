package interface4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverAccount2313 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		 Account231 acc2 = new Account231("Utk", 12345, "Btm");
		 ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("acc1.ser"));
         oos.writeObject(acc2);
         System.out.println("all are serialized ");
	}

}
