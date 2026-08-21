package interface4;

public class DriverAddUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddUm addSum = (a,b) -> {int result = (a+b);
		return result;};
		int result = addSum.add(10, 110);
		System.out.println(result);
	}

}
