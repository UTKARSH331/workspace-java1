package interface4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DriverAccount231 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Account231 acc = new Account231("Utk", 1213, "Btm_Layout");
	    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc12.ser"));
	    oos.writeObject(acc);
	    System.out.println("Driver main() serialzation Done.....");
	}

}
