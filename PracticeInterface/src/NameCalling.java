
public class NameCalling {
	public static void main(String args[]) {
		String name = null;
		try {
			System.out.println(name.length());
			
		} catch (Exception e)
		{
			name = "Utkarsh Raj";
		  e.getStackTrace();	
		}
	}

}
