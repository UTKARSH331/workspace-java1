import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception3 {
	public static void main(String args[]) 
	{
		Exception3 filereader = new Exception3();
		filereader.readFile();
	}
	public void readFile() {
		String filename = "C:\\Users\\91735\\eclipse-workspace\\PracticeInterface\\src\\Sales_data.txt";
		
		
		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader(filename));
			String line;
			try {
				while((line = br.readLine()) != null)
				{
					System.out.println(line);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
}
