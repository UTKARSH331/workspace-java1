
public class User1 {

	
		// TODO Auto-generated method stub
	//	int no = 10;main
	
		public int doSomething() {
         try {
        	 int no1 =20;
        	// System.out.println(no1);
        	 return no1;
         } finally {
        	 int no1 = 30;
        	// System.out.println(no1);
        	 return no1;
         }
		
	
		}
		public static void main(String[] args) {
			User1 u1 = new User1();
			System.out.println(u1.doSomething());
		}
}
