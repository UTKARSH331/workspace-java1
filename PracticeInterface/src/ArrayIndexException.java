import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FilterReader;
import java.io.IOException;

public class ArrayIndexException {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\91735\\Desktop\\Studies_2026"));
			System.out.println("Start main");
			String name = args[0];
			System.out.println("End main");
		} catch(ArrayIndexOutOfBoundsException e) {
			e.getStackTrace();
			System.out.println("(ArrayIndexOutOfBoundsException e");
		}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println("Exception e ");
		} finally {
			br.close();
			System.out.println("you are in finally ");
		}

	}

}
