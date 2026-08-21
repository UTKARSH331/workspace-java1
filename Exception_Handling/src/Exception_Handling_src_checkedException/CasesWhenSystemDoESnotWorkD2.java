package Exception_Handling_src_checkedException;

public class CasesWhenSystemDoESnotWorkD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		try {
			System.out.println("trycalled");
			System.exit(0);
		} finally {
			System.out.println("finallyCalled");
		}

	}

}
