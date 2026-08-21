package Exception.handling.src.checkedexception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("file.txt1"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
     
	}

}
// ClassCastexception 
