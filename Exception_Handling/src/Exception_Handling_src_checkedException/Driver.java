package Exception_Handling_src_checkedException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File.txt"));
			//oos.writeObject(oos);
			
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
