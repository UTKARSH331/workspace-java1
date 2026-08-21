
class PhonePay_17_04_2026 {
	
	 
	public void doSomething() {
		System.out.println("do Phone Pay ");
		 
	 }
	


class Paytm extends  PhonePay_17_04_2026{
	public void doSomething() {
		System.out.println("do Paytm");
	}
}
class Gpay extends Paytm{
	public void doSomething() {
		System.out.println("do Gpay ");
	}
}

 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gpay G1= new Gpay();	
		//G1.doSomething();
	}
	
}
	

	


