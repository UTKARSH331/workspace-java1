package com.String.exp10;

public class QueryConstructor extends Object {
	
	Object obj = new Object();
	
	public static String Query = "Slect * from employee";
	/**
	 * @param empId
	 * @param salary
	 * @return
	 */
	public  String constructorQuery(String empId, int salary) {
		StringBuilder finalQuery = new StringBuilder(Query);
		if(empId != null) {
			finalQuery.append("where empId =" + empId);
		} else if (salary > 0) {
			finalQuery.append("where salary > " + salary);
		}
		finalQuery.append(";");
		return finalQuery.toString();
	}
}

 /*
	
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryConstructor queryConstructor = new QueryConstructor();
		String query = queryConstructor.constructorQuery(null, 0);
		System.out.println(query);
	}

}


} */


