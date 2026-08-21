package interface4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver2Account231 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));	// TODO Auto-generated method stub
    Account231 ac1 = (Account231)  ois.readObject();
    System.out.println( "ac1.account " +ac1.getAddress());
    System.out.println( ac1.Email_Id +"ac1.getName()");
    System.out.println( "" +ac1.getName());
	}

}
