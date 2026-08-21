import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader1 F1= new FileReader1();
		F1.readerFile();

	}
	public void readerFile() {
		String fileName = "C:\\Users\\91735\\eclipse-workspace\\PracticeInterface\\src\\Sales_data.txt";
		try {
			BufferedReader B1 = new BufferedReader(new java.io.FileReader(fileName));
			String line;
			try {
				while((line = B1.readLine() )!= null) {
					String lineArr[] = line.split(",");
					String city = lineArr[3];
					if(city.equals("Kodewala")) {
						System.out.println(line);
					}
					
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
