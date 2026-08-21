
public class NullPointerExceprion_D2 {
	public static void main(String[] args) {
		try {
               String name = null;
               System.out.println("NullPOinterException " + name.length());
		}  catch (NullPointerException e){
			System.out.println("its come in null pointer Exception ");
			e.printStackTrace();
			System.out.println("After e.printStackTrace()");
		}
		
	}

}
