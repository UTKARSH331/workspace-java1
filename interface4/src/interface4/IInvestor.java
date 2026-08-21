package interface4;

public class IInvestor implements Cloneable{
	String name;
	int codeNo;
	IInvestor(String name, int codeNo){
		super();
		this.name = name;
		this.codeNo = codeNo;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Driver2 {
	public static void main(String args[]) throws CloneNotSupportedException {
		IInvestor I1 = new IInvestor("Utkarsh ", 110);
		IInvestor I2 = (IInvestor)I1.clone();
		System.out.println("I2.name " + I2.name + " " + I2.codeNo);
	}
}
