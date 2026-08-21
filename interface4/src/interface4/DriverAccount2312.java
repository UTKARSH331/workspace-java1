package interface4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.io.OutputStream;

public class DriverAccount2312 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Account231 ac1  = new Account231("acc.ser" , 123, "Btm");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		oos.writeObject(ac1);
		System.out.println("Driver main serialization ");
			
	}

}
