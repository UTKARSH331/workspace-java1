
public class String_12_07_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = new String("java");
		String s6 = "Javascript"; 
		
		String s3 = s2.intern();
		String s4 = "java";
		String s5 = new String("Jvascript"); // created in heap 
       System.out.println(s3);
       System.out.println(s2);
       System.out.println(s1);
       System.out.println(s3);
       System.out.println(s5);
       System.out.println(s1 == s2);
       System.out.println(s3 == s4);
       System.out.println(s5 == "Jvascript" ); // here Javascript is created in scp and in upper it is in heap
       System.out.println(s6 == "Javascript"); // it refrenced the same object that is created previously in s5 "Javascript";
	}

}
