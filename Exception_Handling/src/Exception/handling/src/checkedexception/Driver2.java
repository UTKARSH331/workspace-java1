package Exception.handling.src.checkedexception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File.txt"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
